package com.spacex.tracker.view.ui.view;

import static com.spacex.tracker.utils.Constants.MISSION_DATA;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.ViewModelProvider;

import com.bumptech.glide.Glide;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.spacex.tracker.R;
import com.spacex.tracker.databinding.ActivityLaunchDetailBinding;
import com.spacex.tracker.utils.DateHelper;
import com.spacex.tracker.view.model.LaunchSites;
import com.spacex.tracker.view.model.Launches;
import com.spacex.tracker.view.model.Links;
import com.spacex.tracker.view.model.Rocket;
import com.spacex.tracker.viewmodel.ViewModel;

import java.lang.reflect.Type;
import java.text.ParseException;

@SuppressWarnings("ConstantConditions")
public class LaunchDetailActivity extends AppCompatActivity {

    private ActivityLaunchDetailBinding binding;
    private Launches launches;

    private ViewModel viewModel;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getIntentData();
        binding = ActivityLaunchDetailBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        if (null == launches) {
            finish();
            return;
        }

        if (null != launches) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setTitle(launches.getMission_name());

            viewModel = new ViewModelProvider(this).get(ViewModel.class);
        }
    }

    @Override
    protected void onPostCreate(@Nullable Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        setLaunchData();
    }

    private void getIntentData() {
        if (getIntent().hasExtra(MISSION_DATA)) {
            String data = getIntent().getStringExtra(MISSION_DATA);
            if ((null != data) && (!data.isEmpty())) {
                Gson gson = new Gson();
                Type launchType = new TypeToken<Launches>() {
                }.getType();
                launches = gson.fromJson(data, launchType);
            }
        }
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            onBackPressed();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }

    private void setLaunchData() {
        if (null != launches) {
            showMissionDetails();
            showRocketDetails();
            showLaunchDetails();
            showLinks();
        }
    }

    private void showMissionDetails() {

        if (!launches.getMission_id().isEmpty()) {
            viewModel.getMissions(launches.getMission_id().get(0)).observe(this, missions -> {
                String description = missions.getDescription();
                if ((description != null) && !description.isEmpty()) {
                    binding.missionDetail.tvMissionDesc.setText(description);
                }
            });
        } else {
            if (launches.getDetails() != null) {
                binding.missionDetail.tvMissionDesc.setText(launches.getDetails());
            }
        }

        if (launches.getMission_name() != null) {
            binding.missionDetail.tvMissionName.setText(launches.getMission_name());
        }

        try {
            binding.missionDetail.tvLaunchDate.setText(
                    formattedString(
                            getString(R.string.text_launch_date),
                            DateHelper.getDateTime(launches.getLaunch_date_utc())
                    )
            );

        } catch (ParseException ex) {
            ex.printStackTrace();
        }

        setLaunchPatchImage(launches.getLinks().getMission_patch());
    }

    private void setLaunchPatchImage(String imageUrl) {
        if ((null != imageUrl) && !imageUrl.isEmpty()) {
            Glide.with(LaunchDetailActivity.this)
                    .load(imageUrl)
                    .placeholder(R.mipmap.ic_launcher)
                    .into(binding.missionDetail.ivMissionPatchLarge);
        }
    }

    private void showRocketDetails() {
        if (null != launches.getRocket()) {
            Rocket rocketData = launches.getRocket();

            if ((null != rocketData.getRocket_name()) && (!rocketData.getRocket_name().isEmpty())) {
                binding.rocketDetails.tvRocketName.setText(
                        formattedString(getString(R.string.text_name), rocketData.getRocket_name())
                );
            }

            if ((null != rocketData.getRocket_type()) && (!rocketData.getRocket_type().isEmpty())) {
                binding.rocketDetails.tvRocketType.setText(
                        formattedString(getString(R.string.text_type), rocketData.getRocket_type())
                );
            }

            viewModel.getRocketDetails(rocketData.getRocket_id()).observe(this, rocketDetails -> {
                String description = rocketDetails.getDescription();
                if ((null != description) && !description.isEmpty()) {
                    binding.rocketDetails.tvRocketDesc.setText(description);
                }
            });
        }
    }

    private void showLaunchDetails() {
        if (null != launches.isLaunch_success()) {
            binding.launchDetails.tvLaunchStatus.setText(
                    formattedString(getString(R.string.text_status),
                            launches.isLaunch_success() ? getString(R.string.text_success) : formattedString(getString(R.string.text_failure_reason), launches.getLaunch_failure_details().getReason()))
            );
            binding.launchDetails.tvLaunchStatus.setTextColor(ContextCompat.getColor(this, launches.isLaunch_success() ? R.color.green : R.color.red));
        } else {
            binding.launchDetails.tvLaunchStatus.setText(
                    formattedString(getString(R.string.text_status), getString(R.string.text_upcoming))
            );
            binding.launchDetails.tvLaunchStatus.setTextColor(ContextCompat.getColor(this, R.color.gray));
        }


        if (null != launches.getLaunch_site()) {
            LaunchSites site = launches.getLaunch_site();
            String name = "";
            if (!site.getSite_name_long().isEmpty()) {
                name = site.getSite_name_long();
            } else if (!site.getSite_name().isEmpty()) {
                name = site.getSite_name();
            } else {
                name = site.getSite_id();
            }
            binding.launchDetails.tvLaunchSite.setText(
                    formattedString(getString(R.string.text_launch_site), name)
            );
        }

        binding.launchDetails.tvLaunchWindow.setText(
                formattedString(getString(R.string.text_launch_window), "" + launches.getLaunch_window())
        );
    }

    private void showLinks() {
        if (null != launches.getLinks()) {
            Links links = launches.getLinks();

            if (null != links.getReddit_campaign()) {
                View generatedView = inflateLinearLayoutView(getString(R.string.text_campaign), links.getReddit_campaign());
                binding.layoutLinks.llLinks.addView(generatedView);
            }

            if (null != links.getReddit_launch()) {
                View generatedView = inflateLinearLayoutView(getString(R.string.text_launch), links.getReddit_launch());
                binding.layoutLinks.llLinks.addView(generatedView);
            }

            if (null != links.getReddit_recovery()) {
                View generatedView = inflateLinearLayoutView(getString(R.string.text_recovery), links.getReddit_recovery());
                binding.layoutLinks.llLinks.addView(generatedView);
            }

            if (null != links.getReddit_media()) {
                View generatedView = inflateLinearLayoutView(getString(R.string.text_media), links.getReddit_media());
                binding.layoutLinks.llLinks.addView(generatedView);
            }

            if (null != links.getPresskit()) {
                View generatedView = inflateLinearLayoutView(getString(R.string.text_press_kit), links.getPresskit());
                binding.layoutLinks.llLinks.addView(generatedView);
            }

            if (null != links.getArticle_link()) {
                View generatedView = inflateLinearLayoutView(getString(R.string.text_article), links.getArticle_link());
                binding.layoutLinks.llLinks.addView(generatedView);
            }

            if (null != links.getWikipedia()) {
                View generatedView = inflateLinearLayoutView(getString(R.string.text_wikipedia), links.getWikipedia());
                binding.layoutLinks.llLinks.addView(generatedView);
            }

            if (null != links.getVideo_link()) {
                View generatedView = inflateLinearLayoutView(getString(R.string.text_youtube), links.getVideo_link());
                binding.layoutLinks.llLinks.addView(generatedView);
            }
        }
    }

    private View inflateLinearLayoutView(String key, String value) {
        View view = LayoutInflater.from(this).inflate(R.layout.item_links, null);
        AppCompatTextView textView = view.findViewById(R.id.tv_link);
        textView.setText(formattedString(key, value));
        return view;
    }

    private String formattedString(String key, String value) {
        return String.format(key, value);
    }

}

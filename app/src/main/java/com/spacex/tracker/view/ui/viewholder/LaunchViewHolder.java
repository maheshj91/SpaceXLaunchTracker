package com.spacex.tracker.view.ui.viewholder;

import android.text.TextUtils;

import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.spacex.tracker.R;
import com.spacex.tracker.databinding.ItemLaunchesBinding;
import com.spacex.tracker.utils.DateHelper;
import com.spacex.tracker.view.dao.db.SharedPref;
import com.spacex.tracker.view.model.Launches;

import java.text.ParseException;

public class LaunchViewHolder extends RecyclerView.ViewHolder {

    private final ItemLaunchesBinding binding;
    private String flightNumber;

    public LaunchViewHolder(@NonNull ItemLaunchesBinding binding) {
        super(binding.getRoot());
        this.binding = binding;

        binding.ivBookmark.setOnClickListener(v -> {
            v.setSelected(!v.isSelected());
            if (v.isSelected()) {
                SharedPref.write(flightNumber, flightNumber);
            } else {
                SharedPref.remove(flightNumber);
            }
        });
    }

    public void bind(Launches launch) {
        this.flightNumber = "" + launch.getFlight_number();
        binding.ivBookmark.setSelected(false);
        String bookmark = SharedPref.read(flightNumber, "0");
        if (!bookmark.isEmpty()) {
            if (TextUtils.isDigitsOnly(bookmark)) {
                if (bookmark.equals("" + launch.getFlight_number())) {
                    binding.ivBookmark.setSelected(true);
                }
            }
        }

        if (launch.getMission_name() != null) {
            binding.tvMissionName.setText(String.format(itemView.getContext().getString(R.string.text_mission), launch.getMission_name()));
        }

        if (launch.getRocket() != null) {
            if (launch.getRocket().getRocket_name() != null)
                binding.tvRocketName.setText(String.format(itemView.getContext().getString(R.string.text_rocket), launch.getRocket().getRocket_name()));
        }

        String imageUrl = launch.getLinks().getMission_patch_small();
        if (null != imageUrl) {
            if (!TextUtils.isEmpty(imageUrl.trim())) {
                showImage(launch.getLinks().getMission_patch_small());
            }
        }
        if (null != launch.isLaunch_success()) {
            binding.tvLaunchStatus.setText(
                    String.format(itemView.getContext().getString(R.string.text_status),
                            itemView.getContext().getString(launch.isLaunch_success() ? R.string.text_success : R.string.text_failure))
            );
            binding.tvLaunchStatus.setTextColor(ContextCompat.getColor(itemView.getContext(), launch.isLaunch_success() ? R.color.green : R.color.red));
        } else {
            binding.tvLaunchStatus.setText(
                    String.format(itemView.getContext().getString(R.string.text_status),
                            itemView.getContext().getString(R.string.text_upcoming))
            );
            binding.tvLaunchStatus.setTextColor(ContextCompat.getColor(itemView.getContext(), R.color.gray));
        }

        try {
            binding.tvLaunchDate.setText(
                    String.format(
                            itemView.getContext().getString(R.string.text_launch_date),
                            DateHelper.getDateTime(launch.getLaunch_date_utc())
                    )
            );
        } catch (ParseException ex) {
            ex.printStackTrace();
        }

    }

    private void showImage(String imageUrl) {
        Glide.with(itemView.getContext()).load(imageUrl)
                .placeholder(R.mipmap.ic_launcher)
                .into(binding.ivMissionPatchSmall);
    }
}

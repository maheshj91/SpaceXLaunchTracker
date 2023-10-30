package com.spacex.tracker.view.ui.adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;

import com.spacex.tracker.databinding.ItemLaunchesBinding;
import com.spacex.tracker.view.model.Launches;
import com.spacex.tracker.view.ui.viewholder.LaunchViewHolder;

public class LaunchAdapter extends ListAdapter<Launches, LaunchViewHolder> {

    // creating a variable for on item click listener.
    private OnItemClickListener listener;

    // creating a constructor class for our adapter class.
    public LaunchAdapter() {
        super(DIFF_CALLBACK);
    }

    @NonNull
    @Override
    public LaunchViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new LaunchViewHolder(ItemLaunchesBinding.inflate(LayoutInflater.from(parent.getContext())));
    }

    @Override
    public void onBindViewHolder(@NonNull LaunchViewHolder holder, int position) {
        holder.bind(getItem(position));
        holder.itemView.setOnClickListener(v -> {
            // inside on click listener we are passing
            // position to our item of recycler view.
            int position1 = holder.getAdapterPosition();
            if (listener != null && position1 != RecyclerView.NO_POSITION) {
                listener.onItemClick(getItem(position1));
            }
        });

    }

    // creating a call back for item of recycler view.
    private static final DiffUtil.ItemCallback<Launches> DIFF_CALLBACK = new DiffUtil.ItemCallback<Launches>() {
        @Override
        public boolean areItemsTheSame(Launches oldItem, Launches newItem) {
            return oldItem.getFlight_number() == newItem.getFlight_number();
        }

        @Override
        public boolean areContentsTheSame(Launches oldItem, Launches newItem) {
            // below line is to check the course name, description and course duration.
            return oldItem.getMission_name().equals(newItem.getMission_name());
        }
    };

    public interface OnItemClickListener {
        void onItemClick(Launches launches);
    }

    public void setOnItemClickListener(OnItemClickListener listener) {
        this.listener = listener;
    }
}

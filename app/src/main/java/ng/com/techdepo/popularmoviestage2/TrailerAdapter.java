package ng.com.techdepo.popularmoviestage2;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

import ng.com.techdepo.popularmoviestage2.callbacks.TrailerAdapterCallback;
import ng.com.techdepo.popularmoviestage2.movie_model.Trailer;

/**
 * Created by ESIDEM jnr on 5/8/2017.
 */

public class TrailerAdapter extends RecyclerView.Adapter<TrailerAdapter.ViewHolder> {

    private final ArrayList<Trailer> trailers;
    private final TrailerAdapterCallback adapterCallback;

    public TrailerAdapter(ArrayList<Trailer> trailers, TrailerAdapterCallback callback) {
        this.trailers = trailers;
        this.adapterCallback = callback;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.trailer_item, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Trailer trailer = trailers.get(position);
        holder.trailer = trailer;
        holder.trailerName.setText(trailer.getName());
    }

    @Override
    public int getItemCount() {
        return trailers.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        Trailer trailer;
        final TextView trailerName;

        ViewHolder(View itemView) {
            super(itemView);
            trailerName = (TextView) itemView.findViewById(R.id.trailer_name);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    adapterCallback.onItemClickListener(trailer.getKey());
                }
            });
        }

    }
}

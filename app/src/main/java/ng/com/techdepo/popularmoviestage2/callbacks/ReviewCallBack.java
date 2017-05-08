package ng.com.techdepo.popularmoviestage2.callbacks;

import ng.com.techdepo.popularmoviestage2.movie_model.Review;

/**
 * Created by ESIDEM jnr on 5/8/2017.
 */

public interface ReviewCallBack {
    void updateAdapter(Review[] reviews);
}

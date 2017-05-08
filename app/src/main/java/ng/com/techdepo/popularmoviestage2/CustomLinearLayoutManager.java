package ng.com.techdepo.popularmoviestage2;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;

/**
 * Created by ESIDEM jnr on 5/8/2017.
 */

public class CustomLinearLayoutManager extends LinearLayoutManager {

    public CustomLinearLayoutManager(Context context, int orientation, boolean reverseLayout) {
        super(context, orientation, reverseLayout);
    }

    @Override
    public boolean canScrollVertically() {
        return false;
    }
}

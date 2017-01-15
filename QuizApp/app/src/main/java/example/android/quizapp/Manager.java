package example.android.quizapp;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;

/**
 * Created by Onur on 14.01.2017.
 */

public class Manager extends LinearLayoutManager {
    private boolean isScrollEnabled = false;
    public Manager(Context context) {
        super(context);
    }

    public Manager(Context context, int orientation, boolean reverseLayout) {
        super(context, orientation, reverseLayout);
    }

    public void setScrollEnabled(boolean flag) {
        this.isScrollEnabled = flag;
    }

    @Override
    public boolean canScrollHorizontally() {
        return isScrollEnabled && super.canScrollHorizontally();
    }

}

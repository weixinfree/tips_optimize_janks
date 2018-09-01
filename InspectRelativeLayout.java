package xx;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ViewParent;
import android.widget.RelativeLayout;

/**
 * Created by wangwei on 2018/2/26.
 */

public class InspectRelativeLayout extends RelativeLayout {

    private static final String TAG = "InspectRelativeLayout";


    public InspectRelativeLayout(Context context) {
        this(context, null);
    }

    public InspectRelativeLayout(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public InspectRelativeLayout(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);

    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        Log.e(TAG, "onMeasure() called with: widthMeasureSpec = [" + widthMeasureSpec + "], heightMeasureSpec = [" + heightMeasureSpec + "]");
    }

    @Override
    protected void onLayout(boolean changed, int l, int t, int r, int b) {
        super.onLayout(changed, l, t, r, b);
        Log.e(TAG, "onLayout() called with: changed = [" + changed + "], l = [" + l + "], t = [" + t + "], r = [" + r + "], b = [" + b + "]");
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Log.e(TAG, "onDraw() called with: canvas = [" + canvas + "]");
    }

    @Override
    protected void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        Log.e(TAG, "dispatchDraw() called with: canvas = [" + canvas + "]");
    }

    @Override
    public void requestLayout() {
        Log.e(TAG, "requestLayout() called", new RuntimeException("TRACE_REQUEST_LAYOUT"));
        super.requestLayout();
    }


    @Override
    public ViewParent invalidateChildInParent(int[] location, Rect dirty) {
        Log.e(TAG, "invalidateChildInParent() called with: location = [" + location + "], dirty = [" + dirty + "]");
        return super.invalidateChildInParent(location, dirty);
    }
}

package customfonts;

import android.content.Context;
import android.util.AttributeSet;


public class MyTextView extends android.support.v7.widget.AppCompatTextView {

    public MyTextView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init();
    }

    public MyTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public MyTextView(Context context) {
        super(context);
        init();
    }

    private void init() {
        if (!isInEditMode()) {
//            Typeface tf = Typeface.createFromAsset(getContext().getAssets(), "montserrat.ttf");
//            setTypeface(tf);
        }
    }

}
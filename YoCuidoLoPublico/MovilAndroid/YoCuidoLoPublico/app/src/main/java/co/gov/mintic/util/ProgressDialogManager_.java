//
// DO NOT EDIT THIS FILE, IT HAS BEEN GENERATED USING AndroidAnnotations.
//


package co.gov.mintic.util;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.util.Log;
import android.view.View;

public final class ProgressDialogManager_
    extends ProgressDialogManager
{

    private Context context_;
    private Handler handler_ = new Handler();

    private ProgressDialogManager_(Context context) {
        context_ = context;
        init_();
    }

    public void afterSetContentView_() {
        if (!(context_ instanceof Activity)) {
            return ;
        }
    }

    /**
     * You should check that context is an activity before calling this method
     * 
     */
    public View findViewById(int id) {
        Activity activity_ = ((Activity) context_);
        return activity_.findViewById(id);
    }

    @SuppressWarnings("all")
    private void init_() {
        if (context_ instanceof Activity) {
            Activity activity = ((Activity) context_);
        }
        if (context_ instanceof Activity) {
            activity = ((Activity) context_);
        }
    }

    public static ProgressDialogManager_ getInstance_(Context context) {
        return new ProgressDialogManager_(context);
    }

    public void rebind(Context context) {
        context_ = context;
        init_();
    }

    @Override
    public void dismiss() {
        handler_.post(new Runnable() {


            @Override
            public void run() {
                try {
                    ProgressDialogManager_.super.dismiss();
                } catch (RuntimeException e) {
                    Log.e("ProgressDialogManager_", "A runtime exception was thrown while executing code in a runnable", e);
                }
            }

        }
        );
    }

    @Override
    public void show() {
        handler_.post(new Runnable() {


            @Override
            public void run() {
                try {
                    ProgressDialogManager_.super.show();
                } catch (RuntimeException e) {
                    Log.e("ProgressDialogManager_", "A runtime exception was thrown while executing code in a runnable", e);
                }
            }

        }
        );
    }

}
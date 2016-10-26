package libs.demo.medge.com.androidmusthavelibs;

import com.squareup.leakcanary.LeakCanary;
import com.squareup.leakcanary.RefWatcher;

import android.app.Application;

public class MyApplication extends Application {

    private static RefWatcher refWatcher; // leakCanary "memory watcher"

    @Override
    public void onCreate() {
        super.onCreate();
        if (LeakCanary.isInAnalyzerProcess(this)) {
            // This process is dedicated to LeakCanary for heap analysis.
            // You should not init your app in this process.
            return;
        }
        refWatcher = LeakCanary.install(this);
        // go on with app init..
    }

    public static RefWatcher getRefWatcher() {
        return refWatcher;
    }
}


package libs.demo.medge.com.androidmusthavelibs;

import org.greenrobot.eventbus.EventBus;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class EventBusPubService extends Service {

    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        EventBus.getDefault().register(this);
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        // notify user state chqnge to activity
        EventBus.getDefault().post(new EventBusUserEvent("Sam", "NY", 44.33f));
        return Service.START_STICKY;
    }
}

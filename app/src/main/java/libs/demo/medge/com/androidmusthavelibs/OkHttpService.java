package libs.demo.medge.com.androidmusthavelibs;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

import java.io.IOException;

import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class OkHttpService extends Service {

    private static final String JSOT_STR = "TODO";
    private static final String PEER_URL = "TODO";

    public OkHttpService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        new Thread() { // TODO replace with smarter threading model (Executer?)
            @Override
            public void run() {
                sendRequestToServer(true);
            }
        }.start();
        sendRequestToServer(true);
        return Service.START_STICKY;
    }

    private String sendRequestToServer(boolean getMode) {
        OkHttpClient client = new OkHttpClient();
        Request request;
        Response response;

        if (getMode) {
            request = new Request.Builder()
                        .url(PEER_URL)
                        .build();
        }
        else {
            // pose
            MediaType JSON = MediaType.parse("application/json; charset=utf-8");
            RequestBody body = RequestBody.create(JSON, JSOT_STR);
            request = new Request.Builder()
                    .url(PEER_URL)
                    .post(body)
                    .build();
        }
        try {
            response = client.newCall(request).execute();
            return response.body().string();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}

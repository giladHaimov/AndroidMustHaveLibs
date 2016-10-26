package libs.demo.medge.com.androidmusthavelibs;

import com.squareup.leakcanary.RefWatcher;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class LeakCanaryActivity extends AppCompatActivity {

    private String[] nameArr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_leak_canary);
        nameArr = new String[1024]; // allocate memory
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        RefWatcher refWatcher = MyApplication.getRefWatcher();
        refWatcher.watch(nameArr); // verify allocated memory indeed reclaimed
    }
}

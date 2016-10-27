package libs.demo.medge.com.androidmusthavelibs;

import com.activeandroid.query.Select;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class ActiveAndroidActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_active_android);
    }

    @Override
    protected void onStart() {
        super.onStart();
        // db write
        ActiveAndroidUserModel usr =
                new ActiveAndroidUserModel("Dave", "2342423", "NY", 28);
        usr.save();

        // and read
        ActiveAndroidUserModel result = new Select()
                .from(ActiveAndroidUserModel.class)
                .where("name = ?", usr.getName())
                .orderBy("Age")
                .executeSingle();

    }
}

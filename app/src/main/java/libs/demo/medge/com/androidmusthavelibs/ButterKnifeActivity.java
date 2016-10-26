package libs.demo.medge.com.androidmusthavelibs;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;

import butterknife.BindColor;
import butterknife.BindDimen;
import butterknife.BindDrawable;
import butterknife.BindString;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class ButterKnifeActivity extends AppCompatActivity {

    // View binding
    @BindView(R.id.button)
    Button actionBtn;
    @BindView(R.id.textView)
    TextView caption;
    @BindView(R.id.textView2)
    TextView action;
    @BindView(R.id.seekBar)
    SeekBar humidityLevel;

    // Resource binding
    @BindString(R.string.action_settings)
    String settings;
    @BindDrawable(R.drawable.bt_logo)
    Drawable logo;
    @BindColor(R.color.colorAccent)
    int accentColor;
    @BindDimen(R.dimen.fab_margin)
    Float margins;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_butter_knife);
        ButterKnife.bind(this);

        //from here - can access binded fields:

        caption.setText("NY");
        caption.setBackgroundColor(accentColor);
    }

    @OnClick(R.id.button)
    public void onActionPerformed(View view) {
        action.setText("Button clicked!");
    }
}

package libs.demo.medge.com.androidmusthavelibs;

import com.squareup.picasso.Picasso;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

public class PicassoActivity extends AppCompatActivity {

    private static final int TARGET_WIDTH = 120;
    private static final int TARGET_HEIGHT = 120;
    private static final String IMG_URL = "http://i.imgur.com/DvpvklR.png";

    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_picasso);
        imageView = (ImageView) findViewById(R.id.imageView);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Picasso.with(this)
                .load(IMG_URL)
                .resize(TARGET_WIDTH, TARGET_HEIGHT)
                .centerCrop()
                .placeholder(R.drawable.placeholder)
                .error(R.drawable.dowload_failed)
                .into(imageView);
    }
}

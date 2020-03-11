package demo.test.krona;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;

import com.github.chrisbanes.photoview.PhotoView;

public class Hands extends AppCompatActivity  {

    PhotoView imageView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hands);
        imageView1 = findViewById(R.id.img111111);
        imageView1.setImageResource(R.drawable.hands);
    }
}

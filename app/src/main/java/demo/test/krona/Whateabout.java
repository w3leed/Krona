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

public class Whateabout extends AppCompatActivity  {
    PhotoView imageView1,imageView12;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_whateabout);
        imageView1 = findViewById(R.id.img1);
        imageView1.setImageResource(R.drawable.whatis1);
        imageView12 = findViewById(R.id.img12);
        imageView12.setImageResource(R.drawable.whatis2);
    }}
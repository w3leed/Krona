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

public class Advise extends AppCompatActivity {


    PhotoView imageView1,imageView2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_advise);
        imageView1 = findViewById(R.id.img112);
        imageView2 = findViewById(R.id.img222);
        imageView1.setImageResource(R.drawable.advese111111);
        imageView2.setImageResource(R.drawable.advis3);
    }}
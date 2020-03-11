package demo.test.krona;


import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.github.chrisbanes.photoview.PhotoView;

public class Adap extends AppCompatActivity {


    PhotoView photoView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adap);
        //imageView1=findViewById(R.id.photo_view);
        photoView = (PhotoView) findViewById(R.id.photo_vieww);
        photoView.setImageResource(R.drawable.adap);


    }

}

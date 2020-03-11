package demo.test.krona;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Recycler extends AppCompatActivity implements View.OnClickListener {

    CardView mycard  ,mycartware, mycarthelp;
    Intent i ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.item_view);

        mycard = findViewById(R.id.card_one);
        mycard.setOnClickListener(this);

        mycartware=findViewById(R.id.card_two);
        mycartware.setOnClickListener(this);

        mycarthelp=findViewById(R.id.card_three);
        mycarthelp.setOnClickListener(this);


    }


    @Override
    public void onClick(View v) {



            if (v == findViewById(R.id.card_one)) {
                String url = "https://www.facebook.com/new.human.359";

                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }

            if (v == findViewById(R.id.card_two)) {
                String url = "https://www.facebook.com/profile.php?id=100007118144994";

                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }


            if (v == findViewById(R.id.card_three)) {

                String url = "https://www.facebook.com/alahlawymohamed74";

                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }


    }
}

package demo.test.krona;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.GridView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
   /* GridView gridView;
    ArrayList<Item> items;
    MyAdapter myAdapter;*/
   Button button1,button2,button3,button4,button5,button6,button7,button8,button9,button10,button11;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1=findViewById(R.id.btn1);
        button2=findViewById(R.id.btn2);
        button3=findViewById(R.id.btn3);
        button4=findViewById(R.id.btn4);
        button5=findViewById(R.id.btn5);
       // button6=findViewById(R.id.btn6);
        button7=findViewById(R.id.btn7);
        button8=findViewById(R.id.btn8);
        button9=findViewById(R.id.btn9);
        button10=findViewById(R.id.btn10);
        button11=findViewById(R.id.btn11);


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(MainActivity.this,Whateabout.class));
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(MainActivity.this,Arrad.class));
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(MainActivity.this,Howtopass.class));
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(MainActivity.this,Prevent.class));
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(MainActivity.this,Hands.class));
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(MainActivity.this,Adap.class));
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(MainActivity.this,Child.class));
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(MainActivity.this,Advise.class));
            }
        });
        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(MainActivity.this,Help.class));
            }
        });
        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(MainActivity.this,Recycler.class));
            }
        });







        // getItem();
       /* gridView = findViewById(R.id.grid);
        myAdapter = new MyAdapter(this, items);
        gridView.setAdapter(myAdapter);*/
        /*myAdapter.setOncatagoyItem(new MyAdapter.OncatagoyItem() {
            @Override
            public void oncatagoyitem(Item item, long postion) {
                if (item.getId() == 0) {


                }
            }
        });*/

    }

   /* private void getItem() {
        items = new ArrayList<>();
        items.add(new Item("فيرس كرونا", R.drawable.qrona, 0));
        items.add(new Item("الاعراض", R.drawable.qrona, 1));
        items.add(new Item("طرق العضوى", R.drawable.qrona, 2));
        items.add(new Item("مواجهة المرض", R.drawable.qrona, 3));
        items.add(new Item("الوقاية من المرض", R.drawable.qrona, 4));


    }*/
}
package com.example.practical_3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText a,b;
    Button add,div,multi,minus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        a=findViewById(R.id.first);
        b=findViewById(R.id.second);

        add=findViewById(R.id.Add);
        div=findViewById(R.id.div);
        multi=findViewById(R.id.multi);
        minus=findViewById(R.id.minus);


        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int f= Integer.parseInt(a.getText().toString());
                int s= Integer.parseInt(b.getText().toString());

                int t=f+s;
                Toast.makeText(MainActivity.this,"Addition="+t,Toast.LENGTH_LONG).show();
            }
        });

        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int f= Integer.parseInt(a.getText().toString());
                int s= Integer.parseInt(b.getText().toString());

                int t=f-s;
                Toast.makeText(MainActivity.this,"Minus="+t,Toast.LENGTH_LONG).show();
            }
        });

        multi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int f= Integer.parseInt(a.getText().toString());
                int s= Integer.parseInt(b.getText().toString());

                int t=f*s;
                Toast.makeText(MainActivity.this,"Multi="+t,Toast.LENGTH_LONG).show();
            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int f= Integer.parseInt(a.getText().toString());
                int s= Integer.parseInt(b.getText().toString());

                int t=f/s;

                Toast.makeText(MainActivity.this,"Divison="+t,Toast.LENGTH_LONG).show();
            }
        });

    }
}
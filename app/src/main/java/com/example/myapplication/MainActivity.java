package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends Activity {
    int cont = 0;

    EditText edmin, edmax;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button mybutton = findViewById(R.id.button);
        TextView tv= findViewById(R.id.textView);
        edmin.findViewById(R.id.min);
        edmax.findViewById(R.id.max);
        mybutton.setText("Click");
        mybutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Button b = (Button) view;
                Random random = new Random();

                int nmin = Integer.parseInt(edmin.getText().toString());
                int nmax = Integer.parseInt(edmax.getText().toString());
                tv.setText(Integer.toString(random.nextInt(nmax-nmin+1)+nmin));



            }
        });
    }
}
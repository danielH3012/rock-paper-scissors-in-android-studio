package com.example.lotre;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.os.Bundle;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {


TextView hasilkomp;
Button button, button2, button3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    hasilkomp = (TextView) findViewById(R.id.hasilkomp);
    button = (Button) findViewById(R.id.button);



        button.setOnClickListener(new View.OnClickListener(){
            public void onClick(View View){
                String[] gkb = {"gunting", "kertas", "batu"};
                Random rn = new Random();
                int arr = rn.nextInt(3);
                if(arr == 0){
                    Toast.makeText(MainActivity.this, "seri", Toast.LENGTH_LONG).show();
                }else if(arr == 1){
                    Toast.makeText(MainActivity.this, "menang", Toast.LENGTH_LONG).show();
                }else if(arr == 2){
                    Toast.makeText(MainActivity.this, "kalah", Toast.LENGTH_LONG).show();
                }
            }

        });



        button2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View View){
                String[] gkb = {"gunting", "kertas", "batu"};
                Random rn = new Random();
                int arr = rn.nextInt(3);
                if(arr == 0){
                    Toast.makeText(MainActivity.this, "kalah", Toast.LENGTH_LONG).show();
                }else if(arr == 1){
                    Toast.makeText(MainActivity.this, "seri", Toast.LENGTH_LONG).show();
                }else if(arr == 2){
                    Toast.makeText(MainActivity.this, "menang", Toast.LENGTH_LONG).show();
                }
            }

        });


        button3.setOnClickListener(new View.OnClickListener(){
            public void onClick(View View){
                String[] gkb = {"gunting", "kertas", "batu"};
                Random rn = new Random();
                int arr = rn.nextInt(3);
                if(arr == 0){
                    Toast.makeText(MainActivity.this, "menang", Toast.LENGTH_LONG).show();
                }else if(arr == 1){
                    Toast.makeText(MainActivity.this, "kalah", Toast.LENGTH_LONG).show();
                }else if(arr == 2){
                    Toast.makeText(MainActivity.this, "seri", Toast.LENGTH_LONG).show();
                }
            }

        });
    }}



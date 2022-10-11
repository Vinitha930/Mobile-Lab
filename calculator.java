package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView t1,t2;
    EditText e1, e2;
    Button b1,b2,b3,b4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1=(EditText) findViewById(R.id.ed1);
        e2=(EditText) findViewById(R.id.ed3);
        b1=(Button) findViewById(R.id.bt1);
        b2=(Button) findViewById(R.id.bt2);
        b3=(Button) findViewById(R.id.bt3);
        b4=(Button) findViewById(R.id.bt4);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1= e1.getText().toString();
                String s2= e2.getText().toString();
                int x=Integer.parseInt(s1);
                int y=Integer.parseInt(s2);
                int z= x+y;
                String s3= String.valueOf(z);
                Toast.makeText(getApplicationContext(),"Sum :"+s3,Toast.LENGTH_SHORT).show();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1= e1.getText().toString();
                String s2= e2.getText().toString();
                int x=Integer.parseInt(s1);
                int y=Integer.parseInt(s2);
                int z= x-y;
                String s3= String.valueOf(z);
                Toast.makeText(getApplicationContext(),"Difference :"+s3,Toast.LENGTH_SHORT).show();
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1= e1.getText().toString();
                String s2= e2.getText().toString();
                int x=Integer.parseInt(s1);
                int y=Integer.parseInt(s2);
                int z= x*y;
                String s3= String.valueOf(z);
                Toast.makeText(getApplicationContext(),"Product :"+s3,Toast.LENGTH_SHORT).show();
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1= e1.getText().toString();
                String s2= e2.getText().toString();
                int x=Integer.parseInt(s1);
                int y=Integer.parseInt(s2);
                if(y!= 0) {
                    int z = x / y;
                    String s3 = String.valueOf(z);
                    Toast.makeText(getApplicationContext(), "Quotient :" + s3, Toast.LENGTH_SHORT).show();
                }
                else
                    Toast.makeText(getApplicationContext(),"enter a value other than zero",Toast.LENGTH_SHORT).show();
            }
        });
    }
}

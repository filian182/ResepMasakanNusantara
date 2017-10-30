package com.plankton.resepmasakannusantara;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Set the content of the activity to use the activity_main.xml layout file

        Button button1=(Button)findViewById(R.id.button1);
        Button button2=(Button)findViewById(R.id.button2);
        Button button3=(Button)findViewById(R.id.button3);


        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbarMain);
        setSupportActionBar(toolbar);
        toolbar.setTitle(getResources().getString(R.string.app_name));



        button1.setOnClickListener(new View.OnClickListener() {

            public void onClick(View daftar) {

                // TODO Auto-generated method stub

                Intent i =new Intent(getApplicationContext(),SecondActivity.class);

                startActivity(i);

            }

        });

        button2.setOnClickListener(new View.OnClickListener() {

            public void onClick(View profil) {

                // TODO Auto-generated method stub

                Intent i =new Intent(getApplicationContext(),Profil.class);

                startActivity(i);

            }

        });

        button3.setOnClickListener(new View.OnClickListener(){
            public void onClick(View about)
            {
                // TODO Auto-generated method stub

                Intent i =new Intent(getApplicationContext(),About.class);

                startActivity(i);

            }

        });


    }}



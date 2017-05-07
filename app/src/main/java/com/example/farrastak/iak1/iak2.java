package com.example.farrastak.iak1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class iak2 extends AppCompatActivity {

    Button tombol;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iak2);

        tombol = (Button) findViewById(R.id.BtnMasuk);

        tombol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i ;
                i = new Intent(iak2.this,  MainActivity.class);
                startActivity(i);
            }
        });
    }
}

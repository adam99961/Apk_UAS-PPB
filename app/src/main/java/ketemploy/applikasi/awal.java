package ketemploy.applikasi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class awal extends AppCompatActivity {
  Button hitung,exit,about;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_awal);

        hitung = (Button) findViewById(R.id.hitung);
        exit = (Button) findViewById(R.id.exit);
        about = (Button) findViewById(R.id.about);

        hitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent I = new Intent(awal.this, MainActivity.class);
                startActivity(I);
            }


        });

        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent I = new Intent(awal.this, about.class);
                startActivity(I);
            }

        });
    exit.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            finish();
        }
    });

    }

}

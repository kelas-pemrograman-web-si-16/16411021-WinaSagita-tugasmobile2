package com.example.tugas2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    TextView txtNpm;
    TextView txtNama;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        txtNpm = (TextView) findViewById(R.id.txtNpm);
        txtNama = (TextView) findViewById(R.id.txtNama);

        Intent Intent = getIntent();
        String NPM = Intent.getStringExtra("npm");
        String NAMA = Intent.getStringExtra("nama");
        txtNpm.setText(NPM);
        txtNama.setText(NAMA);
    }
}

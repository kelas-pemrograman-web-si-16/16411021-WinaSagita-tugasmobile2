package com.example.tugas2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnLogin;
    EditText edtnama;
    EditText edtnpm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnLogin = (Button) findViewById(R.id.btnLogin);
        edtnpm =(EditText) findViewById(R.id.edtnpm);
        edtnama = (EditText) findViewById(R.id.edtnama);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String NPM = edtnpm.getText().toString();
                String NAMA = edtnama.getText().toString();

                Intent a = null;

                if (NAMA.equals("wina sagita")  && NPM.equals("16411021")){
                    a = new Intent(MainActivity.this, Main2Activity.class);
                    a.putExtra("nama", edtnama.getText().toString());
                    a.putExtra("npm", edtnpm.getText().toString());
                    startActivity(a);
                }else{
                    Toast.makeText(getApplicationContext(), "Maaf Inputan Salah", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}

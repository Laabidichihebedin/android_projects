package com.example.android1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
EditText EditText_login, EditText_mdp;

Button btn_cnx ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText_login = (EditText) findViewById(R.id.EditText_login);
        EditText_mdp = (EditText) findViewById(R.id.EditText_mdp);
        btn_cnx = (Button)findViewById(R.id.btn_cnx);



        String a = EditText_login.getText().toString();
        String b = EditText_mdp.getText().toString();


        btn_cnx.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myintent = new Intent(MainActivity.this,Welcome.class);
                if (EditText_login.getText().toString().equals("admin") &&
                        EditText_mdp.getText().toString().equals("admin")  )
            startActivity(myintent);
                else
                    Toast.makeText(MainActivity.this, "Sayebna a man",Toast.LENGTH_LONG).show();

            }
        });

    }


}

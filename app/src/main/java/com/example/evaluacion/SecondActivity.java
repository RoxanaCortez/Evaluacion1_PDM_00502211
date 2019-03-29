package com.example.evaluacion;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.evaluacion.utils.AppConstants;

public class SecondActivity extends AppCompatActivity {
    private Button bt_share;
    private TextView tvusuario, tvemail;
    private TextView usu, mail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        tvusuario = findViewById(R.id.tv_usuario);
        tvemail = findViewById(R.id.tv_email);
        bt_share = findViewById(R.id.bt_share);
        usu = findViewById(R.id.usuario);
        mail= findViewById(R.id.email);



        Intent mIntent = this.getIntent();
        if(mIntent != null) {
            usu.setText(mIntent.getStringExtra(AppConstants.TEXT_NAME));
            mail.setText(mIntent.getStringExtra(AppConstants.TEXT_EMAIL));

        }

        bt_share.setOnClickListener(v->{
            Intent secondIntent = new Intent();
            secondIntent.setAction(Intent.ACTION_SEND);
            secondIntent.setType("text/plain");

            secondIntent.putExtra(Intent.EXTRA_TEXT,"\nUsername: "+usu.getText().toString()
                    +"\nPassword: "+mail.getText().toString());

            startActivity(secondIntent);
        });
    }
}

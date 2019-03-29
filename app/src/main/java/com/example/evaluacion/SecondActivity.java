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
    private TextView con1, con2, con3, con4, con5, con6, con7, con8, con9;
    private TextView usu, mail, resp;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);


        bt_share = findViewById(R.id.bt_share);
        usu = findViewById(R.id.usuario);
        mail= findViewById(R.id.email);
        resp= findViewById(R.id.total);

        con1 = findViewById(R.id.cont1);
        con2 = findViewById(R.id.cont2);
        con3 = findViewById(R.id.cont3);
        con4 = findViewById(R.id.cont4);
        con5 = findViewById(R.id.cont5);
        con6 = findViewById(R.id.cont6);
        con7 = findViewById(R.id.cont7);
        con8 = findViewById(R.id.cont8);
        con9 = findViewById(R.id.cont9);


        Intent mIntent = this.getIntent();
        if(mIntent != null) {
            usu.setText(mIntent.getStringExtra(AppConstants.TEXT_NAME));
            mail.setText(mIntent.getStringExtra(AppConstants.TEXT_EMAIL));
            resp.setText(mIntent.getStringExtra(AppConstants.TEXT_CONT));

            con1.setText(mIntent.getStringExtra(AppConstants.TEXT_NUM1));
            con2.setText(mIntent.getStringExtra(AppConstants.TEXT_NUM2));
            con3.setText(mIntent.getStringExtra(AppConstants.TEXT_NUM3));
            con4.setText(mIntent.getStringExtra(AppConstants.TEXT_NUM4));
            con5.setText(mIntent.getStringExtra(AppConstants.TEXT_NUM5));
            con6.setText(mIntent.getStringExtra(AppConstants.TEXT_NUM6));
            con7.setText(mIntent.getStringExtra(AppConstants.TEXT_NUM7));
            con8.setText(mIntent.getStringExtra(AppConstants.TEXT_NUM8));
            con9.setText(mIntent.getStringExtra(AppConstants.TEXT_NUM9));


        }

        bt_share.setOnClickListener(v->{
            Intent secondIntent = new Intent();
            secondIntent.setAction(Intent.ACTION_SEND);
            secondIntent.setType("text/plain");

            secondIntent.putExtra(Intent.EXTRA_TEXT,"\nUsername: "+usu.getText().toString()
                    +"\nEmail: "+mail.getText().toString()
                    +"\nTotal: "+resp.getText().toString());

            startActivity(secondIntent);
        });
    }
}

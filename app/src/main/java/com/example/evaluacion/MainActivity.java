package com.example.evaluacion;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.evaluacion.utils.AppConstants;

public class MainActivity extends AppCompatActivity {

    private LinearLayout casilla1, casilla2, casilla3, casilla4, casilla5, casilla6, casilla7, casilla8,casilla9;
    private TextView conta1, conta2, conta3, conta4, conta5, conta6,conta7, conta8, conta9;
    private Button bt_enviar;
    private TextView tvusuario, tvemail;
    private EditText etusuario, etemail;
    private int contador;

    private void Click(TextView text){
        text.setText((Integer.parseInt(text.getText().toString())+1)+"");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        casilla1=findViewById(R.id.ll_casilla1);
        tvusuario = findViewById(R.id.tv_usuario);
        tvemail = findViewById(R.id.tv_email);
        bt_enviar = findViewById(R.id.bt_enviar);
        etusuario = findViewById(R.id.et_usuario);
        etemail= findViewById(R.id.et_email);
        conta1= findViewById(R.id.conta1);
        casilla1.setOnClickListener(v->Click(conta1));
        conta2 =findViewById(R.id.conta2);
        //conta2.setOnClickListener(click);


        bt_enviar.setOnClickListener(v->{

            Intent mIntent = new Intent(MainActivity.this, SecondActivity.class);
            mIntent.putExtra(AppConstants.TEXT_NAME, etusuario.getText().toString());
            mIntent.putExtra(AppConstants.TEXT_EMAIL, etemail.getText().toString());
            startActivity(mIntent);

        });
    }


}

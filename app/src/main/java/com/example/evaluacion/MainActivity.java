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
    private int contador=0;

    private void Click(TextView text){
        text.setText((Integer.parseInt(text.getText().toString())+1)+"");
        contador++;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        conta1 = findViewById(R.id.conta1);
        conta2 = findViewById(R.id.conta2);
        conta3 = findViewById(R.id.conta3);
        conta4 = findViewById(R.id.conta4);
        conta5 = findViewById(R.id.conta5);
        conta6 = findViewById(R.id.conta6);
        conta7 = findViewById(R.id.conta7);
        conta8 = findViewById(R.id.conta8);
        conta9 = findViewById(R.id.conta9);


        bt_enviar = findViewById(R.id.bt_enviar);
        etusuario = findViewById(R.id.et_usuario);
        etemail= findViewById(R.id.et_email);

        conta1= findViewById(R.id.conta1);
        casilla1 = findViewById(R.id.ll_casilla1);
        casilla1.setOnClickListener(v->Click(conta1));

        conta2 =findViewById(R.id.conta2);
        casilla2 = findViewById(R.id.ll_casilla2);
        casilla2.setOnClickListener(v->Click(conta2));

        conta3= findViewById(R.id.conta3);
        casilla3 = findViewById(R.id.ll_casilla3);
        casilla3.setOnClickListener(v->Click(conta3));

        conta4 =findViewById(R.id.conta4);
        casilla4 = findViewById(R.id.ll_casilla4);
        casilla4.setOnClickListener(v->Click(conta4));

        conta5= findViewById(R.id.conta5);
        casilla5 = findViewById(R.id.ll_casilla5);
        casilla5.setOnClickListener(v->Click(conta5));

        conta6 =findViewById(R.id.conta6);
        casilla6 = findViewById(R.id.ll_casilla6);
        casilla6.setOnClickListener(v->Click(conta6));

        conta7 =findViewById(R.id.conta7);
        casilla7 = findViewById(R.id.ll_casilla7);
        casilla7.setOnClickListener(v->Click(conta7));

        conta8= findViewById(R.id.conta8);
        casilla8 = findViewById(R.id.ll_casilla8);
        casilla8.setOnClickListener(v->Click(conta8));

        conta9 =findViewById(R.id.conta9);
        casilla9 = findViewById(R.id.ll_casilla9);
        casilla9.setOnClickListener(v->Click(conta9));



        bt_enviar.setOnClickListener(v->{

            Intent mIntent = new Intent(MainActivity.this, SecondActivity.class);
            mIntent.putExtra(AppConstants.TEXT_NAME, etusuario.getText().toString());
            mIntent.putExtra(AppConstants.TEXT_EMAIL, etemail.getText().toString());
            mIntent.putExtra(AppConstants.TEXT_CONT, contador+"");

            mIntent.putExtra(AppConstants.TEXT_NUM1, conta1.getText().toString());
            mIntent.putExtra(AppConstants.TEXT_NUM2, conta2.getText().toString());
            mIntent.putExtra(AppConstants.TEXT_NUM3, conta3.getText().toString());
            mIntent.putExtra(AppConstants.TEXT_NUM4, conta4.getText().toString());
            mIntent.putExtra(AppConstants.TEXT_NUM5, conta5.getText().toString());
            mIntent.putExtra(AppConstants.TEXT_NUM6, conta6.getText().toString());
            mIntent.putExtra(AppConstants.TEXT_NUM7, conta7.getText().toString());
            mIntent.putExtra(AppConstants.TEXT_NUM8, conta8.getText().toString());
            mIntent.putExtra(AppConstants.TEXT_NUM9, conta9.getText().toString());

            startActivity(mIntent);

        });
    }


}

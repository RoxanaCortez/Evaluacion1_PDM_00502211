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

    public View.OnClickListener click = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()){
                case R.id.ll_casilla1: contador++;conta1.setText(contador + "");
                break;
                case R.id.ll_casilla2: contador++;conta2.setText(contador + "");
                break;
                case R.id.ll_casilla3: contador++;conta3.setText(contador + "");
                break;
                case R.id.ll_casilla4: contador++;conta4.setText(contador + "");
                break;
                case R.id.ll_casilla5: contador++;conta5.setText(contador + "");
                break;
                case R.id.ll_casilla6: contador++;conta6.setText(contador + "");
                break;
                case R.id.ll_casilla7: contador++;conta7.setText(contador + "");
                break;
                case R.id.ll_casilla8: contador++;conta8.setText(contador + "");
                break;
                case R.id.ll_casilla9: contador++;conta9.setText(contador + "");
                break;
            }
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvusuario = findViewById(R.id.tv_usuario);
        tvemail = findViewById(R.id.tv_email);
        bt_enviar = findViewById(R.id.bt_enviar);
        etusuario = findViewById(R.id.et_usuario);
        etemail= findViewById(R.id.et_email);
        conta1= findViewById(R.id.conta1);
        conta1.setOnClickListener(click);


        bt_enviar.setOnClickListener(v->{

            Intent mIntent = new Intent(MainActivity.this, SecondActivity.class);
            mIntent.putExtra(AppConstants.TEXT_NAME, etusuario.getText().toString());
            mIntent.putExtra(AppConstants.TEXT_EMAIL, etemail.getText().toString());
            startActivity(mIntent);

        });
    }


}

package com.itca.semana3_daute;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity5 extends AppCompatActivity {

    private EditText txt1, txt2;
    private TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        txt1 = findViewById(R.id.txt1);
        txt2 = findViewById(R.id.txt2);
        tv1 =findViewById(R.id.tv3);
    }

    public void verificar(View view) {
        String clave1 = txt2.getText().toString();
        String clave2 = txt1.getText().toString();
        int nro1 = Integer.parseInt(clave1);
        int nro2 = Integer.parseInt(clave2);
        int suma = nro1 + nro2;
        String resu = String.valueOf(suma);
        tv1.setText(""+suma);
       // if(clave.length() == 0){
          //  Toast.makeText(this, "La clave no puede quedar vacìa.", Toast.LENGTH_SHORT).show();
       // }

    }
}
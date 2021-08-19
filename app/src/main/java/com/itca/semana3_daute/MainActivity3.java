package com.itca.semana3_daute;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {

    private TextView lbl1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        lbl1 = findViewById(R.id.lbl);
    }

    public void llamar(View view) {
        lbl1.setText("Llamando...");
    }
}
package com.example.bhaskara;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void CalculaRaizes(View view){
        EditText editA, editB, editC;
        Double a, b, c;

        editA = findViewById(R.id.a);
        editB = findViewById(R.id.b);
        editC = findViewById(R.id.c);

        a = Double.parseDouble(editA.getText().toString());
        b = Double.parseDouble(editB.getText().toString());
        c = Double.parseDouble(editC.getText().toString());

        Matematica mat = new Matematica();
        Double[] raizes = mat.calculaRaizesEq2Grau(a, b, c);

        TextView x1 = findViewById(R.id.x1);
        TextView x2 = findViewById(R.id.x2);
        x1.setText(raizes[0].toString());
        x2.setText(raizes[1].toString());
    }
}

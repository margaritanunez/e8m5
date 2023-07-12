package com.example.laterceraeslavencida;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button botsuma = findViewById(R.id.botsuma);
        Button botresta = findViewById(R.id.botresta);
        Button botmultiplicacion = findViewById(R.id.botmultiplicacion);
        Button botdivision = findViewById(R.id.botdivision);

        EditText numero1 = findViewById(R.id.numero1);
        EditText numero2 = findViewById(R.id.numero2);

        botsuma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (numero1.getText().toString().trim().isEmpty() || numero2.getText().toString().isEmpty()){
                 Toast.makeText(getBaseContext(),"Falta ingresar números", Toast.LENGTH_SHORT).show();
                 return;
                }

                Integer primer = Integer.parseInt(numero1.getText().toString());
                Integer segundo = Integer.parseInt(numero2.getText().toString());

                Integer suma = primer + segundo;
                Toast.makeText(getBaseContext(), "Resultado: " + suma.toString(), Toast.LENGTH_LONG).show();

            }
        });

        botresta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (numero1.getText().toString().trim().isEmpty() || numero2.getText().toString().isEmpty()){
                    Toast.makeText(getBaseContext(),"Falta ingresar números", Toast.LENGTH_SHORT).show();
                    return;
                }

                Integer primer = Integer.parseInt(numero1.getText().toString());
                Integer segundo = Integer.parseInt(numero2.getText().toString());

                Integer resta = primer - segundo;
                Toast.makeText(getBaseContext(), "Resultado: " + resta.toString(), Toast.LENGTH_LONG).show();
            }
        });

        botmultiplicacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (numero1.getText().toString().trim().isEmpty() || numero2.getText().toString().isEmpty()){
                    Toast.makeText(getBaseContext(),"Falta ingresar números", Toast.LENGTH_SHORT).show();
                    return;
                }

                Integer primer = Integer.parseInt(numero1.getText().toString());
                Integer segundo = Integer.parseInt(numero2.getText().toString());

                Integer multiplicacion = primer * segundo;
                Toast.makeText(getBaseContext(), "Resultado: " + multiplicacion.toString(), Toast.LENGTH_LONG).show();
            }
        });

        botdivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (numero1.getText().toString().trim().isEmpty() || numero2.getText().toString().isEmpty()){
                    Toast.makeText(getBaseContext(),"Falta ingresar números", Toast.LENGTH_SHORT).show();
                    return;
                }

                Integer primer = Integer.parseInt(numero1.getText().toString());
                Integer segundo = Integer.parseInt(numero2.getText().toString());

                Integer division = primer / segundo;
                if(Integer.parseInt(numero2.getText().toString())==0){
                    Toast.makeText(getBaseContext(), "no se puede dividir por cero", Toast.LENGTH_SHORT).show();
                    return;
                }
                Toast.makeText(getBaseContext(), "Resultado: " + division.toString(), Toast.LENGTH_LONG).show();

            }
        });
    }
}
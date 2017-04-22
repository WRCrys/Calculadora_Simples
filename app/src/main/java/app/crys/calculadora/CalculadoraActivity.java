package app.crys.calculadora;

import android.app.AlertDialog;
import android.support.v7.app.*;
import android.os.Bundle;
import android.widget.*;
import android.view.*;
import android.app.*;

public class CalculadoraActivity extends AppCompatActivity {
    //Declaração dos atributos usados no XML
    EditText ednumero1, ednumero2;
    Button btsomar, btsubitrair, btmultiplicar, btdividir;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora);

        ednumero1 = (EditText) findViewById(R.id.ednumero1);
        ednumero2 = (EditText) findViewById(R.id.ednumero2);
        btsomar = (Button) findViewById(R.id.btsomar);
        btsubitrair = (Button) findViewById(R.id.btsubitrair);
        btmultiplicar = (Button) findViewById(R.id.btmultiplicar);
        btdividir = (Button) findViewById(R.id.btDividir);

       btsomar.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               double num1 = Double.parseDouble(ednumero1.getText().toString());
               double num2 = Double.parseDouble(ednumero2.getText().toString());
               double soma = num1 + num2;
               //Criação de uma caixa de alerta
               AlertDialog.Builder dialogo = new AlertDialog.Builder(CalculadoraActivity.this);

               dialogo.setTitle("Resultado da soma");

               dialogo.setMessage("A soma é "+soma);

               dialogo.setNeutralButton("OK", null);

               dialogo.show();
           }
       });

        btsubitrair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double num1 = Double.parseDouble(ednumero1.getText().toString());
                double num2 = Double.parseDouble(ednumero2.getText().toString());
                double sub = num1 - num2;

                AlertDialog.Builder dialogo = new AlertDialog.Builder(CalculadoraActivity.this);

                dialogo.setTitle("Resultado da subtração");

                dialogo.setMessage("A subtração é "+sub);

                dialogo.setNeutralButton("OK", null);

                dialogo.show();

            }
        });

        btmultiplicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double num1 = Double.parseDouble(ednumero1.getText().toString());
                double num2 = Double.parseDouble(ednumero2.getText().toString());
                double mult = num1 * num2;

                AlertDialog.Builder dialogo = new AlertDialog.Builder(CalculadoraActivity.this);

                dialogo.setTitle("Resultado da multiplicação");

                dialogo.setMessage("A multiplicação é "+mult);

                dialogo.setNeutralButton("OK", null);

                dialogo.show();
            }
        });

        btdividir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double num1 = Double.parseDouble(ednumero1.getText().toString());
                double num2 = Double.parseDouble(ednumero2.getText().toString());
                double div = num1 / num2;

                AlertDialog.Builder dialogo = new AlertDialog.Builder(CalculadoraActivity.this);

                dialogo.setTitle("Resultado da divisão");

                dialogo.setMessage("A divisão é "+div);

                dialogo.setNeutralButton("OK", null);

                dialogo.show();
            }
        });
    }
}

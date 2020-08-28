package cr.ac.ucr.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import static java.lang.Math.floor;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    //declaración
    private TextView Resultado;
    private double resultado;
    private String mostrar;
    private String memoria;
    private String operacion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //TextView
        Resultado = (TextView)findViewById(R.id.area_resultado);
    }

    //método OnClick para los botones
    @Override
    public void onClick(View view){
        switch (view.getId()){
            case R.id.btn_cero:
                mostrar = Resultado.getText().toString();
                mostrar = mostrar + "0";
                Resultado.setText(mostrar);
                break;

            case R.id.btn_uno:
                mostrar = Resultado.getText().toString();
                mostrar = mostrar + "1";
                Resultado.setText(mostrar);
                break;

            case R.id.btn_dos:
                mostrar = Resultado.getText().toString();
                mostrar = mostrar + "2";
                Resultado.setText(mostrar);
                break;

            case R.id.btn_tres:
                mostrar = Resultado.getText().toString();
                mostrar = mostrar + "3";
                Resultado.setText(mostrar);
                break;

            case R.id.btn_cuatro:
                mostrar = Resultado.getText().toString();
                mostrar = mostrar + "4";
                Resultado.setText(mostrar);
                break;

            case R.id.btn_cinco:
                mostrar = Resultado.getText().toString();
                mostrar = mostrar + "5";
                Resultado.setText(mostrar);
                break;

            case R.id.btn_seis:
                mostrar = Resultado.getText().toString();
                mostrar = mostrar + "6";
                Resultado.setText(mostrar);
                break;

            case R.id.btn_siete:
                mostrar = Resultado.getText().toString();
                mostrar = mostrar + "7";
                Resultado.setText(mostrar);
                break;

            case R.id.btn_ocho:
                mostrar = Resultado.getText().toString();
                mostrar = mostrar + "8";
                Resultado.setText(mostrar);
                break;

            case R.id.btn_nueve:
                mostrar = Resultado.getText().toString();
                mostrar = mostrar + "9";
                Resultado.setText(mostrar);
                break;

            case R.id.btn_punto:
                mostrar = Resultado.getText().toString();
                mostrar = mostrar + ".";
                Resultado.setText(mostrar);
                break;

            case R.id.btn_borrar:
                mostrar = "";
                Resultado.setText(mostrar);
                memoria = "";
                operacion = "";
                break;

            case R.id.btn_sumar:
                memoria = Resultado.getText().toString();
                operacion = "+";
                Resultado.setText("");
                break;

            case R.id.btn_restar:
                memoria = Resultado.getText().toString();
                operacion = "-";
                Resultado.setText("");
                break;

            case R.id.btn_dividir:
                memoria = Resultado.getText().toString();
                operacion = "/";
                Resultado.setText("");
                break;

            case R.id.btn_multiplicar:
                memoria = Resultado.getText().toString();
                operacion = "x";
                Resultado.setText("");
                break;

            case R.id.btn_igual:
                showResult();
                break;

            default:
                break;
        }
    }

    public void showResult(){
        mostrar = Resultado.getText().toString();
        //EXPLICACIÓN DEL METODO SHOW RESULT

        // se le da de valor a "resultado" el resultado de la "operación" entre el número que acaba de digitar el usuario
        // y el número que digitó anteriormente (memoria), posteriormente mediante el método floor de la librería Math
        // para ver si es necesario o no convertir el resultado a un entero, por ejemplo 2+2 no sería 4.0 (double) sino 4 (int)

        if(operacion.equals("-")){
            resultado = Double.parseDouble(memoria) - Double.parseDouble(Resultado.getText().toString());
            if(floor(resultado) == resultado){
                Resultado.setText(String.valueOf((int)Math.round(resultado)));
            }else{
                Resultado.setText(String.valueOf(resultado));
            }
        }

        if(operacion.equals("+")){
            resultado = Double.parseDouble(memoria) + Double.parseDouble(Resultado.getText().toString());
            if(floor(resultado) == resultado){
                Resultado.setText(String.valueOf((int)Math.round(resultado)));
            }else{
                Resultado.setText(String.valueOf(resultado));
            }
        }

        if(operacion.equals("/")){
            resultado = Double.parseDouble(memoria) / Double.parseDouble(Resultado.getText().toString());
            if(floor(resultado) == resultado){
                Resultado.setText(String.valueOf((int)Math.round(resultado)));
            }else{
                Resultado.setText(String.valueOf(resultado));
            }
        }

        if(operacion.equals("x")){
            resultado = Double.parseDouble(memoria) * Double.parseDouble(Resultado.getText().toString());
            if(floor(resultado) == resultado){
                Resultado.setText(String.valueOf((int)Math.round(resultado)));
            }else{
                Resultado.setText(String.valueOf(resultado));
            }
        }
    }
}
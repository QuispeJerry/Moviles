package com.example.android.calculadora

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import org.w3c.dom.Text
import kotlin.math.sign

const val EXTRA_MESSAGE= "com.example.android.calculadora";
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)




    }




    fun imprimir0(view: View){
        view.findViewById<Button>(R.id.btn0).setOnClickListener {
            val contenidoBtn= view.findViewById<Button>(R.id.btn0);
            val contenidoBtnString = contenidoBtn.text.toString();

            aumentar(contenidoBtnString);

            val contenidoEdit = findViewById<EditText>(R.id.etOperandos);
            val contenidoEditString = contenidoEdit.text.toString();
            var contenido = contenidoEditString + contenidoBtnString;

            contenidoEdit.setText(contenido.toString());

            eraseResult()
        }

    }



    var numero1: String="";
    var numero2: String="";
    var signo:String="";

//    fun reducir(view: View, btn: Button)

    fun aumentar(cBtn: String){
        if (this.signo.length==0){
            numero1+=cBtn;
            numero2="";
        }
        else{
            numero2+=cBtn;
        }

        println("Numero 1: " + this.numero1);
        println("Numero 2: " + this.numero2);
    }

    fun guardarSigno(signo: String){
        this.signo=signo;
        println("Signo: " + this.signo);
    }

    fun eraseResult(){
        var contenidoResultado = findViewById<TextView>(R.id.tResutado);
        contenidoResultado.setText("");
    }

    fun resolver(view: View){
        view.findViewById<Button>(R.id.btnIgual).setOnClickListener {
            var aux: Int=0;
        when(signo){
            "+"-> {aux = (numero1.toInt()) + (numero2.toInt());}
            "-"-> {aux = (numero1.toInt()) - (numero2.toInt());}
            "x"-> {aux = (numero1.toInt()) * (numero2.toInt());}
            "/"-> {aux = (numero1.toInt()) / (numero2.toInt());}
        }
            var contenidoResultado = findViewById<TextView>(R.id.tResutado);
            contenidoResultado.setText(aux.toString());


            numero1="";
            numero2="";
            signo="";
            val contenidoEdit = findViewById<EditText>(R.id.etOperandos);

            var vacio: String = ""
            contenidoEdit.setText(vacio);
        }

    }



    fun imprimir1(view: View){
        view.findViewById<Button>(R.id.btn1).setOnClickListener {
            val contenidoBtn= view.findViewById<Button>(R.id.btn1);
            val contenidoBtnString = contenidoBtn.text.toString();

            aumentar(contenidoBtnString);

            val contenidoEdit = findViewById<EditText>(R.id.etOperandos);
            val contenidoEditString = contenidoEdit.text.toString();
            var contenido = contenidoEditString + contenidoBtnString;

            contenidoEdit.setText(contenido.toString());
            eraseResult()
        }
    }

    fun imprimir2(view: View){
        view.findViewById<Button>(R.id.btn2).setOnClickListener {
            val contenidoBtn= view.findViewById<Button>(R.id.btn2);
            val contenidoBtnString = contenidoBtn.text.toString();

            aumentar(contenidoBtnString);

            val contenidoEdit = findViewById<EditText>(R.id.etOperandos);
            val contenidoEditString = contenidoEdit.text.toString();
            var contenido = contenidoEditString + contenidoBtnString;

            contenidoEdit.setText(contenido.toString());
            eraseResult()
        }
    }

    ///////////////////////////////////////////
    fun imprimir3(view: View){
        view.findViewById<Button>(R.id.btn3).setOnClickListener {
            val contenidoBtn= view.findViewById<Button>(R.id.btn3);
            val contenidoBtnString = contenidoBtn.text.toString();

            aumentar(contenidoBtnString);

            val contenidoEdit = findViewById<EditText>(R.id.etOperandos);
            val contenidoEditString = contenidoEdit.text.toString();
            var contenido = contenidoEditString + contenidoBtnString;

            contenidoEdit.setText(contenido.toString());
            eraseResult()
        }
    }

    ///////////////////////////////////////////
    fun imprimir4(view: View){
        view.findViewById<Button>(R.id.btn4).setOnClickListener {
            val contenidoBtn= view.findViewById<Button>(R.id.btn4);
            val contenidoBtnString = contenidoBtn.text.toString();

            aumentar(contenidoBtnString);

            val contenidoEdit = findViewById<EditText>(R.id.etOperandos);
            val contenidoEditString = contenidoEdit.text.toString();
            var contenido = contenidoEditString + contenidoBtnString;

            contenidoEdit.setText(contenido.toString());
            eraseResult()
        }
    }

    ///////////////////////////////////////////
    fun imprimir5(view: View){
        view.findViewById<Button>(R.id.btn5).setOnClickListener {
            val contenidoBtn= view.findViewById<Button>(R.id.btn5);
            val contenidoBtnString = contenidoBtn.text.toString();

            aumentar(contenidoBtnString);

            val contenidoEdit = findViewById<EditText>(R.id.etOperandos);
            val contenidoEditString = contenidoEdit.text.toString();
            var contenido = contenidoEditString + contenidoBtnString;

            contenidoEdit.setText(contenido.toString());
            eraseResult()
        }
    }

    ///////////////////////////////////////////
    fun imprimir6(view: View){
        view.findViewById<Button>(R.id.btn6).setOnClickListener {
            val contenidoBtn= view.findViewById<Button>(R.id.btn6);
            val contenidoBtnString = contenidoBtn.text.toString();

            aumentar(contenidoBtnString);

            val contenidoEdit = findViewById<EditText>(R.id.etOperandos);
            val contenidoEditString = contenidoEdit.text.toString();
            var contenido = contenidoEditString + contenidoBtnString;

            contenidoEdit.setText(contenido.toString());
            eraseResult()
        }
    }

    ///////////////////////////////////////////
    fun imprimir7(view: View){
        view.findViewById<Button>(R.id.btn7).setOnClickListener {
            val contenidoBtn= view.findViewById<Button>(R.id.btn7);
            val contenidoBtnString = contenidoBtn.text.toString();

            aumentar(contenidoBtnString);

            val contenidoEdit = findViewById<EditText>(R.id.etOperandos);
            val contenidoEditString = contenidoEdit.text.toString();
            var contenido = contenidoEditString + contenidoBtnString;

            contenidoEdit.setText(contenido.toString());
            eraseResult()
        }
    }

    ///////////////////////////////////////////
    fun imprimir8(view: View){
        view.findViewById<Button>(R.id.btn8).setOnClickListener {
            val contenidoBtn= view.findViewById<Button>(R.id.btn8);
            val contenidoBtnString = contenidoBtn.text.toString();

            aumentar(contenidoBtnString);

            val contenidoEdit = findViewById<EditText>(R.id.etOperandos);
            val contenidoEditString = contenidoEdit.text.toString();
            var contenido = contenidoEditString + contenidoBtnString;

            contenidoEdit.setText(contenido.toString());
            eraseResult()
        }
    }

    ///////////////////////////////////////////
    fun imprimir9(view: View){
        view.findViewById<Button>(R.id.btn9).setOnClickListener {
            val contenidoBtn= view.findViewById<Button>(R.id.btn9);
            val contenidoBtnString = contenidoBtn.text.toString();

            aumentar(contenidoBtnString);

            val contenidoEdit = findViewById<EditText>(R.id.etOperandos);
            val contenidoEditString = contenidoEdit.text.toString();
            var contenido = contenidoEditString + contenidoBtnString;

            contenidoEdit.setText(contenido.toString());
            eraseResult()
        }
    }

    ///////////////////////////////////////////
    fun imprimirMulti(view: View){
        view.findViewById<Button>(R.id.btnMulti).setOnClickListener {
            val contenidoBtn= view.findViewById<Button>(R.id.btnMulti);
            val contenidoBtnString = contenidoBtn.text.toString();

            guardarSigno(contenidoBtnString);

            val contenidoEdit = findViewById<EditText>(R.id.etOperandos);
            val contenidoEditString = contenidoEdit.text.toString();
            var contenido = contenidoEditString + contenidoBtnString;

            contenidoEdit.setText(contenido.toString());
            eraseResult()
        }
    }

    ///////////////////////////////////////////
    fun imprimirDiv(view: View){
        view.findViewById<Button>(R.id.btnDiv).setOnClickListener {
            val contenidoBtn= view.findViewById<Button>(R.id.btnDiv);
            val contenidoBtnString = contenidoBtn.text.toString();


            guardarSigno(contenidoBtnString);


            val contenidoEdit = findViewById<EditText>(R.id.etOperandos);
            val contenidoEditString = contenidoEdit.text.toString();
            var contenido = contenidoEditString + contenidoBtnString;

            contenidoEdit.setText(contenido.toString());
            eraseResult()
        }
    }

    ///////////////////////////////////////////
    fun imprimirResta(view: View){
        view.findViewById<Button>(R.id.btnResta).setOnClickListener {
            val contenidoBtn= view.findViewById<Button>(R.id.btnResta);
            val contenidoBtnString = contenidoBtn.text.toString();

            guardarSigno(contenidoBtnString);

            val contenidoEdit = findViewById<EditText>(R.id.etOperandos);
            val contenidoEditString = contenidoEdit.text.toString();
            var contenido = contenidoEditString + contenidoBtnString;

            contenidoEdit.setText(contenido.toString());
            eraseResult()
        }
    }

    ///////////////////////////////////////////
    fun imprimirSum(view: View){
        view.findViewById<Button>(R.id.btnSum).setOnClickListener {
            val contenidoBtn= view.findViewById<Button>(R.id.btnSum);
            val contenidoBtnString = contenidoBtn.text.toString();

            guardarSigno(contenidoBtnString);

            val contenidoEdit = findViewById<EditText>(R.id.etOperandos);
            val contenidoEditString = contenidoEdit.text.toString();
            var contenido = contenidoEditString + contenidoBtnString;

            contenidoEdit.setText(contenido.toString());
            eraseResult()
        }
    }
}
package com.example.android.app_sem04_s1_p2

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Size
import android.view.View
import android.view.Window
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var questions: ArrayList<Question>
    var countPoints: Int = 0
    var countLives: Int=5
    var position = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        disableBtnNext()
        disableBtnPrevious()
        loadQuestions(String());
        setupViews()
    }

    private fun loadQuestions(aux: String) {
        var aux= intent.getStringExtra(EXTRA_MESS)
        var them = aux.toString().toInt();
        questions = ArrayList();
        if (them==1){//historia

            questions.add(Question("El Muro de Berlín cayó en 1989", true))
            questions.add(Question("La Revolución Industrial comenzó en el siglo XVIII", true))
            questions.add(Question("El imperio romano llegó a su fin en el siglo V", true))
            questions.add(Question("La Guerra Fría fue un conflicto entre los Estados Unidos y Alemania", false))
            questions.add(Question("La Primera Guerra Mundial comenzó en 1914 y terminó en 1918", true))
            questions.add(Question("La Revolución Francesa comenzó en 1789", true))
            questions.add(Question("La Batalla de Waterloo tuvo lugar en 1815", true))
            questions.add(Question("La Dinastía Qing fue la última dinastía imperial de China", true))
            questions.add(Question("El imperio egipcio duró alrededor de 3.000 años", true))
            questions.add(Question("El Renacimiento fue un movimiento artístico y cultural que tuvo lugar en Europa en el siglo XV", true))
            questions.add(Question("La guerra de Vietnam duró de 1955 a 1975", true))
            questions.add(Question("La Guerra de los Cien Años fue un conflicto entre Inglaterra y Francia", true))
            questions.add(Question("La independencia de Estados Unidos fue declarada en 1776", true))
            questions.add(Question("La dinastía Ming fue precedida por la dinastía Yuan", true))
            questions.add(Question("El imperio mongol fue fundado por Genghis Khan", true))
            questions.add(Question("La Edad Media abarcó aproximadamente desde el siglo V al siglo XV", true))
            questions.add(Question("La Revolución Rusa de 1917 condujo a la formación de la Unión Soviética", true))
            questions.add(Question("El Imperio Otomano fue fundado por Osman I", true))
            questions.add(Question("El tratado de Versalles puso fin a la Primera Guerra Mundial", true))
            questions.add(Question("La Revolución Industrial comenzó en Inglaterra", true))

        }
        else if( them ==2){//matematica
            questions.add(Question("El número pi es un número irracional", true))
            questions.add(Question("El teorema de Pitágoras se aplica en triángulos rectángulos", true))
            questions.add(Question("La suma de los ángulos internos de un triángulo es igual a 180 grados", true))
            questions.add(Question("Un número primo es divisible solamente por 1 y por sí mismo", true))
            questions.add(Question("El número cero es un número par", true))
            questions.add(Question("La raíz cuadrada de un número negativo es un número imaginario", true))
            questions.add(Question("El logaritmo de un número es el exponente al que hay que elevar una base para obtener ese número", true))
            questions.add(Question("La ecuación más famosa de Albert Einstein es E=mc^2", true))
            questions.add(Question("La función cuadrática es una función polinómica de segundo grado", true))
            questions.add(Question("El número áureo o razón áurea es aproximadamente 1,618", true))
            questions.add(Question("La fórmula para calcular el área de un triángulo es 1/2 x base x altura", true))
            questions.add(Question("El máximo común divisor es el número más grande que divide a dos o más números sin dejar un residuo", true))
            questions.add(Question("El mínimo común múltiplo es el número más pequeño que es múltiplo de dos o más números", true))
            questions.add(Question("El teorema de Fermat establece que no hay soluciones enteras para la ecuación x^n + y^n = z^n para n>2", true))
            questions.add(Question("La derivada de una función representa la tasa de cambio instantánea de esa función", true))
            questions.add(Question("El conjunto de números irracionales es infinito y no puede ser representado como una fracción", true))
            questions.add(Question("La desigualdad de Cauchy-Schwarz establece que el producto punto de dos vectores es menor o igual a la multiplicación de sus magnitudes", true))
            questions.add(Question("Un número entero es un número que no tiene parte decimal", true))
            questions.add(Question("Un número complejo tiene dos componentes, una parte real y una parte imaginaria", true))
            questions.add(Question("El teorema de los cosenos se aplica en triángulos no rectángulos", true))

        }
        else if( them ==3){
            questions.add(Question("La física cuántica solo se aplica en el mundo subatómico.", true));
            questions.add(Question("La mecánica cuántica describe el comportamiento de sistemas muy pequeños, como los átomos y las partículas subatómicas.", true));
            questions.add(Question("La entrelazamiento cuántico es un fenómeno en el que dos partículas pueden estar correlacionadas de tal manera que la medición de una de ellas afecta el estado de la otra.", true));
            questions.add(Question("La incertidumbre de Heisenberg establece que es imposible conocer simultáneamente la posición y el momento de una partícula con una precisión absoluta.", true));
            questions.add(Question("La superposición cuántica es el fenómeno por el cual un sistema cuántico puede existir en múltiples estados simultáneamente hasta que se realiza una medición.", true));
            questions.add(Question("El efecto túnel es un fenómeno cuántico en el cual una partícula puede atravesar una barrera de energía aunque clásicamente no tendría suficiente energía para hacerlo.", true));
            questions.add(Question("La física cuántica es incompatible con la física clásica.", true));
            questions.add(Question("La mecánica cuántica puede utilizarse para describir el comportamiento de sistemas macroscópicos, como una pelota de tenis.", false));
            questions.add(Question("La teoría de la relatividad general de Einstein y la mecánica cuántica son completamente compatibles.", false));
            questions.add(Question("La decoherencia cuántica es el proceso por el cual los sistemas cuánticos se vuelven clásicos debido a su interacción con el ambiente.", true));
            questions.add(Question("La teoría de cuerdas es una teoría unificada que intenta combinar la relatividad general y la mecánica cuántica.", true));
            questions.add(Question("Los agujeros negros son objetos puramente clásicos y no tienen nada que ver con la física cuántica.", false));
            questions.add(Question("La paradoja del gato de Schrödinger es un experimento mental que intenta ilustrar la superposición cuántica.", true));
            questions.add(Question("La física cuántica ha sido verificada experimentalmente en múltiples ocasiones.", true));
            questions.add(Question("La dualidad onda-partícula establece que las partículas pueden comportarse como ondas y viceversa.", true));
            questions.add(Question("La mecánica cuántica es determinista y puede predecir con certeza el resultado de cualquier experimento.", false));
            questions.add(Question("La teleportación cuántica es el proceso por el cual la información se transfiere instantáneamente entre dos puntos en el espacio.", false));
            questions.add(Question("La física cuántica tiene importantes aplicaciones en áreas como la criptografía y la computación cuántica.", true));
            questions.add(Question("La física cuántica sugiere que la realidad es subjetiva y depende del observador.", false));

        }
        else{
            questions.add(Question("El ADN es una molécula de doble hélice", true))
            questions.add(Question("El monte Everest es la montaña más alta del mundo", true))
            questions.add(Question("El mercurio es el planeta más cercano al sol", true))
            questions.add(Question("Los seres humanos usamos solo el 10% de nuestro cerebro", false))
            questions.add(Question("La hormona del estrés se llama cortisol", true))
            questions.add(Question("La especie humana evolucionó a partir de los simios modernos", true))
            questions.add(Question("El Polo Norte magnético es el mismo que el Polo Norte geográfico", false))
            questions.add(Question("La velocidad del sonido es mayor en el aire que en el agua", false))
            questions.add(Question("El hielo flota en el agua porque es menos denso", true))
            questions.add(Question("El sol es una estrella", true))
            questions.add(Question("El oxígeno es el elemento más común en la corteza terrestre", false))
            questions.add(Question("La primera ley de Newton establece que un objeto en reposo permanecerá en reposo a menos que una fuerza neta actúe sobre él", true))
            questions.add(Question("La luz viaja más rápido que el sonido", true))
            questions.add(Question("El electrón es una partícula subatómica con carga negativa", true))
            questions.add(Question("El hierro es un elemento químico líquido a temperatura ambiente", false))
            questions.add(Question("El efecto Doppler es un fenómeno que se produce cuando la frecuencia de una onda cambia debido al movimiento relativo entre la fuente y el observador", true))
            questions.add(Question("La ley de gravitación universal fue descubierta por Albert Einstein", false))
            questions.add(Question("La entropía de un sistema aislado siempre disminuye con el tiempo", false))
            questions.add(Question("El modelo atómico actualmente aceptado es el modelo de Rutherford-Bohr", false))

        }

    }

    private fun setupViews() {

        val btnNext = findViewById<Button>(R.id.bntNext);
        val btnPrevious = findViewById<Button>(R.id.btnPrevious);
        val tvQuestion = findViewById<TextView>(R.id.textView);
        val btnYes = findViewById<Button>(R.id.btnTrue);
        val btnNo = findViewById<Button>(R.id.btnFalse);

        tvQuestion.text= questions[position].sentece;

        clickYes(btnYes, tvQuestion);
        clickNo(btnNo, tvQuestion);
        clickNext(btnNext,tvQuestion);
        clickPrevious(btnPrevious,tvQuestion);
    }

    fun clickNext(btnNext_: Button, tvQuestion_: TextView){

        btnNext_.setOnClickListener {
            activateBtnPrevious();
            disableBtnNext()
            answerNoResponse()
            if(position>=questions.size-1){
                Toast.makeText(this, "No quedan preguntas", Toast.LENGTH_LONG).show();
                disableBtnNext()
            }
            else{
                position++;
                tvQuestion_.text= questions[position].sentece;
            }

        }
    }

    fun clickPrevious(btnPrevious_: Button, tvQuestion_: TextView){
        btnPrevious_.setOnClickListener {

            if(position<=0){
                Toast.makeText(this, "No quedan preguntas", Toast.LENGTH_LONG).show();
            }
            else{
                position--;
                if (position==0)disableBtnPrevious();
                tvQuestion_.text= questions[position].sentece;
            }

        }
    }

    fun clickYes(btnYes_: Button, tvQuestion_: TextView){
        btnYes_.setOnClickListener {

            if (questions[position].answer==true){
                addPoints();
                //activamos el boton
                activeBtnNext()
                answerCorrect()
                Toast.makeText(this, "Respuesta correcta", Toast.LENGTH_LONG).show();
            }
            else{
                deleteLives()
                answerInCorrect()
                Toast.makeText(this, "Respuesta Incorrecta", Toast.LENGTH_LONG).show();
                if (countLives<=0){
                    tvQuestion_.setTextColor(Color.parseColor("#3BD3B4"));
                    tvQuestion_.setTextSize(35F)
                    tvQuestion_.text = "SORRY, GAME OVERRRRRRR";
                    gameOver();
                }
            }
        }
    }

    fun clickNo(btnNo_: Button, tvQuestion_: TextView){
        btnNo_.setOnClickListener {
            if (questions[position].answer==false){
                addPoints();
                //activamos el boton
                activeBtnNext()
                answerCorrect()
                Toast.makeText(this, "Respuesta correcta", Toast.LENGTH_SHORT).show();
            }
            else{
                deleteLives()
                answerInCorrect()
                Toast.makeText(this, "Respuesta Incorrecta", Toast.LENGTH_SHORT).show();
                if (countLives<=0){
                    tvQuestion_.setTextColor(Color.parseColor("#3BD3B4"));
                    tvQuestion_.setTextSize(55F)
                    tvQuestion_.text = "SORRY, GAME OVERRRRRRR";
                    gameOver();
                }
            }
        }
    }

    fun addPoints(){
        countPoints++;
        val puntos = "Points: ${countPoints}"
        findViewById<TextView>(R.id.tvPoints).text=puntos;
    }

    fun deleteLives(){
        countLives--;
        val puntos = "Vidas: ${countLives}"
        findViewById<TextView>(R.id.tvLives).text=puntos;
    }

    fun gameOver(){
        disableBtnPrevious()
        disableBtnNext()
        disableTrue();
        disableFalse();
        val aux = findViewById<View>(R.id.btnWindow1)
        aux.setBackgroundColor(Color.parseColor("#B4000000"))
    }

    fun disableTrue(){
        val disable=findViewById<Button>(R.id.btnTrue)
        disable.isEnabled=false;
    }

    fun activateTrue(){
        val disable=findViewById<Button>(R.id.btnTrue)
        disable.isEnabled=true;
    }

    fun disableFalse(){
        val disable=findViewById<Button>(R.id.btnFalse)
        disable.isEnabled=false;
    }

    fun activateFalse(){
        val disable=findViewById<Button>(R.id.btnFalse)
        disable.isEnabled=true;
    }

    fun disableBtnPrevious(){
        val disableBtnNext=findViewById<Button>(R.id.btnPrevious)
        disableBtnNext.isEnabled=false;
    }

    fun activateBtnPrevious(){
        val disableBtnNext=findViewById<Button>(R.id.btnPrevious)
        disableBtnNext.isEnabled=true;
    }

    fun activeBtnNext(){
        val disableBtnNext=findViewById<Button>(R.id.bntNext)
        disableBtnNext.isEnabled=true;
    }

    fun disableBtnNext(){
        val disableBtnNext = findViewById<Button>(R.id.bntNext)
        disableBtnNext.isEnabled=false
    }

    fun answerInCorrect(){
        val aux = findViewById<View>(R.id.btnWindow1)
        aux.setBackgroundColor(Color.parseColor("#F63030"))
    }

    fun answerCorrect(){
        val aux = findViewById<View>(R.id.btnWindow1)
        aux.setBackgroundColor(Color.parseColor("#53DC26"))
    }

    fun answerNoResponse(){
        val aux = findViewById<View>(R.id.btnWindow1)
        aux.setBackgroundColor(Color.parseColor("#E4D97C"))
    }
}
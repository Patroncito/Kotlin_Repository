package com.patron.master.imc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.widget.AppCompatEditText
import androidx.core.content.ContextCompat
import com.patron.master.R

class imcActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_imc)

        val textEditAltura = findViewById<AppCompatEditText>(R.id.alturaTextEdit)
        val textEditPeso = findViewById<AppCompatEditText>(R.id.pesoTextEdit)

        val calcularBtn = findViewById<Button>(R.id.btnCalcular)
        val limpiarBtn = findViewById<Button>(R.id.btnLimpiar)
        val resultTxt = findViewById<TextView>(R.id.resultTxt)

        // Action to clean button, to clean data
        calcularBtn.setOnClickListener {
            calcularIMC(resultTxt, textEditAltura, textEditPeso)
        }



        // Action to clean button, to clean data
        limpiarBtn.setOnClickListener {
            limpiarData(resultTxt, textEditAltura, textEditPeso)
        }
    }


    private fun calcularIMC(textViewResult: TextView, textEditAltura : AppCompatEditText, textEditPeso: AppCompatEditText) {


        if (textEditAltura.text.toString().isNotEmpty() && textEditPeso.text.toString()
                .isNotEmpty()
        ) {

            // CONVERTIR ALTURA DE CM A METROS
            // SE HARA EL CALCULO DEL IMC
            // IMC = (PESO(KG) / (ALTURA(METROS))´2 )

            val peso : Float = textEditPeso.text.toString().toFloat()
            val altura : Double = textEditAltura.text.toString().toDouble()

            val IMCFinal = String.format("%.2f", (peso/Math.pow((altura/100),2.0))).toDouble()
          // Mandando el resultado final al textView de la UI

            // Asignando colores.

            val colorBajo = R.color.azulCyan
            val colorAdecuado = R.color.azulClaro
            val colorSobrepeso = R.color.verde
            val colorObesidadGrado1 = R.color.amarillo
            val colorObesidadGrado2 = R.color.naranja
            val colorObesidadGrado3 = R.color.rojo

            // Asignando rangos.
            val rangoBajo = 0.0..18.5
            val rangoAdecuado = 18.5..24.9
            val rangoSobrepeso = 25.0..29.9
            val rangoObesidadGrado1 = 30.0..34.9
            val rangoObesidadGrado2 = 35.0..39.9
            val rangoObesidadGrado3 = 40.0..100.0

            // Evaluando el IMC y Asignando el color correspondiente

            val color: Int = when {
                IMCFinal in rangoBajo -> colorBajo
                IMCFinal in rangoBajo -> colorBajo
                IMCFinal in rangoAdecuado -> colorAdecuado
                IMCFinal in rangoSobrepeso -> colorSobrepeso
                IMCFinal in rangoObesidadGrado1 -> colorObesidadGrado1
                IMCFinal in rangoObesidadGrado2 -> colorObesidadGrado2
                else -> R.color.black // Puedes usar un color predeterminado para otros casos
            }

            textViewResult.text = IMCFinal.toString()
            textViewResult.setTextColor(ContextCompat.getColor(this, color))

            //textViewResult.setTextColor(ContextCompat.getColor(this, color))

        } else if (textEditAltura.text.toString().isEmpty()) {
            mostrarToast("Ingresa la Altura")
        } else if (textEditPeso.text.toString().isEmpty()) {
            mostrarToast("Ingresa el Peso")
        } else {
            mostrarToast("Ingresa la Altura y el Peso")
        }



    }

    private fun limpiarData(textViewResult: TextView, textEditAltura : AppCompatEditText, textEditPeso: AppCompatEditText){

        // Formatear IMC en 0
        textViewResult.text = ""

        //Formatear TextEditPeso
        textEditPeso.setText("")

        //Formatear TextEditAltura
        textEditAltura.setText("")



    }

    private fun mostrarToast(mensaje: String) {
        val toast = Toast.makeText(this, mensaje, Toast.LENGTH_SHORT)
        toast.show()
    }
}


// < 18.5 Bajo Peso
// 18.5 - 24,9 Adecuado
// 25.0 - 29.0 Sobrepeso
// 30.0 - 34.9 Obesidad Grado 1
// 35.0 34.9 Obesidad Grado 2
// >40 Obesidad Grado 3


// Azul Claro
// Azul Cyan
// Verde
// Amarillo
// Narajna
// Rojo

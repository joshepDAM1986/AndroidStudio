package com.example.cursokotlinprincipiante

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.ReportFragment.Companion.reportFragment

val TAG=":::TAG"
class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //variableYConstantes()
        //tiposDedatos()
        //operadores()
        //nullSafety()
        //funciones()
        //clases()
        interfaces();

    }

    //Vamos a ver variables y constantes
    private fun variableYConstantes() {
        var myFirstVariable = "Hello world!"
        myFirstVariable = "bye world"
        val myFirstConstant = " hellow world!"
    }

    private fun tiposDedatos() {
        //Cadenas de texto
        var string = "my string"
        //Valores numericos(int,short,long, byte)
        var number: Long = 10 // por defecto Int
        //Valores decimales(double,float)
        var decimal: Float = 10.5f
        var decimalDouble: Double = 10.5
        //Condiciones verdadreas o falsas
        var boolean = false
        var boolean2 = true
    }

    private fun operadores() {
        val firstValue = 5
        val secondValue = 2

        //Operadores aritmeticos
        val suma: Int = firstValue + secondValue
        val resta: Int = firstValue - secondValue
        val mult: Int = firstValue * secondValue
        val div: Int = firstValue / secondValue
        val resto: Int = firstValue % secondValue

        //Operadores comparacion
        val igual: Boolean = firstValue == secondValue
        val desigual: Boolean = firstValue != secondValue
        val menor: Boolean = firstValue < secondValue
        val mayor: Boolean = firstValue > secondValue
        val menorIgual: Boolean = firstValue <= secondValue
        val mayorIgual: Boolean = firstValue >= secondValue


        //Operadores logicos
        val name = "Rodrigo"
        val age = 26
        val igualdad2 = name == "Rodrigo"
        val menor2 = age < 50
        //-----------------------------------------------------------------------
        val conjuncion = igualdad2 && menor2 //tienen que complirse las dos condiciones
        val disyuncion = igualdad2 && menor2 //debe cumplirse almenos una condicion
        val negacion = !igualdad2 //devuelve lo contrario al boleano resultante
    }

    private fun nullSafety() {
        val nullString: String? = null
        if (nullString != null) {
            Log.d(TAG, nullString)
        }

    }

    //Funciones
    private fun funciones() {
        //funcionSimple()
        //funcionParametros("Rodrigo", 26)
        val calculaEdad = funcionRetorno(1986)
        Log.d(TAG, "My age is $calculaEdad")
    }

    //funcion simple
    private fun funcionSimple() {
        Log.d(TAG, "Rodrigo")
        Log.d(TAG, 26.toString())
    }

    private fun funcionParametros(name: String, age: Int) {
        Log.d(TAG, "My name is $name")
        Log.d(TAG, "My age is $age")
    }

    private fun funcionRetorno(birthYear: Int) {
        2023 - birthYear
    }

    private fun clases() {
        val rodrigoData = PersonData("Rodrigo", 26)
        val rodrigo = Persona(rodrigoData)
        val raquelData = PersonData("Raquel", 31)
        val raquel = Persona(raquelData)
        rodrigo.presentacion()
        raquel.presentacion()
    }

    class Persona(val data: PersonData) {
        fun presentacion() {
            Log.d(TAG, "my name is ${data.name} and my age is ${data.age}")
        }
    }

    data class PersonData(
        val name: String?,
        val age: Int
    )

    private fun interfaces() {
        val rodrigoData = PersonData("Rodrigo", 26)
        val rodrigo = SegundaPersona(rodrigoData)
        rodrigo.presentacion()
        val edad=rodrigo.returnAge(1986)
        Log.d(TAG, "mi edad es $edad")
    }

    class SegundaPersona(private val data: PersonData):PersonInterface {
        fun presentacion() {

        }

        override fun returnAge(birthYear: Int):Int =2023 - birthYear

    }

    interface PersonInterface{
        fun returnAge(birthYear: Int):Int
    }

}




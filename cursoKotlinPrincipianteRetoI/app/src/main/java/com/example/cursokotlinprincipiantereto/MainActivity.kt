package com.example.cursokotlinprincipiantereto

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

val TAG=":::TAG"
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        retoFunciones()
    }

    private fun retoFunciones(){
        val programador:Programador = Programador()
        val rodrigo:ProgramadorData = programador.getProgramadorData()
        Log.d(TAG,"My name is ${rodrigo.nombre} mi age is ${rodrigo.edad} and im teaching ${rodrigo.lenguaje}")
    }

    class Programador: ProgramadorInterface{
        override fun getProgramadorData(): ProgramadorData=ProgramadorData(getName(), getAge(), getLenguaje())

        private fun getName():String{
            return "Rodrigo"
        }

        private fun getAge(): Int{
            return 2023 -1986
        }

        private fun getLenguaje(): String{
            return "Kotlin"
        }
    }

    interface ProgramadorInterface{
        fun getProgramadorData(): ProgramadorData
    }

    data class ProgramadorData(
        val nombre :String,
        val edad: Int,
        val lenguaje: String
    )
}
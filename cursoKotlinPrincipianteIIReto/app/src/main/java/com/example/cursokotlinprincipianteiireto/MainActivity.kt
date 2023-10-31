package com.example.cursokotlinprincipianteiireto

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

val TAG=":::TAG"
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    botSeguridad()
    }
    private fun botSeguridad(){
        val persona= Persona("Josele",37, arrayListOf("juegos","Comida","Dormir","Programar"))
        if(persona.name=="Josele"){
            Log.d(TAG, "Bienvenido ${persona.name}")

            when(persona.age){
                in 0..17 ->{Log.d(TAG,"Tienes ${persona.age} años, eres demasiado joven, vete con mama")}
                in 18..64 ->{Log.d(TAG,
                    "Tienes ${persona.age} años, bienvenidos, eres mayor de edad")

                    for(hobby:String in persona.hobbies){
                        Log.d(TAG, "Te gusta ${hobby}")
                    }
                }
                else -> {Log.d(TAG,"Tienes ${persona.age} años, eres, demasiado mayor, vete al asilo")}

            }

        }else{
            Log.d(TAG,"Largo de aqui ${persona.name}")
        }
    }

    data class Persona(
        val name:String,
        val age:Int,
        val hobbies: ArrayList<String>

    )
}
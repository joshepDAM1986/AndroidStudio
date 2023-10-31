package com.example.cursokotlinprincipianteii

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

val TAG=":::TAG"
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //condicionalesIf()
        //condicinalesWhen()
        //listados()
        //bucleFor()
        //bucleWhile()
        //buclesDoWhile()
        //controlErrores()
        bucleTest()
    }

    private fun condicionalesIf() {
        val num1 = 10
        val num2 = 5
        val booleanValue = true

        if (num1 > 5) {
            Log.d(TAG, "primera opcion")
        } else if (booleanValue) {
            Log.d(TAG, "segunda opcion")
        } else {
            Log.d(TAG, "tercera opcion")
        }
        val edad: Int = if (!booleanValue) {
            17
        } else {
            26
        }
    }

    private fun condicinalesWhen() {
        val myNumber = 94
        when (myNumber) {
            //Rangos
            in 0..10 -> {
                Log.d(TAG, "se ha seleccionado kotlin o Scala")
            }

            40 -> {
                Log.d(TAG, "se ha seleccionado java")
            }

            in 80..119 -> {
                Log.d(TAG, "se ha seleccionado python")
            }

            120 -> {
                Log.d(TAG, "se ha seleccionado ruby")
            }

            else -> {
                Log.d(TAG, "ninguno de las anteriores")
            }
        }
    }

    private fun listados() {
        val myList: List<String> = listOf<String>("Rodrigo", "Raquel", "David", "Lorena", "Allison")
        val myArrayList: ArrayList<String> =
            arrayListOf("Rodrigo", "Raquel", "David", "Lorena", "Allison")

        //list[2]="Joshepe" //no se puede modificar
        val listItem: String = myList[4]

        myArrayList[2] = "Joshepe" //se puede modificar
        val arrayListItem: String = myArrayList[2]

        //borrar un item del arrayList
        //myArrayList.remove("Joshepe")//borramos el valor
        //myArrayList.removeAt(2)//borramos la posicion
        //myArrayList.clear()//limpiamos el listado
        //myArrayList.addAll(myList)//añadimos elementos al listado (eneste caso el listado list)
        myArrayList.sort()//ordenamos ascendentemente
        myArrayList.sortDescending()//ordenamos descendentemente
        Log.d(TAG, myArrayList.toString())
    }

    private fun bucleFor() {
        val myArrayList: ArrayList<String> =
            arrayListOf("Rodrigo", "Raquel", "David", "Lorena", "Allison")
        /*
        for(persona in myArrayList){ //Recorre el contenido del listado
            Log.d(TAG,persona)
        }

        for(position in 0 until 5){ //Recorre desde la posicion 0 hasta el 5
            Log.d(TAG,position.toString())
        }

        for(position in 0..10 step 2){ //Recorrec la posicion 0 hasta el 10 en intervalo de step
            Log.d(TAG,position.toString())
        }
        */
        for (position in 10 downTo 3) { //Cuenta atras desde 10 hasta 3
            Log.d(TAG, position.toString())
        }
    }

    //comprueba la condicion primero y despues ejecuta el contenido del while
    private fun bucleWhile() {
        var myNumber = 0

        while (myNumber <= 10) {
            Log.d(TAG, myNumber.toString())
            myNumber += 3 //aumenta my number de 3 en 3 hasta que llega a 10 (9 en este caso)
        }
    }

    //primero ejecuta el do almenos una vez y despues comprueba la condicion de while
    private fun buclesDoWhile() {
        var myNumber = 11

        do {
            Log.d(TAG, myNumber.toString())
            myNumber++
        } while (myNumber <= 10)
    }

    //Controla los errores en TIEMPO DE EJECUCION NO DE COMPILACION
    private fun controlErrores() {
        val myArraylist = arrayListOf(1, 2, 3, 4, 5)
        val myString: String = "Hola"
        try {
            for (position in 0..myArraylist.size) { //desde 0 hasta la longitud del array
                Log.d(TAG, myString)
            }
        } catch (exception: Exception) {
            exception.printStackTrace()
            Log.d(TAG, "Catch")
        } finally {
            Log.d(TAG, "Finally")
        }
    }

    private fun bucleTest() {
        for (i in 10 downTo 1) {
            Log.d(TAG, i.toString())
        }
    }
}

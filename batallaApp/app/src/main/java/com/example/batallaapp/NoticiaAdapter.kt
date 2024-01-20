package com.example.batallaapp

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class NoticiaAdapter(context: Context, noticias: List<Noticia>) : ArrayAdapter<Noticia>(context, 0, noticias) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var listItemView = convertView
        if (listItemView == null) {
            listItemView = LayoutInflater.from(context).inflate(R.layout.item_noticia, parent, false)
        }

        val currentNoticia = getItem(position)

        val tituloTextView: TextView = listItemView!!.findViewById(R.id.tituloNoticia)
        val descripcionTextView: TextView = listItemView.findViewById(R.id.descripcionNoticia)
        val tagTextView: TextView = listItemView.findViewById(R.id.tagNoticia)
        val imagenNoticiaView: ImageView = listItemView.findViewById(R.id.imagenNoticia)

        tituloTextView.text = currentNoticia?.tituloCorto
        descripcionTextView.text = currentNoticia?.descripcionCorta
        tagTextView.text = currentNoticia?.tag

        if (currentNoticia?.imagen != 0) {
            imagenNoticiaView.setImageResource(currentNoticia!!.imagen)
        }

        return listItemView
    }
}
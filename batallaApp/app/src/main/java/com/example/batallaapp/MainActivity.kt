package com.example.batallaapp

import android.content.Intent
import android.content.pm.ActivityInfo
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Spinner
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.core.content.ContextCompat
import androidx.core.graphics.drawable.DrawableCompat

data class Noticia(val tituloCorto: String, val tituloLargo: String, val descripcionCorta: String, val tag: String, val descripcionLarga: String, val imagen: Int, val urlVideo: String?)
class MainActivity : AppCompatActivity() {
    private lateinit var spinner: Spinner
    private lateinit var categories: Array<String>
    private lateinit var noticias: List<Noticia>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_PORTRAIT
        setContentView(R.layout.activity_main)
        val toolbar: Toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)
        val navigationIcon = toolbar.navigationIcon
        navigationIcon?.let {
            val color = ContextCompat.getColor(this, android.R.color.white)
            DrawableCompat.setTint(it, color)
        }
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setDisplayShowHomeEnabled(true)
        noticias = listOf(
            Noticia(
                "Golpe a la marihuana",
                "Golpe a la marihuana en Granada",
                "Cuatro detenidos y ocho investigados en Granada.",
                "Granada",
                "Este golpe policial es fruto de una investigación que arrancó a principios de julio de 2022 con el hallazgo de una plantación de marihuana al aire libre en la Baronia de Rialb (Noguera) regentada por una organización criminal que realizaba labores de cultivo, mantenimiento , cuidado y vigilancia de la plantación. Los investigadores iniciaron entonces una serie de vigilancias que concluyeron que en la plantación ilegal trabajaban al menos cuatro personas y que además estaban establecidas permanentemente en el cultivo en un lugar de difícil acceso situado en la montaña.\n \nCon el objetivo de desarticular el grupo criminal y evitar que introdujeran la droga en el mercado, el 6 de septiembre de 2022, los Mossos realizaron la entrada a esta plantación. En este caso, fue necesaria la presencia del Grupo Especial de Intervención debido a que los narcos suelen poner trampas peligrosas en los accesos de las plantaciones para evitar narcoasaltos o bien para retrasar las intervenciones policiales y dar a los integrantes más tiempo para la fuga.",
                R.drawable.mariguana,
                "XgSXU4E9LJI"
            ),
            Noticia(
                "Muerte de aficionado",
                "Muerte de aficionado al Granada C.F.",
                "Muere un aficionado tras sufrir un paro cardíaco en las gradas",
                "Granada",
                "El Granada - Athletic Club de la jornada 16 de LaLiga EA Sports que se estaba disputando en Los Cármenes ha sido suspendido por el fallecimiento de un aficionado por un paro cardíaco. La jueza de Competición ha decretado que el encuentro se reanude este lunes.\n \nEl árbitro Ortiz Arias decretó la suspensión en el minuto 18 y la megafonía del estadio avisó de un problema grave.\n \nEl partido estuvo interrumpido desde poco después de las cuatro y media, confirmándose la suspensión definitiva algo más de una hora después.\n \nEn el momento de la suspensión, en el minuto 18 del primer tiempo, el marcador era de 0-1 a favor del Athletic Club gracias a un tanto de Iñaki Williams en el minuto 6. Un varón de aproximadamente 70 años comenzó a convulsionar en zona de preferencia víctima de un infarto con parada cardiorrespiratoria, lo que provocó que numerosos aficionados de esa zona alertaran a los sanitarios.",
                R.drawable.granada,
                "aB9L1jfgMcs"
            ),
            Noticia(
                "El Rey en Granada",
                "El Rey Granada y el liderazgo empresarial",
                "El Rey destaca en Granada el papel clave del liderazgo empresarial en un escenario de incertidumbre global",
                "Granada",
                "El rey Felipe VI se ha referido este jueves, durante la clausura del XXII Congreso de Directivos CEDE que se ha celebrado en Granada, al nuevo escenario económico internacional y al elevado grado de incertidumbre existente, con las consecuencias derivadas del conflicto en Oriente Próximo y la guerra de Ucrania, para destacar el importante papel de los empresarios, y en particular de los directivos de las empresas, incidiendo en que de su buena gestión dependen \"económica y socialmente muchas familias\".\n \nEl Rey ha sido el encargado de clausurar pasado el mediodía el XXII Congreso de Directivos CEDE en el Palacio de Congresos de Granada, que este año ha llevado por título 'Hacia un nuevo liderazgo empresarial' y que ha contado con destacados líderes del panorama empresarial que han debatido desde la mañana sobre asuntos de calado como la incidencia del nuevo escenario geopolítico en la economía española o el futuro de la energía.",
                R.drawable.rey,
                "oTOCJZsBLmE"
            ),
            Noticia(
                "Accidente trágico",
                "Accidente trágico de alpinista Malagueño",
                "Muere un alpinista al caer desde 70 metros",
                "Granada",
                "Un alpinista de Málaga de 52 años ha perdido la vida este fin de semana tras sufrir una caída desde unos 70 metros de altura en una vertiente helada que pertenece al municipio granadino de Dílar. Según ha informado este lunes Emergencias 112, el accidente ocurrió sobre las 17:15 horas del domingo, cuando el centro coordinador recibió una llamada informando de que un alpinista había sufrido una caída desde una gran altura en los Tajos de La Virgen, una zona de difícil acceso de la sierra granadina.\n \nFuentes de la Guardia Civil han indicado que el siniestro tuvo lugar cuando la víctima, un hombre de 52 años y vecino de Málaga, se precipitó por una vertiente helada de esta cima, que alcanza los 3.000 metros de altitud.\n \nTras conocerse el accidente, hasta el lugar de los hechos se desplazaron efectivos sanitarios y ocho especialistas del Grupo de Rescate e Intervención en Montaña (Greim), movilizados por la complejidad de la intervención. Los agentes confirmaron la muerte del alpinista nada más llegar hasta el cuerpo. Las fuentes han añadido que para la evacuación del cadáver fue necesario utilizar maquinaria pisanieves de la estación de Sierra Nevada. Una vez evacuado, se activó el protocolo judicial para esclarecer las circunstancias del suceso.",
                R.drawable.alpinista,
                "ZnSf3RFXVrY"
            ),
            Noticia(
                "Denuncia de un testigo",
                "Denuncia de un testigo por el retraso en para el Granada - Atlethic",
                "Carrusel Deportivo ha entrevistado a un aficionado presente en el estadio del Granada.",
                "Granada",
                "Carrusel Deportivo ha entrevistado a un aficionado presente en el estadio del Granada y que ha relatado de esta manera lo sucedido en el trágico suceso.",
                R.drawable.denuncia,
                "cKljCE4_hy0"
            ),
            Noticia(
                "Desfile de Moda",
                "Desfile de Moda en Barcelona",
                "Las últimas tendencias de moda se presentaron en un desfile exclusivo.",
                "Moda",
                "Barcelona fue testigo del desfile de moda más esperado del año, donde diseñadores de renombre presentaron sus últimas creaciones. Celebridades y amantes de la moda se congregaron para presenciar este evento lleno de estilo y glamour.",
                R.drawable.moda,
                "aRegE4McnAw"
            ),
            Noticia(
                "Descubrimiento Científico",
                "Importante Descubrimiento Científico en Madrid",
                "Científicos anuncian un hallazgo revolucionario en el campo de la física cuántica.",
                "Ciencia",
                "Un equipo de investigadores en Madrid ha realizado un descubrimiento que podría cambiar la forma en que entendemos la realidad. Este avance en la física cuántica promete abrir nuevas posibilidades en la tecnología y la exploración del universo.",
                R.drawable.ciencia,
                "s_ZEZGr_UiQ"
            ),
            Noticia(
                "Evento Cultural",
                "Festival de Cine Internacional en Valencia",
                "Cineastas de todo el mundo presentan sus películas en el prestigioso festival.",
                "Cine",
                "Valencia se convierte en el epicentro del cine internacional con la celebración de un destacado festival. Directores, actores y amantes del cine se reúnen para disfrutar de una selección diversa de películas y discutir las últimas tendencias cinematográficas.",
                R.drawable.cine,
                "Mm_BfJEBY6o"
            ),
            Noticia(
                "Avances Tecnológicos",
                "Innovaciones Tecnológicas en Sevilla",
                "Empresas líderes presentan las últimas innovaciones tecnológicas en una feria especializada.",
                "Tecnología",
                "Sevilla se convierte en el escenario de las últimas novedades tecnológicas con la exhibición de productos innovadores. Desde inteligencia artificial hasta realidad virtual, la feria destaca los avances que están transformando la forma en que vivimos y trabajamos.",
                R.drawable.tecnologia,
                "aQRbXHGUdoU"
            ),
            Noticia(
                "Concierto en la Playa",
                "Concierto Exclusivo en la Playa de Málaga",
                "Artistas internacionales ofrecen un espectáculo musical frente al mar.",
                "Música",
                "La costa de Málaga se llena de música y alegría con un concierto único en la playa. Cantantes y bandas famosas deleitan a la audiencia con sus mejores éxitos mientras el sol se pone en el horizonte.",
                R.drawable.musica,
                "w5a8iTbtL2I"
            )
        )
        val adapter = NoticiaAdapter(this, noticias)
        val listView: ListView = findViewById(R.id.listView)
        listView.adapter = adapter
        listView.setOnItemClickListener { _, _, position, _ ->
            val selectedNoticia = if (spinner.selectedItemPosition == 0) {
                // Si no hay filtro seleccionado, usar la posición directamente
                noticias[position]
            } else {
                // Si hay un filtro, usar la lista filtrada
                filterNewsByCategory(noticias, spinner.selectedItem.toString())[position]
            }
            val intent = Intent(this@MainActivity, DetalleNoticiaActivity::class.java)
            intent.putExtra("titulo", selectedNoticia.tituloCorto)
            intent.putExtra("tituloLargo", selectedNoticia.tituloLargo)
            intent.putExtra("descripcion", selectedNoticia.descripcionCorta)
            intent.putExtra("tag", selectedNoticia.tag)
            intent.putExtra("descripcionLarga", selectedNoticia.descripcionLarga)
            intent.putExtra("imagen", selectedNoticia.imagen)
            intent.putExtra("urlVideo", selectedNoticia.urlVideo)
            startActivity(intent)
        }

        // Obtenemos el Spinner
        spinner = findViewById(R.id.spinner)
        // Obtener las categorias
        categories = resources.getStringArray(R.array.categories)
        // ArrayAdapter
        val adapterSpinner = ArrayAdapter(this, android.R.layout.simple_spinner_item, categories)
        adapterSpinner.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinner.adapter = adapterSpinner
        // Agregar un listener al Spinner para manejar la selección de categoría
        spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                val selectedCategory = categories[position]
                val filteredNews = filterNewsByCategory(noticias, selectedCategory)
                val adapter = NoticiaAdapter(this@MainActivity, filteredNews)
                val listView: ListView = findViewById(R.id.listView)
                listView.adapter = adapter
            }
            override fun onNothingSelected(parent: AdapterView<*>?) {
                // No es necesario hacer nada aquí en este caso
            }
        }
    }
    //    fun filterNewsByCategory(newsList: List<Noticia>, category: String): List<Noticia> {
//        val filteredList = mutableListOf<Noticia>()
//
//        for (noticia in newsList) {
//            // Supongamos que getDescription() devuelve la descripción de la noticia
//            if (noticia.tag.contains("Granada") && category == "Granada") {
//                filteredList.add(noticia)
//            } else if (noticia.tag.contains("Nacional") && category == "Nacional") {
//                filteredList.add(noticia)
//        }
//
//        return filteredList
//    }
    fun filterNewsByCategory(newsList: List<Noticia>, category: String): List<Noticia> {
        val filteredList = mutableListOf<Noticia>()
        for (noticia in newsList) {
            // Check if the news item's tags contain the selected category
            if (noticia.tag.contains(category, ignoreCase = true)) {
                filteredList.add(noticia)
            }
        }
        return filteredList
    }
    // Manejar el evento de clic en el botón de retroceso
    override fun onSupportNavigateUp(): Boolean {
        onBackPressedDispatcher.onBackPressed()
        return true
    }

}

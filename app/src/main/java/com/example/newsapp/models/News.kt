package com.example.newsapp.models


data class News(
    val titulo: String,
    val fecha: String,
    val imagen: String
)

val newsList = listOf(
    News(
        titulo = "El presidente de EE.UU. no muestra sifnos de arrepentimiento.",
        fecha = "febrero 08 - 2024",
        imagen = "https://upload.wikimedia.org/wikipedia/commons/thumb/1/19/January_2025_Official_Presidential_Portrait_of_Donald_J._Trump.jpg/250px-January_2025_Official_Presidential_Portrait_of_Donald_J._Trump.jpg"
    ),
    News(
        titulo = "Bañarse en la pscina del desierto de Cleopatra",
        fecha = "febrero 11 - 2024",
        imagen = "https://media.istockphoto.com/id/174998492/es/vector/nefertiti.jpg?s=612x612&w=0&k=20&c=Ycs5m8RbdlXCs3iyTqSfVliG2HGggxrDYlCyiwLWu4k="
    ),
    News(
        titulo = "Gigantes tecnológicos",
        fecha = "febrero 12 - 24",
        imagen  = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR6m_YKbhTk5QQF-WMLZME3neWRGuBx9gM7Ow&s"
    ),
    News(
        titulo = "El rover de Marte envia nuevas imágenes",
        fecha = "febrero 14 - 2024",
        imagen = "https://josevicentediaz.com/wp-content/uploads/2014/09/matt.jpg"
    )
)
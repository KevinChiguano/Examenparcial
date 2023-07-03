package com.chiguano.kevin.logic

import com.chiguano.kevin.data.Datos

class ListItems {
    fun getData(): List<Datos> {
        val data = arrayListOf<Datos>(
            Datos(
                "Lisa Park",
                "Volume at likestone student",
                "Hi Julia. Thanks for you interestin volume...",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRe0WlpTfF_YMAmAXHE3R30qHQI63YJAf9reA&usqp=CAU"

            ),
            Datos(
                "Elena Casarosa",
                "Portait special",
                "We'd like to announce a holiday portrait special...",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTUvYaJOC1XJEMneXwSLCUizp-FaD-75JIxkg&usqp=CAU"
            ),
            Datos(
                "Medium Daily Digest",
                "7 Drawings to make you feel better. Public..",
                "Medium Daily Digest get Medium for iOS or..",
                "https://cdns.iconmonstr.com/wp-content/releases/preview/2018/240/iconmonstr-medium-1.png"
            ),
            Datos(
                "Grace Ellington",
                "Voluntter opportunity",
                "I would like inform you of a volunteer opportunity...",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQtpwe4gV2OYx9BiAF9gOcFNsP9MlSaWMGdu7LDDFurkFACMu3Fi_BrirlRTpojJT3oaHU&usqp=CAU"
            ),
            Datos(
                "Henri Rouseeau",
                "Niagara fall pictures",
                "Julua, Here area the pictures of Niagara Falls y...",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRVccFL6lRXJwZPoVOI_FOlBBviLqT4YuI39A&usqp=CAU"
            ),
            Datos(
                "Olenna Mason",
                "Lakestone student art exhibition",
                "You're invited to Lakestone's annual student...",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcShLlUy8SWUQVeLhmOMKDQOhOWHUmdiJJ00N3ts-N0DKAZlWUmh35e91otDW0jdAZVOF0A&usqp=CAU"
            )
        )
        return data
    }
}
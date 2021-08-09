package ru.netology.category

import com.squareup.moshi.Moshi
import com.squareup.moshi.Types
import java.lang.reflect.ParameterizedType
import java.lang.reflect.Type

object DataEvent {

    private const val EventJson = """ [
  {
    "id": 0,
  "authorId": 0,
  "author": "yyyyyyyyy",
  "authorAvatar": "https://upload.wikimedia.org/wikipedia/en/4/45/Bloodshot_-_official_film_poster.jpeg",
  "content": "Выпускники Kotlin Developer",
  "published": 0,
  "type": "ONLINE",
  "link": "https://netology.ru/programs/android-app",
  "speakerIds": [1, 6],
  "attachment": {
    "url": "netology.jpg",
    "type": "IMAGE"
    }
  },
  
  {
        "id": 1,
  "authorId": 0,
  "author": "rrrrrrrrrrrrrr",
  "authorAvatar": "https://upload.wikimedia.org/wikipedia/en/4/45/Bloodshot_-_official_film_poster.jpeg",
  "content": "Выпускники Kotlin Developer",
  "published": 0,
  "type": "ONLINE",
  "link": "https://netology.ru/programs/android-app",
  "speakerIds": [1, 6],
  "attachment": {
    "url": "netology.jpg",
    "type": "IMAGE"
    }
  },
  
  {
        "id": 2,
  "authorId": 0,
  "author": "jjjjjjjjjjj",
  "authorAvatar": "https://upload.wikimedia.org/wikipedia/en/4/45/Bloodshot_-_official_film_poster.jpeg",
  "content": "Выпускники Kotlin Developer",
  "published": 0,
  "type": "ONLINE",
  "link": "https://netology.ru/programs/android-app",
  "speakerIds": [1, 6],
  "attachment": {
    "url": "netology.jpg",
    "type": "IMAGE"
    }
  }
] """

    private val parser = Moshi.Builder().build()

    val events: List<Event>? by lazy {
        parser
            .adapter<List<Event>>(List::class.java.withTypes(Event::class.java))
            .fromJson(EventJson)
    }



    private fun Type.withTypes(vararg types: Type): ParameterizedType = Types.newParameterizedType(this, *types)
}



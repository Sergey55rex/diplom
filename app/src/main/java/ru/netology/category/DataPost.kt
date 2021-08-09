package ru.netology.category

import com.squareup.moshi.Moshi
import com.squareup.moshi.Types
import java.lang.reflect.ParameterizedType
import java.lang.reflect.Type

object DataPost {

    private const val PostJson = """ [
  {
    "id": 1,
    " authorId": 1,
    "author": "1111111",
    "authorAvatar": "https://upload.wikimedia.org/wikipedia/en/4/45/Bloodshot_-_official_film_poster.jpeg",
    "content": "ffffffffff",
    "published": 0,
    "coords": {
    "lat": 55.751999,
    "long": 37.617734
    },
    "attachment": {
    "url": "netology.jpg",
    "type": "IMAGE"
    }
  },
  
  {
     "id": 2,
    " authorId": 1,
    "author": "2222222",
    "authorAvatar": "https://upload.wikimedia.org/wikipedia/en/e/e1/Joker_%282019_film%29_poster.jpg",
    "content": "jjjjjjjjjjjj",
    "published": 0,
    "coords": {
    "lat": 55.751999,
    "long": 37.617734
    },
    "attachment": {
    "url": "netology.jpg",
    "type": "IMAGE"
    }
  },
  
  {
     "id": 3,
    " authorId": 1,
    "author": "3333333",
    "authorAvatar": "https://upload.wikimedia.org/wikipedia/en/0/06/The_Gentlemen_poster.jpg",
    "content": "mmmmmmmmmmmm",
    "published": 0,
    "coords": {
    "lat": 55.751999,
    "long": 37.617734
    },
    "attachment": {
    "url": "netology.jpg",
    "type": "IMAGE"
    }
  },
  {
     "id": 3,
    " authorId": 1,
    "author": "3333333",
    "authorAvatar": "https://upload.wikimedia.org/wikipedia/en/4/45/Bloodshot_-_official_film_poster.jpeg",
    "content": "mmmmmmmmmmmm",
    "published": 0,
    "coords": {
    "lat": 55.751999,
    "long": 37.617734
    },
    "attachment": {
    "url": "netology.jpg",
    "type": "IMAGE"
    }
  }
] """

    private val parser = Moshi.Builder().build()

    val posts: List<Post>? by lazy {
        parser
            .adapter<List<Post>>(List::class.java.withTypes(Post::class.java))
            .fromJson(PostJson)
    }

    private fun Type.withTypes(vararg types: Type): ParameterizedType = Types.newParameterizedType(this, *types)
}


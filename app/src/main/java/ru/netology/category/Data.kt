package ru.netology.category

import com.squareup.moshi.Moshi
import com.squareup.moshi.Types
import java.lang.reflect.ParameterizedType
import java.lang.reflect.Type

object Data {
        private const val PostJson = """ [
  {
    "icon": "file:///android_asset/ducks/0f2b2bd3874567d7abeb673f6fb399d9.jpg",
    "count": 10,
    "author": "kkkkk"
  },
  {
    "icon": "file:///android_asset/ducks/1a35e28ea142168c363238497226c47b.jpg",
    "count": 2,
     "author": "yyyyy"
  },
  {
    "icon": "file:///android_asset/ducks/2c19fada99e69dd0ccc19d10355f9825.jpg",
    "count": 3,
     "author": "ffffff"
  }
] """

    private const val EventJson = """ [
  {
    "icon": "file:///android_asset/ducks/0f2b2bd3874567d7abeb673f6fb399d9.jpg",
    "count": 10,
    "author": "ffff"
  },
  {
    "icon": "file:///android_asset/ducks/1a35e28ea142168c363238497226c47b.jpg",
    "count": 2,
     "author": "ssssss"
  },
  {
    "icon": "file:///android_asset/ducks/2c19fada99e69dd0ccc19d10355f9825.jpg",
    "count": 3,
     "author": "vvv"
  }
] """

        private val parser = Moshi.Builder().build()

        val posts: List<Post>? by lazy {
            parser
                .adapter<List<Post>>(List::class.java.withTypes(Post::class.java))
                .fromJson(PostJson)
        }

    val event: List<Event>? by lazy {
        parser
            .adapter<List<Event>>(List::class.java.withTypes(Event::class.java))
            .fromJson(EventJson)
    }

        private fun Type.withTypes(vararg types: Type): ParameterizedType = Types.newParameterizedType(this, *types)
    }
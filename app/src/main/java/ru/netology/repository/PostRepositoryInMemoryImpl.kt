package ru.netology.repository

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import ru.netology.category.Post


class PostRepositoryInMemoryImpl: PostRepository {
    private var posts = listOf(
        Post(
        2,
        1,
        "Нетологияю Университет интернет - профессий будущего",
        "https://upload.wikimedia.org/wikipedia/en/4/45/Bloodshot_-_official_film_poster.jpeg",
        "Привет, это новая Нетология! Когда-то Нетология ",
        2,
        null,
        null
    ),
        Post(
            1,
            1,
            "Нетологияю Университет интернет - профессий будущего",
            "https://upload.wikimedia.org/wikipedia/en/4/45/Bloodshot_-_official_film_poster.jpeg",
            "Привет, это новая Нетология! Когда-то Нетология ",
            2,
            null,
            null
        )
    )
    private  val data = MutableLiveData(posts)
    override fun getAll(): LiveData<List<Post>> = data
    override fun removeById(id: Long) {
       posts = posts.filter { it.id != id }
        data.value = posts
    }
}
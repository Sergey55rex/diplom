package ru.netology.repository

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import ru.netology.category.Job


class JobRepositoryMemory: JobRepository {
    private var jobs = listOf(
        Job(
        0,
        1,
        "Нетологияю Университет интернет - профессий будущего",
        "https://upload.wikimedia.org/wikipedia/en/4/45/Bloodshot_-_official_film_poster.jpeg",
        "Привет, это новая Нетология! Когда-то Нетология ",
        2,
        null,
        null
    ),
        Job(
            0,
            1,
            "Нетологияю Университет интернет - профессий будущего",
            "https://upload.wikimedia.org/wikipedia/en/4/45/Bloodshot_-_official_film_poster.jpeg",
            "Привет, это новая Нетология! Когда-то Нетология ",
            2,
            null,
            null
        )

    )
    private  val data = MutableLiveData(jobs)
    override fun getAll(): LiveData<List<Job>> = data
    override fun removeById(id: Long) {
        TODO("Not yet implemented")
    }
}
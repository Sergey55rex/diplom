package ru.netology.repository

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import ru.netology.R
import ru.netology.category.Event
import ru.netology.category.Post

class EventRepositoryMemory: EventRepository {
    private var events = listOf(
        Event(

        2,
        1,
        "Нетологияю Университет интернет - профессий будущего",
        "https://upload.wikimedia.org/wikipedia/en/e/e1/Joker_%282019_film%29_poster.jpg",
        "Привет, это новая Нетология! Когда-то Нетология ",
        2,
        "",
        "",
        "",
        null
    ),
        Event(

            1,
            1,
            "Нетологияю Университет интернет - профессий будущего",
            "https://upload.wikimedia.org/wikipedia/en/e/e1/Joker_%282019_film%29_poster.jpg",
            "Привет, это новая Нетология! Когда-то Нетология ",
            2,
            "",
            "",
            "",
            null
        )

    )
    private  val data = MutableLiveData(events)
    override fun getAll(): LiveData<List<Event>> = data
    override fun removeById(id: Long) {
        TODO("Not yet implemented")
    }
}
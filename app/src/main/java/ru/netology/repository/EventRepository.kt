package ru.netology.repository

import androidx.lifecycle.LiveData
import ru.netology.category.Event
import ru.netology.category.Post

interface EventRepository {
    fun getAll(): LiveData<List<Event>>
    fun removeById(id:Long)
}
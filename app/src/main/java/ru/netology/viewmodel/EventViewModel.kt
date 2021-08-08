package ru.netology.viewmodel

import androidx.lifecycle.ViewModel
import ru.netology.repository.EventRepository
import ru.netology.repository.EventRepositoryMemory
import ru.netology.repository.PostRepositoryInMemoryImpl
import ru.netology.repository.PostRepository

class EventViewModel: ViewModel() {
    private val repository: EventRepository = EventRepositoryMemory()
    val data = repository.getAll()
    fun removeById(id:Long) = repository.removeById(id)
}
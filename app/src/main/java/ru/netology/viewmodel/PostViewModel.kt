package ru.netology.viewmodel

import androidx.lifecycle.ViewModel
import ru.netology.repository.PostRepositoryInMemoryImpl
import ru.netology.repository.PostRepository

class PostViewModel: ViewModel() {
    private val repository: PostRepository = PostRepositoryInMemoryImpl()
    val data = repository.getAll()
    fun removeById(id:Long) = repository.removeById(id)
}
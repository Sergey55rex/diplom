package ru.netology.viewmodel

import androidx.lifecycle.ViewModel
import ru.netology.repository.JobRepository
import ru.netology.repository.JobRepositoryMemory


class JobViewModel: ViewModel() {
    private val repository: JobRepository = JobRepositoryMemory()
    val data = repository.getAll()
    fun removeById(id:Long) = repository.removeById(id)
}
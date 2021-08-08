package ru.netology.repository

import androidx.lifecycle.LiveData
import ru.netology.category.Job


interface JobRepository {
    fun getAll(): LiveData<List<Job>>
    fun removeById(id:Long)
}
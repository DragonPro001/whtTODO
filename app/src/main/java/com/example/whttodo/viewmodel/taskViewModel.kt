package com.example.whttodo.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.viewModelScope
import androidx.room.Query
import com.example.whttodo.model.Task
import com.example.whttodo.repository.TaskRepository
import kotlinx.coroutines.launch

class taskViewModel(app: Application, private val taskRepository: TaskRepository):AndroidViewModel(app) {

    fun addTask(task: Task)=
        viewModelScope.launch {
            taskRepository.insertTask(task)
        }

    fun deleteTask(task: Task)=
        viewModelScope.launch {
            taskRepository.deleteTask(task)
        }

    fun updateTask(task: Task)=
        viewModelScope.launch {
            taskRepository.updateTask(task)
        }

    fun getAllNotes () =taskRepository.getAllTasks()

    fun searchTask (query: String?) =
        taskRepository.searchTask(query)



}
package com.example.whttodo.viewmodel

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewmodel.CreationExtras
import com.example.whttodo.repository.TaskRepository

class viewModelFactory(val app: Application, val taskRepository: TaskRepository):ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return taskViewModel(app,taskRepository)as T
    }
}
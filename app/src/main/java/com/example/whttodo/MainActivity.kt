package com.example.whttodo

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.lifecycle.ViewModelProvider
import com.example.whttodo.database.TaskDatabase
import com.example.whttodo.repository.TaskRepository
import com.example.whttodo.viewmodel.taskViewModel
import com.example.whttodo.viewmodel.viewModelFactory

class MainActivity : AppCompatActivity() {

    private lateinit var taskViewModel: taskViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setupViewModel()
    }

    private fun setupViewModel(){
        val taskRepository= TaskRepository(TaskDatabase(this))
        val viewModelProviderFactory = viewModelFactory(application,taskRepository)
        taskViewModel = ViewModelProvider(this,viewModelProviderFactory)[taskViewModel::class.java]
    }
}
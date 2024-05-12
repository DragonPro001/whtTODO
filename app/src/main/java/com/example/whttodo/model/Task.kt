package com.example.whttodo.model

import android.os.Parcelable
import androidx.room.Entity
import androidx.room.IMultiInstanceInvalidationCallback.Default
import androidx.room.PrimaryKey
import kotlinx.parcelize.Parcelize

@Entity(tableName = "tasks")
@Parcelize
data class Task(
    @PrimaryKey(autoGenerate = true)
    val id : Int,
    val taskTitle : String,
    val taskDes : String,
    val taskDone: Boolean = false
): Parcelable

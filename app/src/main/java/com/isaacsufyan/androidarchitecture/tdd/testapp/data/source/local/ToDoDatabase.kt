package com.isaacsufyan.androidarchitecture.tdd.testapp.data.source.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.isaacsufyan.androidarchitecture.tdd.testapp.data.Task

@Database(entities = [Task::class], version = 1, exportSchema = false)
abstract class ToDoDatabase : RoomDatabase() {

    abstract fun taskDao(): TasksDao
}

package com.example.domain.usecase.task

interface TaskDataSource {

    suspend fun createTask(
    ): Long
}
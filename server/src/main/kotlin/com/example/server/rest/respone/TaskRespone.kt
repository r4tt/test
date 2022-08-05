package com.example.server.rest.respone

data class TaskRespone(
    val code: Int = 0,
    val message: String = "success",
    val data: TaskDto? = null,
)
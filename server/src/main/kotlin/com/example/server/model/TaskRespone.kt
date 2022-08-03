package com.example.server.model

data class TaskRespone(
    val code: Int = 0,
    val message: String = "success",
    val data: String? = null,
)
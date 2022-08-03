package com.example.server.display

import kotlinx.datetime.Clock
import kotlinx.datetime.Instant

data class TaskDto(
    val id: String,
    val title: String,
    val description: String,
    val userId: String,
    var createdAt: Instant = Clock.System.now(),
    var updatedAt: Instant = Clock.System.now(),
)
package com.example.server.infrastructure.task

import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Column
import org.springframework.data.relational.core.mapping.Table
import kotlinx.datetime.Clock
import kotlinx.datetime.Instant
import java.util.*

@Table("tasks")
data class Task(
    @Id
    @Column("id")
    var id: UUID = UUID.randomUUID(),
    @Column("title")
    val title: String,
    @Column("description")
    val description : String,
    @Column("user_id")
    val userId: UUID? = null,
    @Column("created_at")
    var createdAt: Instant = Clock.System.now(),
    @Column("updated_at")
    var updatedAt: Instant = Clock.System.now(),
)
package com.example.server.infrastructure.user

import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Column
import org.springframework.data.relational.core.mapping.Table
import java.util.*

@Table("user")
data class user(
    @Id
    @Column("id")
    var id: UUID = UUID.randomUUID(),
    @Column("limit_task")
    var limitTask: Long,
)
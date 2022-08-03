package com.example.server.infrastructure.task

import com.example.domain.model.TaskEntity
import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Column
import org.springframework.data.relational.core.mapping.Table
import kotlinx.datetime.Clock
import kotlinx.datetime.Instant
import org.springframework.data.annotation.Transient
import org.springframework.data.domain.Persistable
import java.util.*

@Table("tasks")
data class Task(
    @Id
    @Column("id")
    var uid: UUID = UUID.randomUUID(),
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
) : Persistable<UUID> {

    @Transient
    internal var isNewTask: Boolean = true

    companion object {
        fun fromDomainModel(entity: TaskEntity): Task = Task(
            uid = UUID.fromString(entity.id),
            title = entity.title,
            description =  entity.description,
            userId = UUID.fromString(entity.userId),
        )
    }

    override fun getId() = uid

    override fun isNew() = isNewTask
}

fun Task.toDomainModel() : TaskEntity = TaskEntity(
    id = uid.toString(),
    title = title,
    description = description,
    userId = userId.toString()
)
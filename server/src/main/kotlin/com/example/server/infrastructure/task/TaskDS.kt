package com.example.server.infrastructure.task

import com.example.domain.usecase.task.TaskDataSource
import org.springframework.stereotype.Component
import org.springframework.transaction.annotation.Transactional

@Component
@Transactional
class TaskDS(
    private val taskRepo: TaskRepo,
) : TaskDataSource {

    override suspend fun createTask(): Long {
        taskRepo.save(
            Task(
                title = "dd",
                description = "1",
            )
        )
        return 1
    }

}
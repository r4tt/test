package com.example.domain.usecase.task

import com.example.domain.model.TaskRequest
import com.example.domain.usecase.UseCase
import org.springframework.context.annotation.Bean
import org.springframework.stereotype.Component


class CreateTask(

) : UseCase<CreateTask.CreateTaskParam, Int>() {

    override suspend fun run(params: CreateTaskParam): Int {
        return 1
    }
    data class CreateTaskParam(
        val taskRequest: TaskRequest
    ) : Params()
}
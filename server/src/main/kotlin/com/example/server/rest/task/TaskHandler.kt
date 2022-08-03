package com.example.server.rest.task

import com.example.domain.usecase.task.CreateTask
import com.example.server.model.TaskRequest
import com.example.server.model.TaskRespone
import org.springframework.stereotype.Component
import org.springframework.web.reactive.function.server.*


@Component
class TaskHandler(
    private val createTask: CreateTask,
) {

    suspend fun createTask(request: ServerRequest): ServerResponse {
        /*
        val req = request.awaitBody<TaskRequest>()
        val xx = createTask(
            CreateTask.CreateTaskParam(
               TaskRequest = req
            )
        )
        println(xx)

         */
        return ServerResponse.ok().bodyValueAndAwait(
            TaskRespone(
                data = "111"
            )
        )
    }
}
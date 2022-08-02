package com.example.server.infrastructure.task

import org.springframework.data.repository.kotlin.CoroutineCrudRepository
import java.util.*

interface TaskRepo: CoroutineCrudRepository<Task, UUID> {

}

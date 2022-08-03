package com.example.server.infrastructure.task

import org.springframework.data.repository.kotlin.CoroutineCrudRepository
import org.springframework.stereotype.Repository
import java.util.*

@Repository
interface TaskRepo: CoroutineCrudRepository<Task, UUID> {

}

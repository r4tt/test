package com.example.server.di

import com.example.domain.usecase.task.CreateTask
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class UseCaseModule {
    @Bean
    fun createTaskUseCase(

    ): CreateTask = CreateTask()
}
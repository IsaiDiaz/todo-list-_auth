package com.todo_list.auth.dto

import java.time.LocalDate

data class TaskDTO(
        val taskName: String,
        val description: String,
        val dueDate: LocalDate,
        val status: Boolean,
        val userId: Long
)
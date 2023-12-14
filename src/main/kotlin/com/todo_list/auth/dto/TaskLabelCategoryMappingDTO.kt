package com.todo_list.auth.dto

data class TaskLabelCategoryMappingDTO(
        val taskId: Long,
        val taskCategoriesId: Long,
        val taskLabelId: Long
)

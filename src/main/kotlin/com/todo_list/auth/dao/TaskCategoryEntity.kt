package com.todo_list.auth.dao

import jakarta.persistence.*

@Entity
@Table(name = "task_categories")
data class TaskCategoryEntity(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "task_categories_id")
        val taskCategoriesId: Long = 0,

        @Column(name = "category_name", nullable = false)
        val categoryName: String
)
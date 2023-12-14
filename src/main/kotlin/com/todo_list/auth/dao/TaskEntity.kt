package com.todo_list.auth.dao

import jakarta.persistence.*
import  java.time.LocalDate

@Entity
@Table(name = "task")
data class TaskEntity(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "task_id")
        val taskId: Long = 0,

        @Column(name = "task_name", nullable = false)
        val taskName: String,

        @Column(name = "description", nullable = false)
        val description: String,

        @Column(name = "due_date", nullable = false)
        val dueDate: LocalDate,

        @Column(name = "status", nullable = false)
        val status: Boolean,

        @ManyToOne
        @JoinColumn(name = "user_user_id", nullable = false)
        val user: UserEntity
)
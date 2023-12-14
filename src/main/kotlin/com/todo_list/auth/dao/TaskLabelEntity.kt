package com.todo_list.auth.dao

import jakarta.persistence.*

@Entity
@Table(name = "task_label")
data class TaskLabelEntity(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "task_label_id")
        val taskLabelId: Long = 0,

        @Column(name = "label_name", nullable = false)
        val labelName: String
)
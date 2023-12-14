package com.todo_list.auth.dao

import jakarta.persistence.*

@Entity
@Table(name = "task_label_category_mapping")
data class TaskLabelCategoryMappingEntity(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "task_label_category_mapping_id")
        val taskLabelCategoryMappingId: Long = 0,

        @ManyToOne
        @JoinColumn(name = "task_id", nullable = false)
        val task: TaskEntity,

        @ManyToOne
        @JoinColumn(name = "task_categories_id", nullable = false)
        val taskCategories: TaskCategoryEntity,

        @ManyToOne
        @JoinColumn(name = "task_label_id", nullable = false)
        val taskLabel: TaskLabelEntity
)
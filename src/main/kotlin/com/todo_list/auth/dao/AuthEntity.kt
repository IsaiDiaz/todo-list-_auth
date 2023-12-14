package com.todo_list.auth.dao

import jakarta.persistence.*


@Entity
@Table(name = "auth")
data class AuthEntity(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "auth_id")
        val authId: Long = 0,

        @Column(name = "username", nullable = false)
        val username: String,

        @Column(name = "secret", nullable = false)
        val secret: String,

        @ManyToOne
        @JoinColumn(name = "user_user_id", nullable = false)
        val user: UserEntity
)
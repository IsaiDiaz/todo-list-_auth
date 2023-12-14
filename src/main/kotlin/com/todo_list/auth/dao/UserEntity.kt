package com.todo_listusers.users.dao

import jakarta.persistence.*

@Entity
@Table(name = "\"user\"")
//@Table(name = "user")
data class UserEntity(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "user_id")
        val userId: Long = 0,

        @Column(name = "username", nullable = false)
        val username: String,

        @Column(name = "email", nullable = false)
        val email: String,

        @Column(name = "full_name", nullable = false)
        val fullName: String
)
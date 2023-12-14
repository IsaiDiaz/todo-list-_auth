package com.todo_list.auth.dto

data class AuthDTO(
        val username: String,
        val secret: String,
        val userId: Long
)
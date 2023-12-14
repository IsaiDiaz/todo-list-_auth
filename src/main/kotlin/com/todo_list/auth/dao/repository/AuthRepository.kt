package com.todo_list.auth.dao.repository

import com.todo_list.auth.dao.AuthEntity
import org.springframework.data.jpa.repository.JpaRepository

interface AuthRepository : JpaRepository<AuthEntity, Long> {
    fun existsByUsernameAndSecret(username: String, secret: String): Boolean
}
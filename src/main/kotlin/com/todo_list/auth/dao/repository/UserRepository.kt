package com.todo_list.auth.dao.repository

import com.todo_list.auth.dao.UserEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.query.Param
import java.util.*

interface UserRepository : JpaRepository<UserEntity, Long> {

    @Query("SELECT a FROM UserEntity a WHERE a.userId = :id")
    override fun findById(@Param("id") id: Long): Optional<UserEntity>

}
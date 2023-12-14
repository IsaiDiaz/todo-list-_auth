package com.todo_list.auth.api

import com.todo_list.auth.bl.AuthBl
import com.todo_list.auth.dto.AuthDTO
import com.todo_list.auth.dto.UserDTO
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*


@RestController
@RequestMapping("/api/v1/auth")
class authApi (
        private val authBl: AuthBl
        ){

    @GetMapping("/users/{userId}")
    fun getUserById(
            @PathVariable userId: Long
    ): ResponseEntity<UserDTO>{
        val user =  authBl.getUserById(userId)
        val userDTO = user?.let {
            UserDTO(
                it.username,
                user.email,
                user.fullName
        )
        }
        return ResponseEntity(userDTO, HttpStatus.OK)
    }

    @PostMapping("/users/authentication")
    fun authentication(
            @RequestBody authDTO: AuthDTO
    ): ResponseEntity<Map<String, Boolean>>{
        val exists = authBl.userExists(authDTO)
        val response = mapOf("exists" to exists)
        return ResponseEntity(response, HttpStatus.OK)
    }
}
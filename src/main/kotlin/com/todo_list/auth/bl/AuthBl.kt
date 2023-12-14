package com.todo_list.auth.bl

import com.todo_list.auth.dao.UserEntity
import com.todo_list.auth.dao.repository.AuthRepository
import com.todo_list.auth.dao.repository.UserRepository
import com.todo_list.auth.dto.AuthDTO
import org.springframework.stereotype.Service

@Service
class AuthBl(
        private val userRepository: UserRepository,
        private val authRepository: AuthRepository
) {

    fun getUserById(userId: Long): UserEntity?{
        val user = userRepository.findById(userId).orElse(null)
        if (user == null){
            return UserEntity(0, "", "", "")
        }else{
            return user
        }
    }

    fun userExists(authDTO: AuthDTO): Boolean{
        return authRepository.existsByUsernameAndSecret(authDTO.username, authDTO.secret)
    }

}
package com.morrie.preview.kotlin.user.service

import com.morrie.preview.kotlin.user.domain.User
import com.morrie.preview.kotlin.user.repository.UserRepository
import org.springframework.stereotype.Service

/**
 * Created by morrie kim on 2021/07/28.
 */
@Service
class UserService (private val userRepository: UserRepository){
    fun getAllUsers() : List<User> = userRepository.findAll()
}
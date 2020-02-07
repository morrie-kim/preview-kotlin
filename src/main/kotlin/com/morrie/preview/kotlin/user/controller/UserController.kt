package com.morrie.preview.kotlin.user.controller

import com.morrie.preview.kotlin.user.domain.User
import com.morrie.preview.kotlin.user.repository.UserRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

/**
 * Created by morrie kim on 2020/02/08.
 */
@RestController
@RequestMapping("/api/users")
class UserController(@Autowired private val userRepository: UserRepository) {
    @GetMapping("/")
    fun getAllUsers() : List<User> = userRepository.findAll()
}
package com.morrie.preview.kotlin.user.repository

import com.morrie.preview.kotlin.user.domain.User
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

/**
 * Created by morrie kim on 2020/02/08.
 */
@Repository
interface UserRepository : JpaRepository<User, Long> {
}
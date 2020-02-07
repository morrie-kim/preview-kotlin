package com.morrie.preview.kotlin.user.domain

import javax.persistence.*

/**
 * Created by morrie kim on 2020/02/08.
 */
@Entity
@Table(name = "user")
data class User(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id : Long = 0,
    val name : String = "",
    val address : String = "") {
}
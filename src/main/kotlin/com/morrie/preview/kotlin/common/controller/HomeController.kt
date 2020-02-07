package com.morrie.preview.kotlin.common.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

/**
 * Created by morrie kim on 2020/02/08.
 */
@RestController
class HomeController {
    @GetMapping("/api/home")
    fun index() : String = "First Kotlin + Spring Test"
}
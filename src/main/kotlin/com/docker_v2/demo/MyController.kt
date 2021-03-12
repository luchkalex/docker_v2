package com.docker_v2.demo

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class MyController {

    @GetMapping("/test")
    fun getData(): String{
        return "test mapping"
    }
}
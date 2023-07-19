package com.ezra.konsuma.controllers

import io.swagger.v3.oas.annotations.tags.Tag
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.web.bind.annotation.*

@CrossOrigin(origins = ["*"], maxAge = 3600)
@RestController
@RequestMapping("")
@Tag(name = "SMS", description = "This manages the sms sending.")
class SendController {

    private val logger: Logger = LoggerFactory.getLogger(SendController::class.java)

    @GetMapping("/send")
    fun sendSMS(
        @RequestParam("user")  user:String,
        @RequestParam("pass")  password:String,
        @RequestParam("from")  from:String,
        @RequestParam("to")  to:String,
        @RequestParam("text")  text:String,
        @RequestParam("mclass")  mclass:String
    ):String{
        logger.info("user: $user, pass: $password to: $to message: $text")
        return "SMS sent"
    }
}
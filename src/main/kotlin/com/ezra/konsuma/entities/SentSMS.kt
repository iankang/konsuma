package com.ezra.konsuma.entities

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import org.springframework.context.annotation.Primary
import org.springframework.web.bind.annotation.RequestParam
import java.util.Date

@Entity(name = "sms_sent_tbl")
data class SentSMS(
    var user:String,
    var password:String,
    var from:String,
    var to:String,
     var text:String,
     var mclass:String,
    var added:Date = Date(System.currentTimeMillis())
){
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    var id:Long = 0L
}

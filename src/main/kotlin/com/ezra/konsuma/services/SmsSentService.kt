package com.ezra.konsuma.services

import com.ezra.konsuma.entities.SentSMS
import com.ezra.konsuma.repositories.SentSMSRepository
import org.springframework.stereotype.Service

@Service
class SmsSentService(
    private val smsSentRepository:SentSMSRepository
) {
    
    fun saveSMSSent(  user:String,
                      password:String,
                      from:String,
                      to:String,
                      text:String,
                      mclass:String): SentSMS {

        val smsSent = SentSMS(
            user = user,
            password = password,
            from = from,
            to=to,
            text = text,
            mclass = mclass
        )

        return smsSentRepository.save(smsSent)
    }
}
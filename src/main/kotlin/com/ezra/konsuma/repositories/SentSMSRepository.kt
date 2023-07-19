package com.ezra.konsuma.repositories

import com.ezra.konsuma.entities.SentSMS
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface SentSMSRepository:JpaRepository<SentSMS,Long> {
}
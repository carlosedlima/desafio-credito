package me.dio.creditaplicationsystem.repository

import me.dio.creditaplicationsystem.entity.Credit
import org.springframework.data.jpa.repository.JpaRepository
import java.util.UUID

interface CreditRepository: JpaRepository<Credit,Long> {


    fun findByCreditCode(creditCode:UUID):Credit?

    fun findAllByCustomerID(customerId: Long):List<Credit>
}
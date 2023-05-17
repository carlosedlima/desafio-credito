package me.dio.creditaplicationsystem.service

import me.dio.creditaplicationsystem.entity.Credit
import java.util.UUID

interface ICreditService {

    fun saveCredit(credit: Credit):Credit

    fun findAllByCustomer(customerId:Long):List<Credit>

    fun findByCreditCode(customerId: Long,creditCode: UUID):Credit
}
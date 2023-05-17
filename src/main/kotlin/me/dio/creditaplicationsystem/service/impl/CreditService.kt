package me.dio.creditaplicationsystem.service.impl

import me.dio.creditaplicationsystem.entity.Credit
import me.dio.creditaplicationsystem.repository.CreditRepository

import me.dio.creditaplicationsystem.service.ICreditService
import org.springframework.stereotype.Service
import java.lang.RuntimeException

import java.util.*

@Service
class CreditService(
    private val creditRepository: CreditRepository,
    private val customerService: CustomerService
) : ICreditService {
    override fun saveCredit(credit: Credit): Credit {
        credit.apply {
            customer = customerService.findById(credit.customer?.id!!)
        }
        return this.creditRepository.save(credit)
    }

    override fun findAllByCustomer(customerId: Long): List<Credit> =
        this.creditRepository.findAllByCustomerID(customerId)

    override fun findByCreditCode(customerId: Long,creditCode: UUID): Credit {
        val credit : Credit = (this.creditRepository.findByCreditCode(creditCode)
            ?: throw RuntimeException("Credit code $creditCode not found"))
        return if (credit.customer?.id == customerId) credit else throw RuntimeException("Contact Admin")
    }


}
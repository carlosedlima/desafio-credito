package me.dio.creditaplicationsystem.service

import me.dio.creditaplicationsystem.entity.Customer

interface ICustomerService {

    fun save(customer:Customer):Customer

    fun findById(id:Long):Customer

    fun delete(id:Long)


}
package me.dio.creditaplicationsystem.controller

import me.dio.creditaplicationsystem.dto.CustomerDto
import me.dio.creditaplicationsystem.service.impl.CustomerService

import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/customers")
class CustomerResource(
    private val customerService:CustomerService
) {

    @PostMapping
    fun saveCustomer(@RequestBody customerDTO:CustomerDto):String{
        val savedCustomer = this.customerService.save(customerDTO.toEntity())
        return "Customer ${savedCustomer.email} saved!"
    }


}
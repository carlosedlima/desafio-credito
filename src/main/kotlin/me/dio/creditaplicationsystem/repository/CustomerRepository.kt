package me.dio.creditaplicationsystem.repository

import me.dio.creditaplicationsystem.entity.Customer
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface CustomerRepository: JpaRepository<Customer,Long>
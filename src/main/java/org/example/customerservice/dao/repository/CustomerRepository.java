package org.example.customerservice.dao.repository;

import org.example.customerservice.dao.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository  extends JpaRepository<Customer,Long> {
}

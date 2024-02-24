package com.webservice.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webservice.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order,Long> {

}

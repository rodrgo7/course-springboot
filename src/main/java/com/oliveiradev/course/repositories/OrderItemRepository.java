package com.oliveiradev.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.oliveiradev.course.entities.OrderItem;
import com.oliveiradev.course.entities.pk.OrderItemPk;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPk> {

}

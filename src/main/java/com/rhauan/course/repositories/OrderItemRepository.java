package com.rhauan.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rhauan.course.entities.OrderItem;
import com.rhauan.course.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}
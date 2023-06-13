package com.ust.CartService.repository;

import com.ust.CartService.model.CartModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CartRepo extends JpaRepository<CartModel,Integer> {
}

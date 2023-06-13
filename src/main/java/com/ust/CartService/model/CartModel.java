package com.ust.CartService.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public class CartModel {
        @Id
        @GeneratedValue
        private Integer id;
        private Integer pid;
        private  String pname;
        private  String pcolour;
        private Long psize;



    }

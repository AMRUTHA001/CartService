package com.ust.CartService.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Cartdto {
    @Id
    @GeneratedValue
    private Integer id;
    private Integer pid;
    private  String pname;
    private  String pcolour;
    private Long psize;

}

package com.ust.CartService.controller;
import com.ust.CartService.model.CartModel;
import com.ust.CartService.repository.CartRepo;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.swing.text.html.Option;
import java.util.Optional;

    @RestController
    @RequestMapping
    public class CartController {
        @Autowired
        private CartRepo crepo;

        @PostMapping("/addproduct")
        public ResponseEntity<CartModel> create(@RequestBody CartModel add){
            crepo.save(add);

            return ResponseEntity.ok().body(add);
        }

        @GetMapping("/product/{id}")
        public ResponseEntity<CartModel> getproductbyid(@PathVariable Integer id){
            Optional<CartModel> rate = crepo.findById(id);
            if (rate.isPresent()) {
                return ResponseEntity.ok().body(crepo.findById(id).orElse(null));
            } else {
                return ResponseEntity.noContent().build();
            }


        }


        @DeleteMapping("/delete/{id}")
        public ResponseEntity<Boolean> deleteproduct(@PathVariable Integer id){
            crepo.deleteById(id);
            return ResponseEntity.ok(null);

        }
    }



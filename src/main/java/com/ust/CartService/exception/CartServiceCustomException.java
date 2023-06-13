package com.ust.CartService.exception;

    public class CartServiceCustomException extends RuntimeException{

        private String errorCode;
        private int status;

        public CartServiceCustomException(String message, String errorCode, int status) {
            super(message);
            this.errorCode = errorCode;
            this.status = status;
        }

    }

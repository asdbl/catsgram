package com.yandex.practicum.catsgram.exceptions;

public class NotFoundException extends RuntimeException {
    public NotFoundException(String s) {
        super(s);
    }
}

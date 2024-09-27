package com.yandex.practicum.catsgram.exceptions;

public class ConditionsNotMetException extends RuntimeException {
    public ConditionsNotMetException(String s) {
        super(s);
    }
}

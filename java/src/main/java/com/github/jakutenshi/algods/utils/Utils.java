package com.github.jakutenshi.algods.utils;

public interface Utils {

    static void swap(Object first, Object second) {
        final var tmp = first;
        first = second;
        second = tmp;
    }

}

package com.paolo;

import java.util.Optional;

public class Optionals {
    public static void main(String[] args) {

        Optional<String> hello = Optional.ofNullable("hello");
        System.out.println(hello.isPresent());
        System.out.println(hello.isEmpty());

        String orElse = hello
                .map(String::toUpperCase)
//                .orElse("world");
                .orElseGet(() -> {
                    // EXTRA COMPUTATION TO RETRIEVE THE VALUE
                    return "world";
                });
//        hello.ifPresent(word -> {
//            System.out.println(word);
//        });
        hello.ifPresent(System.out::println);
        hello.ifPresentOrElse(System.out::println, () -> System.out.println("world"));
        System.out.println(orElse);
    }
}

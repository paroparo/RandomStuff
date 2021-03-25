package com.paolo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class StreamSample {

    public static void main(String[] args) {

        Random random = new Random();
        random.ints().limit(10).sorted().forEach(System.out::println);
        System.out.println("==============================");
        List<Integer> nums = Arrays.asList(3, 2, 1, 5, 2, 6);
        List<Integer> squaresList = nums.stream().map(i -> i*i).distinct().collect(Collectors.toList());
        System.out.println(squaresList);
        System.out.println("==============================");
        List<String> strings = Arrays.asList("abc", "dsafsdaf", "");
        Long count = strings.stream().filter(string -> string.isEmpty()).count();
        System.out.println(count);
        System.out.println("==============================");
        List<String> strings2 = Arrays.asList("Chopper", "the", "best", "dog", "ever");
        String filtered = strings2.stream().filter(string2 -> !string2.isEmpty()).collect(Collectors.joining(" "));
        System.out.println(filtered);
    }
}

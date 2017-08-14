package com.example.learning;

import com.example.learning.util.ArrayUtil;

import java.util.Arrays;
import java.util.stream.Collectors;

public abstract class BaseTest {
    protected int[] getRandomArray(int size, int bound) {
        return ArrayUtil.createRandomArray(size ,bound);
    }


    protected void display(int[] array, String message) {
        System.out.println(message);
        String value = Arrays.stream(array).mapToObj(Integer::toString).collect(Collectors.joining(","));
        System.out.println(value);
    }
}

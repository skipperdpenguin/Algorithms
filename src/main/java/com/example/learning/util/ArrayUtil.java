package com.example.learning.util;

import java.util.Random;

public class ArrayUtil {

    public static int [] createRandomArray(int size,int bound){
        int [] array = new int[size];
        Random random = new Random();
        for(int i=0;i<size;i++){
            array[i]=random.nextInt(bound);
        }
        return array;
    }
}

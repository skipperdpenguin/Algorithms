package com.example.learning;

import com.example.learning.sorting.Sorters;
import com.example.learning.util.ArrayUtil;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.stream.Collectors;

public class SortingTest extends BaseTest{

    @Test
    public void bubbleSortTest(){

        int [] unsortedArray =getRandomArray(10,100);
        display(unsortedArray,"Before bubbleSort");
        int [] sortedArray = Sorters.bubbleSort(unsortedArray);
        display(sortedArray,"After Sort..");
    }

    @Test
    public void insertionSortTest(){

        int [] unsortedArray = getRandomArray(10,100);
        display(unsortedArray,"Before insertionSort");
        int [] sortedArray = Sorters.insertionSort(unsortedArray);
        display(sortedArray,"After Sort..");
    }

    @Test
    public void mergeSortTest(){
        int [] unsortedArray = getRandomArray(10,100);
        display(unsortedArray,"Before mergeSort");
        int [] sortedArray = Sorters.mergeSort(unsortedArray);
        display(sortedArray,"After Sort..");
    }

}


package com.example.learning;

import com.example.learning.search.Search;
import com.example.learning.sorting.Sorters;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SearchTest extends BaseTest{

    @Test
    public void binarySearchTest(){
        int [] randomArray = getRandomArray(20,100);
        int search = randomArray[10];
        int [] sortedArray = Sorters.insertionSort(randomArray);
        display(sortedArray,"Searching "+search+" in array");
        int result = Search.binarySearch(sortedArray,search);
        Assertions.assertEquals(search,sortedArray[result]);
        System.out.println("value "+search+" is found at index "+result);
        int [] upperbound = {0,10,14,15,22,22,25,29,30,33,41,46,47,48,67,76,77,98,98,99};
        result = Search.binarySearch(upperbound,99);
        System.out.println("value "+99+" is found at index "+result);

    }


}

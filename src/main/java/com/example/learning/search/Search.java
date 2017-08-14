package com.example.learning.search;

public class Search {

    public static int binarySearch(int [] sortedArray, int q){
        return find(sortedArray,0,sortedArray.length-1,q);

    }


    private static int find(int [] sortedArray,int startIndex,int endIndex,int q){
        if(endIndex==startIndex){
            if(sortedArray[endIndex]==q){
                return endIndex;
            }else{
                return -1;
            }
        }else{
            int index = (startIndex+endIndex)/2;
            System.out.println("start="+startIndex+"end="+endIndex+"index="+index);
            int value = sortedArray[index];
            if(value==q){
                return index;
            }else if(q < value){
                return find(sortedArray,startIndex,index,q);
            }else{
                return find(sortedArray,index+1,endIndex,q);
            }
        }
    }


}

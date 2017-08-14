package com.example.learning.sorting;

public class Sorters {

    public static int [] bubbleSort(int [] unsortedArray){
        for(int i=0;i<unsortedArray.length;i++){
            for(int j=0;j < unsortedArray.length;j++){
                if(unsortedArray[i]<unsortedArray[j]){
                    swap(unsortedArray,i,j);
                }
            }
        }
        return unsortedArray;
    }

    private static void swap(int[] array,int index1,int index2 ){
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static int [] insertionSort(int [] unsortedArray){
        for (int i=1; i< unsortedArray.length;i++){
            int j = i-1;
            int key = unsortedArray[i];
            while(j>= 0 && key <unsortedArray[j] ){
                unsortedArray[j+1]=unsortedArray[j];
                --j;
            }
            unsortedArray[j+1]=key;
        }
        return unsortedArray;
    }

    public static int [] mergeSort(int [] unsortedArray){

        return mSort(unsortedArray,0,unsortedArray.length-1);
    }

    private static  int [] mSort(int [] array,int startIndex,int endIndex){

        if(startIndex==endIndex){
            int [] result = new int[1];
            result[0]=array[startIndex];
            return result;
        }
        int middle = (endIndex+startIndex)/2;
        //System.out.println("start="+startIndex+"end="+endIndex+"middle="+middle);
        int [] leftArray = mSort(array,startIndex,middle);
        int [] rightArray = mSort(array,middle+1,endIndex);
        return merge(leftArray,rightArray);
    }

    private static int [] merge(int [] array1, int [] array2){
        int size = array1.length+array2.length;
        int [] result = new int[size];
        int array2count =0;
        int resultCount = 0;
        int array1count= 0;
        while(resultCount<size){
            if(array1count<array1.length && array2count<array2.length){
                if(array1[array1count]<=array2[array2count]){
                    result[resultCount++] = array1[array1count++];
                }else{
                    result[resultCount++] = array2[array2count++];
                }
            }else if(array1count<array1.length) {
                result[resultCount++] = array1[array1count++];
            }else{
                result[resultCount++] = array2[array2count++];
            }
        }
        return result;
    }


    public static int [] quickSort(int [] unsortedArray){


        return unsortedArray;
    }





}

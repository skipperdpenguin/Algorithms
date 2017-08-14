package com.example.learning.problems;

public class PivotPoint {

    public static int findPivot(int [] rotatedArray){
        return find(rotatedArray,0,rotatedArray.length-1);
    }

    private static int find(int[] rotatedArray, int startIndex, int endIndex) {
        if (startIndex==endIndex){
            return startIndex;
        }
        int index = (startIndex+endIndex)/2;
        int startElem = rotatedArray[startIndex];
        int endElem = rotatedArray[endIndex];
        int middleItem = rotatedArray[index];

        if (startElem>=middleItem) {
            return find(rotatedArray, startIndex, index);
        } else if(endElem<middleItem){
            return find(rotatedArray,index+1,endIndex);
        }else{
            return find(rotatedArray,index+1,endIndex);
        }


    }
}

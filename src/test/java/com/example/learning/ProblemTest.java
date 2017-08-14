package com.example.learning;

import com.example.learning.problems.PivotPoint;
import org.junit.jupiter.api.Test;

public class ProblemTest extends BaseTest {

    @Test
    public void testPivotLeft(){
        int [] leftpivot = {67,76,77,98,98,99,0,10,14,15,22,22,25,29,30,33,41,46,47,48};
        int value = PivotPoint.findPivot(leftpivot);
        System.out.println(leftpivot[value]);
    }


    @Test
    public void testPivotRight(){
        int [] rightpivot = {22,22,25,29,30,33,41,46,47,48,67,76,77,98,99,99,0,10,14,15};
        int value = PivotPoint.findPivot(rightpivot);
        System.out.println(rightpivot[value]+"index="+value);
    }
}

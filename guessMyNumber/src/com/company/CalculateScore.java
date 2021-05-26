package com.company;

public class CalculateScore {
    void score(int x, int y) {
        System.out.println("Number is " + x);
        if(x>y){
            System.out.println("Your Score is "+ (100-(x-y)));
        }else{
            System.out.println("Your Score is "+ (100-(y-x)));
        }
    }
}

package com.twschool.practice;

import java.util.HashSet;

public class NumberGame {
    private final int  Length = 4 ;
    private  final String errMessage = "Wrong Input，Input again";
    private  final String correctMessage = "all wrong";

    public String numberCompar(int[] inputNumber, int[] answerNumber) {
        String gameResult = null ;
        if(inputNumber.length < Length || !repeatNumber(inputNumber)){
            gameResult = errMessage;
        }
//        else if()


        return errMessage;
    }

    public boolean repeatNumber(int[] inputNumber){
        HashSet<Integer> hashSet = new HashSet<Integer>();
        for (int i = 0; i < inputNumber.length; i++){
                hashSet.add(inputNumber[i]);
        }
        if (hashSet.size() == inputNumber.length){
            return true;
        }else {
              return false;
        }
    }
}

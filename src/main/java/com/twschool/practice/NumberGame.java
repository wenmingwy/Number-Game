package com.twschool.practice;

import java.util.HashSet;

public class NumberGame {
    private  final int  Length = 4 ;
    private  final String errMessage = "Wrong Input，Input again";
    private  final String allWrongMessage = "all wrong";

    public String numberCompar(int[] inputNumber, int[] answerNumber) {
        String gameResult = null ;
        if(inputNumber.length < Length || !repeatNumber(inputNumber)){
            gameResult = errMessage;
        } else{
            gameResult = compare(inputNumber,answerNumber);
        }
        return gameResult;
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

    public String compare(int[] inputNumber, int[] answerNumber){
        String msg = "" ;
        int beforeA = 0;
        int beforeB = 0;
        for(int i=0;i<Length;i++){
            for(int k=0;k<Length;k++){
                if(answerNumber[i] == inputNumber[k] && i==k){
                    beforeA ++ ;
                }else if(answerNumber[i] == inputNumber[k] && i!=k){
                    beforeB ++ ;
                }
            }
        }
        if(beforeA == Length){
            msg = "win, all correct";
        }else if(beforeA==0 && beforeB == 0){
            msg = allWrongMessage;
        }else{
            msg = String.valueOf(beforeA) + "A" + String.valueOf(beforeB) + "B" ;
        }
        return msg;
    }
}

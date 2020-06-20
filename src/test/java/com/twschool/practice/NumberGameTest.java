package com.twschool.practice;

import org.junit.Assert;
import org.junit.Test;

public class NumberGameTest {
    @Test
    public void should_return_wrong_input_given_1_1_2_3(){
//        given
        int [] inputNumber = {1,1,2,3};
        int [] answerNumber = {1,2,3,4};
//        when
        NumberGame numberGame = new NumberGame();
        String result = numberGame.numberCompar(inputNumber,answerNumber);
//        then
        Assert.assertEquals("Wrong Input，Input again",result);
    }

}


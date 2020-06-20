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

    @Test
    public void should_return_wrong_input_given_1_2(){
//        given
        int [] inputNumber = {1,2};
        int [] answerNumber = {1,2,3,4};
//        when
        NumberGame numberGame = new NumberGame();
        String result = numberGame.numberCompar(inputNumber,answerNumber);
//        then
        Assert.assertEquals("Wrong Input，Input again",result);
    }


    @Test
    public void should_return_win_all_correct_given_1_2_3_4(){
//        given
        int [] inputNumber = {1,2,3,4};
        int [] answerNumber = {1,2,3,4};
//        when
        NumberGame numberGame = new NumberGame();
        String result = numberGame.numberCompar(inputNumber,answerNumber);
//        then
        Assert.assertEquals("win, all correct",result);
    }

    @Test
    public void should_return_1_A_2_B_given_0_3_2_4(){
//        given
        int [] inputNumber = {0,3,2,4};
        int [] answerNumber = {1,2,3,4};
//        when
        NumberGame numberGame = new NumberGame();
        String result = numberGame.numberCompar(inputNumber,answerNumber);
//        then
        Assert.assertEquals("1A2B",result);
    }

    @Test
    public void should_return_all_wrong_given_5_6_7_8(){
//        given
        int [] inputNumber = {5,6,7,8};
        int [] answerNumber = {1,2,3,4};
//        when
        NumberGame numberGame = new NumberGame();
        String result = numberGame.numberCompar(inputNumber,answerNumber);
//        then
        Assert.assertEquals("all wrong",result);
    }

    @Test
    public void should_return_0_A_4_B_given_4_3_2_1(){
//        given
        int [] inputNumber = {4,3,2,1};
        int [] answerNumber = {1,2,3,4};
//        when
        NumberGame numberGame = new NumberGame();
        String result = numberGame.numberCompar(inputNumber,answerNumber);
//        then
        Assert.assertEquals("0A4B",result);
    }

    @Test
    public void should_return_1_A_2_B_given_3_5_8_4(){
//        given
        int [] inputNumber = {0,3,2,4};
        int [] answerNumber = {1,2,3,4};
//        when
        NumberGame numberGame = new NumberGame();
        String result = numberGame.numberCompar(inputNumber,answerNumber);
//        then
        Assert.assertEquals("1A2B",result);
    }


}


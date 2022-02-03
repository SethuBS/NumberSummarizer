package com.numberRangeSummarizer;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by SethuBudaza on 2022/02/03.
 */

public class NumberSummarizerImplTest {

    @Test
    public void testCollectedNumbers(){
        NumberSummarizerImpl test = new NumberSummarizerImpl();
        String numbers = "1,3,4,6,7,103,104,107,108,109,110,115,188,189,192,20";
        Collection<Integer> result =test.collect(numbers);
        assertEquals(Arrays.asList(1, 3, 4, 6, 7, 20, 103, 104, 107, 108, 109, 110, 115, 188, 189, 192),result);

    }

    @Test
    public void testSummarizedCollection(){

        NumberSummarizerImpl test = new NumberSummarizerImpl();
        Collection<Integer> listCollected =  Arrays.asList(1,3,6,7,8,12,13,14,15,21,22,23,24,31);
        String summarizedstr = test.summarizeCollection(listCollected);
        System.out.println(summarizedstr);

        assertEquals("1, 3, 6-8, 12-15, 21-24, 31",summarizedstr);
    }

}

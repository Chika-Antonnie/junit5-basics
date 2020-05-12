package io.chika.utils;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_METHOD)
public class MathUtilTest {

    MathUtil mathUtil;

    @BeforeEach
    void init(){
        mathUtil = new MathUtil();
    }

    @Test
    void testAddmethod(){
        int expectedOutput = 2;
        int actualOutput = mathUtil.addNumbers(1,1);

        assertEquals(expectedOutput,actualOutput);
    }


    @Test
    void testDivideMethod(){
        assertThrows(ArithmeticException.class, ()-> mathUtil.divideNumbers(1,0),"Should throw divide by 0 exception");
    }

    @Test
    @Disabled
    void disabledTest(){
        fail("This test should not run because it is disabled");
    }

}

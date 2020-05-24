package io.chika.utils;


import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.*;

@TestInstance(TestInstance.Lifecycle.PER_METHOD)
@DisplayName("When testing the mathutil class")
public class MathUtilTest {

    MathUtil mathUtil;

    @BeforeEach
    void init(){
        mathUtil = new MathUtil();
    }


    @Nested //a nested test class can also be used to run tests.when one test method fails, the entire class is marked as failed.
    class addTest{
        @Test
        void testAddPositive(){
            boolean serverUp = true;
            int expectedOutput = 2;
            int actualOutput = mathUtil.addNumbers(1,1);
            assumeTrue(serverUp);
            assertEquals(expectedOutput,actualOutput);
        }

        @Test
        void testAddNegative(){
            int expectedOutput = -2;
            int actualOutput = mathUtil.addNumbers(-1,-1);
            assertEquals(expectedOutput,actualOutput);
        }

        @Test
        void testAdd(){
            int expectedOutput = -1;
            int actualOutput = mathUtil.addNumbers(-3,2);
            assertEquals(expectedOutput,actualOutput);
        }
    }

    @Test
    @DisplayName("Test Multiplication")
    void testMultiply(){
        assertAll(
                    ()->assertEquals(4,mathUtil.multiplyNumbers(2,2)),
                    ()->assertEquals(6,mathUtil.multiplyNumbers(-2,-3)),
                    ()->assertEquals(0,mathUtil.multiplyNumbers(8,0)),
                    () -> assertEquals(-6,mathUtil.multiplyNumbers(2,-3))
                );
    }


    @Test
    @DisplayName("Test division Method")
    void testDivideMethod(){
        assertThrows(ArithmeticException.class, ()-> mathUtil.divideNumbers(1,0),"Should throw divide by 0 exception");
    }

    @Test
    @Disabled
    void disabledTest(){
        fail("This test should not run because it is disabled");
    }

}

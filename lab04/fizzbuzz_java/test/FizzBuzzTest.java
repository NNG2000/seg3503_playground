package test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import src.FizzBuzz;

class FizzBuzzTest {
    /*test failed */
    @Test
    void test1(){
      assertEquals("fizz", FizzBuzz.fizzbuzz(1));
    }
    /*test failed */
    @Test
    void test2(){
      assertEquals("0", FizzBuzz.fizzbuzz(0));
    }
    /*test failed */
    @Test
    void test3(){
      assertEquals("5", FizzBuzz.fizzbuzz(5));
    }
    /*test passed */
    @Test
    void test4(){
      assertEquals("FizzBuzz", FizzBuzz.fizzbuzz(0));
    }


}

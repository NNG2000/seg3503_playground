package test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import src.FizzBuzz;

class SecondFizzBuzzTest {
    /*test passed */
    @Test
    void test4(){
      assertEquals("FizzBuzz", FizzBuzz.fizzbuzz(15));
    }
    /*test passed */
    @Test
    void test5(){
    assertEquals("Buzz", FizzBuzz.fizzbuzz(25));
    }
    /*test passed */
    @Test
    void test1(){
      assertEquals("fizz", FizzBuzz.fizzbuzz(9));
    }
    /*test failed */
    @Test
    void test2(){
      assertEquals("2", FizzBuzz.fizzbuzz(2));
    }
    /*test failed */
    @Test
    void test3(){
      assertEquals("11", FizzBuzz.fizzbuzz(11));
    }
    


}

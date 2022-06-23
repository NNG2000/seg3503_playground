package test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import src.FizzBuzz;

class FizzBuzzTest {
    @Test
    void test1(){
      assertEquals("fizz", FizzBuzz.fizzbuzz(1));
    }
    @Test
    void test2(){
      assertEquals("0", FizzBuzz.fizzbuzz(0));
    }

}

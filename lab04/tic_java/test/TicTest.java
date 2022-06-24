package test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;



import org.junit.jupiter.api.Test;
import src.Tic;

class TicTest {
    /*test passed */
    @Test
    void test1(){
        Tic t = new Tic(1,7);
        String expected = "_|_|_|_|_|_|_";
        assertEquals(expected,t.to_String(false));
    }
     /*test passed */
    @Test
    void test2(){
        Tic t = new Tic(2,1);
        String expected = """
            _
            _
            """;
        assertEquals(expected.trim(),t.to_String(false));
    }
     /*test passed */
    @Test
    void test3(){
        Tic t = new Tic(3,4);
        String expected = """
            0|1|2|3
            4|5|6|7
            8|9|10|11
            """;
        assertEquals(expected.trim(),t.to_String(true));
    }
/*test failed */
    @Test
    void test4(){
        Tic t = new Tic(3,4);
        String expected = """
            0|1|2|3
            4|5|6|7
            8|9|_|11
            """;
        assertEquals(expected.trim(),t.to_String(true));
    }
    @Test
    void test5(){
        Tic t = new Tic();
        String expected = """
        _|_|_
        _|_|_
        _|_|_
        """;
        assertEquals(expected.trim(),t.to_String(true));
    }
}

package solutions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionClassTest {
    SolutionClasses implement = new SolutionClasses();
    //Testing the longestSequence function
    @Test
    public void testSequence(){
        var actualResult = implement.longestSequence("hello");
        Assertions.assertEquals("{l : 2}", actualResult);
    }
    @Test
    public void testSequence2(){
        var actualResult = implement.longestSequence("h e l l o ");
        Assertions.assertEquals("{l : 2}", actualResult);
    }
    @Test
    public void testSequence3(){
        var actualResult = implement.longestSequence("dghhhmhmx");
        Assertions.assertEquals("{h : 3}", actualResult);
    }
    @Test
    public void testSequence4(){
        var actualResult = implement.longestSequence("dhkkhhKKKt");
        Assertions.assertEquals("{k : 3}", actualResult);
    }
    @Test
    public void testSequence5(){
        var actualResult = implement.longestSequence("aBbBadddadd");
        Assertions.assertEquals("{b : 3}", actualResult);
    }
    //Testing the balance function
    @Test
    public void testBalance(){
        var actualResult = implement.balance(10000, 1, 20000, 1, 2);
        Assertions.assertEquals(10201.0, actualResult);
    }
    @Test
    public void testBalance2(){
        var actualResult = implement.balance(25000, 2, 20000, 1, 2);
        Assertions.assertEquals(25904.5, actualResult);
    }
    @Test
    public void testBalance3(){
        var actualResult = implement.balance(19800, 2, 20000, 1, 2);
        Assertions.assertEquals(20597.96, actualResult);
    }
    @Test
    public void testReverseString(){
        var actualResult = implement.reverseString("abcb");
        Assertions.assertEquals("bcba", actualResult);
    }
    @Test
    public void testReverseString2(){
        var actualResult = implement.reverseString("test");
        Assertions.assertEquals("tset", actualResult);
    }
    @Test
    public void testReverseString3(){
        var actualResult = implement.reverseString("racecar");
        Assertions.assertEquals("racecar", actualResult);
    }
}

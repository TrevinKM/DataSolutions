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
    //test the reverse string function
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
    //test the time class
    Time t = new Time(1,30,20);
    @Test
    public void testTime(){
        var actualResult = t.timeString();
        Assertions.assertEquals("01:30:20", actualResult);
    }
    @Test
    public void testScale(){
        t.scale(40);
        var actualResult = t.timeString();
        Assertions.assertEquals("01:31:00", actualResult);
    }

    Time u = new Time(1,100,0);
    @Test
    public void testTime2(){
        var actualResult = u.timeString();
        Assertions.assertEquals("02:40:00", actualResult);
    }
    @Test
    public void testScale2(){
        u.scale(3600);
        var actualResult = u.timeString();
        Assertions.assertEquals("03:40:00", actualResult);
    }

    Time v = new Time(23,59,60);
    @Test
    public void testTime3(){
        var actualResult = v.timeString();
        Assertions.assertEquals("00:00:00", actualResult);
    }
    @Test
    public void testScale3(){
        v.scale(80);
        var actualResult = v.timeString();
        Assertions.assertEquals("00:01:20", actualResult);
    }
}

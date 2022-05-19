package solutions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionClassTest {
    SolutionClasses implement = new SolutionClasses();

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
}

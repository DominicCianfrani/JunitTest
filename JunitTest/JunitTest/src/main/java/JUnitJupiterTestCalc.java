import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;
public class JUnitJupiterTestCalc {

    private final Calculate calc = new Calculate();
    @Test
    void subtraction1() {
        assertEquals(0.0, calc.sub(1.0,1.0));
    }
    @Test
    void addition2() {
        assertEquals(2.0, calc.add(1.0,1.0));
    }
    @Test
    void divison3(){
        assertEquals(3.0, calc.div(9.0,3.0));
    }
    @Test
    void multiply4(){
        assertEquals(4.0, calc.mul(4.0,1.0));
    }


}

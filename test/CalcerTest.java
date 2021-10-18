import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

public class CalcerTest {
    Calcer calcer;
    @BeforeEach
    void setUp(){
        calcer = new Calcer();
    }
    @Test
    void calcAreaNormal1Test(){
        double aSide = 30;
        double bSide = 35;
        double cSide = 40;
        double dSide = 45;
        calcer.setSides(aSide, bSide, cSide, dSide);
        double actual = calcer.calcArea();
        double expected = 1374.77;
        assertEquals(expected, actual, 0.01);
    }
}

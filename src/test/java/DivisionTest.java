import org.junit.Assert;
import org.junit.Test;
/**
 * Created by Danylo Pidtiagyn on 10.09.2016.
 */
public class DivisionTest {

    Operations Operations = new Operations();
    int result;
    int a;
    int b;

    @Test
    public void DivisionPositiveNumbersTest(){
        a = 30;
        b = 10;
        result = Operations.Division(a,b);
        Assert.assertEquals(3, result);
    }

    @Test
    public void DivisionNegativeNumbersTest(){
        a = 20;
        b = -5;
        result = Operations.Division(a,b);
        Assert.assertEquals(-4, result);
    }

    @Test (expected=ArithmeticException.class)
    public void DivisionOnZeroTest() {
        a = -8;
        b = 0;
        Operations.Division(a, b);
    }
}

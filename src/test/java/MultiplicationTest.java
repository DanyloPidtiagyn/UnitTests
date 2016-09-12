import org.junit.Assert;
import org.junit.Test;
/**
 * Created by Danylo Pidtiagyn on 10.09.2016.
 */
public class MultiplicationTest {

    Operations Operations = new Operations();
    int a;
    int b;
    int result;

    @Test
    public void MultiplicationNumbersTest(){
        a = 10;
        b = 13;
        result = Operations.Multiplication(a,b);
        Assert.assertEquals(130, result);
    }

    @Test
    public void MultiplicationNegativeNumbersTest(){
        a = -8;
        b = -5;
        result = Operations.Multiplication(a,b);
        Assert.assertEquals(40, result);
    }

    @Test
    public void MultiplicationOnZeroTest() {
        a = -8;
        b = 0;
        result = Operations.Multiplication(a, b);
        Assert.assertEquals(0, result);
    }
}

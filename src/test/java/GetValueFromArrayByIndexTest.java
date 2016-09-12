import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Danylo Pidtiagyn on 10.09.2016.
 */
public class GetValueFromArrayByIndexTest {

    Operations Operations = new Operations();
    int [] array = {10, 5, 67, 43, 56, 40};
    int index;
    int result;

    @Test
    public void GetValueFromArrayByCorrectIndex() throws Exception {
        index = 4;
        result = Operations.GetValueFromArrayByIndex(index, array);
        Assert.assertEquals(56, result);
    }

    @Test
    public void GetValueFromArrayByIndexOutOfRange() throws Exception {
        index = 10;
        result = Operations.GetValueFromArrayByIndex(index, array);
        Assert.assertEquals(0, result);
    }

    @Test
    public void GetValueFromArrayByNegativeIndex() throws Exception {
        index = -20;
        result = Operations.GetValueFromArrayByIndex(index, array);
        Assert.assertEquals(0, result);
    }

}

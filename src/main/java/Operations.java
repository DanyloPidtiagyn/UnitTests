import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by Danylo Pidtiagyn on 10.09.2016.
 */
public class Operations {

    public int Sum(int a, int b) { return a+b; }

    public int Division(int a, int b)
    {
        return a/b;
    }

    public int Multiplication(int a, int b)
    {
        return a*b;
    }

    public int Substraction(int a, int b)
    {
        return a-b;
    }

    public int GetValueFromArrayByIndex(int index, int[] array){
        if (index > Array.getLength(array)-1) return 0;
        else if (index < 0) return 0;
        else return array[index];
    }

}

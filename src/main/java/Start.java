import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by Danylo Pidtiagyn on 11.09.2016.
 */
public class Start {
    public static void main (String[] args) {
        int a = 14;
        int b = 8;
        int [] array = {5, 43, 8, 8, 10};
        int index = 6;
        Operations Operations = new Operations();

        System.out.println("a = " +a+ " and b = " +b+" operations results:");
        System.out.println("Sum: " + Operations.Sum(a,b));
        System.out.println("Division: " + Operations.Division(a,b));
        System.out.println("Multiplication: " + Operations.Multiplication(a,b));
        System.out.println("Substraction: " + Operations.Substraction(a,b));

        System.out.println("Get value by index from array results:");
        System.out.println("Array = " + Arrays.toString(array));
        System.out.println("Index = " + index);
        System.out.println("Result value = " + Operations.GetValueFromArrayByIndex(index,array));
    }
}

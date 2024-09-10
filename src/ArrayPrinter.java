import java.util.Arrays;
import java.util.stream.Collectors;

//задача 8 kyu
//https://www.codewars.com/kata/56e2f59fb2ed128081001328/train/java

public class ArrayPrinter {

    public static String printArray(Object[] array)
    {
        return Arrays.stream(array).map(Object::toString).collect(Collectors.joining(","));
    }
}
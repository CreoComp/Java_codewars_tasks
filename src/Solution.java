import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

//5 kyu  https://www.codewars.com/kata/52f787eb172a8b4ae1000a34/train/java

public class Solution
{

    public static int zeros(int n)
    {
        int fives = 0;
        for (int i = 1; n >= Math.pow(5, i); i++)
        {
            fives += n / Math.pow(5, i);
        }
        return fives;
    }

}






// variable 1
//public static int zeros(int n) {
//    List<Integer> count5 = new ArrayList<>();
//
//    for (int i = 1; i <= n; i++) {
//        int x = i;
//        if(x % 5 == 0) {
//            while (x % 5 == 0) {
//                count5.add(x);
//                x /= 5;
//            }
//        }
//
//    }
//    return count5.size();
//}


//variable 2
//public static int zeros(int n) {
//    int fives = 0;
//    for(int i = 1; n >= Math.pow(5, i); i++) {
//        fives += n / Math.pow(5, i);
//    }
//    return fives;
//}
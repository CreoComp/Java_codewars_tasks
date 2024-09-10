import java.util.Arrays;
import java.util.stream.Collectors;


//7kyu https://www.codewars.com/kata/5390bac347d09b7da40006f6/train/java

public class JadenCase {

    public String toJadenCase(String phrase) {
        if (null == phrase || phrase.length() == 0) {
            return null;
        }

        return Arrays.stream(phrase.split(" "))
                .map(i -> i.substring(0,1).toUpperCase() + i.substring(1, i.length()))
                .collect(Collectors.joining(" "));
    }

}
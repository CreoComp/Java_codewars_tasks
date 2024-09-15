import java.util.List;
import java.util.stream.Collectors;

// 5 kuy https://www.codewars.com/kata/513e08acc600c94f01000001/train/java

public class RGB
{
    public static void main(String[] args) {
        System.out.println(rgb(1,255,255));
    }

    public static String rgb(int r, int g, int b) {
        return List.of(r, g, b).stream()
                .map(h -> Math.max(0, Math.min(255, h)))
                .map(e -> Integer.toHexString(e).toUpperCase())
                .map(x -> {if(x.length() < 2) x = "0" + x; return x; })
                .collect(Collectors.joining(""));
    }
}

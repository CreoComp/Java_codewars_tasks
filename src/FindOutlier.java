import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// 6 kyu

public class FindOutlier {

    static int find(int[] integers)
    {
        List<Integer> odd = new ArrayList<>();
        List<Integer> even = new ArrayList<>();

        odd = Arrays.stream(integers).mapToObj(c -> (int) c).filter(x -> x % 2 == 0).collect(Collectors.toList());
        even = Arrays.stream(integers).mapToObj(c -> (int) c).filter(x -> x % 2 != 0).collect(Collectors.toList());
        if (odd.size() > even.size())
        {
            return even.get(0);
        } else
            return odd.get(0);
    }
}
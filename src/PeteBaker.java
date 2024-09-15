import java.util.Map;

public class PeteBaker {

    public static void main(String[] args)
    {
        Map<String, Integer> recipe = Map.of(
                "flour", 500,
                "sugar", 200,
                "eggs", 1);
        Map<String, Integer> available = Map.of(
                "flour", 1200,
                "sugar", 1200,
                "eggs", 5,
                "milk", 200);
        System.out.println(cakes(recipe, available));
    }

    public static int cakes(Map<String, Integer> recipe, Map<String, Integer> available)
    {
        int min = Integer.MAX_VALUE;
            for (Map.Entry<String, Integer> entry : recipe.entrySet())
            {
                if (available.get(entry.getKey()) != null) {
                    int values = available.get(entry.getKey()) / entry.getValue();
                    if (values < min)
                        min = values;
                }
                else
                    return 0;
            }
        return min;
    }
}
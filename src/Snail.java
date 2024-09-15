import java.io.IOException;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;


// 4 kuy https://www.codewars.com/kata/521c2db8ddc89b9b7a0000c1/java
public class Snail
{

    public static void main(String[] args){
        int[][] array
                = {{1, 2, 3,1},
                {4, 5, 6,1},
                {4, 5, 6,1},
                {7, 8, 9,1}};

        Arrays.stream(snail(array)).forEach(System.out::println);
    }

    public static int[] snail(int[][] array)
    {
        if(array[0].length == 0)
            return new int[0];

        int[][] boolArray = new int[array.length][array.length];

        List<Integer> changedLists = new ArrayList<Integer>();
        int index1 = 0;
        int index2 = 0;

        while (changedLists.size() < array.length * array.length - 1)
        {
            while (index2 + 1 < boolArray.length && boolArray[index1][index2 + 1] == 0)
            {

                boolArray[index1][index2] = 1;
                changedLists.add(array[index1][index2]);
                index2++;
            }

            while (index1 + 1 < boolArray.length && boolArray[index1 + 1][index2] == 0)
            {
                boolArray[index1][index2] = 1;
                changedLists.add(array[index1][index2]);
                index1++;
            }

            while (index2 - 1 >= 0 && boolArray[index1][index2 - 1] == 0)
            {
                boolArray[index1][index2] = 1;
                changedLists.add(array[index1][index2]);
                index2--;
            }

            while (index1 - 1 < boolArray.length && boolArray[index1 - 1][index2] == 0)
            {
                boolArray[index1][index2] = 1;
                changedLists.add(array[index1][index2]);
                index1--;
            }
        }

        for (int i = 0; i < array.length; i++)
        {
            for(int j = 0; j < array.length; j++) {
                if(boolArray[i][j] == 0) {
                    changedLists.add(array[i][j]);
                    break;
                }
            }
        }

        return changedLists.stream().mapToInt(i -> i).toArray();
    }
}
import java.util.Dictionary;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

// 5 kyu  https://www.codewars.com/kata/61fef3a2d8fa98021d38c4e5/java

class SolutionCardGame
{
    public static void main(String[] args)
    {
        System.out.println(cardGame(75118));
    }

    public static long cardGame(long n)
    {
        Map<Integer, Long> players = new HashMap<>();

        players.put(0, 0l);
        players.put(1, 0l);

        int indexPlayer = 0;
        while (n > 0)
        {
            if (n % 2 == 0)
            {
                if(n == 4) {
                    players.replace(indexPlayer, players.get(indexPlayer) + n / 2);
                    n = n / 2;
                }
                else
                {
                    if ((n + 2) % 4 == 0 && (n / 2) % 4 != 0)
                    {
                        players.replace(indexPlayer, players.get(indexPlayer) + n / 2);
                        n = n / 2;

                    } else
                    {
                        players.replace(indexPlayer, players.get(indexPlayer) + 1);
                        n -= 1;
                    }
                }
            }
            else
            {

                players.replace(indexPlayer, players.get(indexPlayer) + 1);
                n -= 1;
            }
            if (indexPlayer == 0)
                indexPlayer = 1;
            else
                indexPlayer = 0;
        }

        return players.get(0);
    }
}
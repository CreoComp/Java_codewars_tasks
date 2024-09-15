public class Tic_Tac_Toe
{

    // 5 kuy https://www.codewars.com/kata/525caa5c1bf619d28c000335/train/java
    public static int isSolved(int[][] board)
    {
        int SolvedInt = 0;

        for (int checkSymbol = 1; checkSymbol < 3; checkSymbol++)
        {
            for (int i = 0; i < 3; i++)
            {
                if ((board[i][0] == checkSymbol && board[i][1] == checkSymbol && board[i][2] == checkSymbol) || (board[0][i] == checkSymbol && board[1][i] == checkSymbol && board[2][i] == checkSymbol))
                {
                    SolvedInt = checkSymbol;
                }
                if ((board[0][0] == checkSymbol && board[1][1] == checkSymbol && board[2][2] == checkSymbol) || (board[0][2] == checkSymbol && board[1][1] == checkSymbol && board[2][0] == checkSymbol))
                {
                    SolvedInt = checkSymbol;
                }
            }
        }

        if (SolvedInt == 0)
        {
            for (int i = 0; i < 3; i++)
            {
                for (int j = 0; j < 3; j++)
                {
                    if (board[i][j] == 0)
                        return -1;
                }
            }
        }
        return SolvedInt;
    }
}

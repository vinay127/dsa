package striver.dp;

public class Fibonacci {

    public static void main(String[] args) {
        int num = 6;
        int[] dp = new int[num + 1];


        System.out.println("******* Memoization **********");

        int fibn = fibMemoization(num, dp);
        System.out.println();
        System.out.println(fibn);

        System.out.println("******* Tabulation **********");

        fibn = fibTabulation(num, dp);
        System.out.println();
        System.out.println(fibn);


        System.out.println("******** Optimal solution *********");
        fibn = fibOptimal(num);
        System.out.println(fibn);
    }


    /*
     * TC : O(N)
     * SC : O(N) + O(N)
     *      The first O(N) is for stack space and second O(N) is for storing the dp array values
     * */
    public static int fibMemoization(int num, int[] dp) {
        if (num == 1 || num == 0) return num;

        if (dp[num] != 0) {
            return dp[num];
        }

        dp[num] = fibMemoization(num - 1, dp) + fibMemoization(num - 2, dp);
        System.out.print(dp[num] + " ");
        return dp[num];

    }

    /*
     * TC : O(N)
     * SC : O(N)
     *      O(N) is for storing the dp array values
     * */
    public static int fibTabulation(int num, int[] dp) {

        if (num == 1 || num == 0) return num;

        /*
         * Set the initial values
         * */
        dp[1] = 1;
        dp[0] = 0;

        for (int i = 2; i <= num; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        return dp[num];
    }


    /*
     * TC : O(N)
     * SC : O(N)
     *      O(N) is for storing the dp array values
     * */
    public static int fibOptimal(int num) {
        if (num == 1 || num == 0) return num;

        int prev = 1;
        int prev2 = 0;


        for (int i = 2; i <= num; i++) {
            int curr = prev + prev2;
            prev2 = prev;
            prev = curr;
        }

        return prev;


    }

}

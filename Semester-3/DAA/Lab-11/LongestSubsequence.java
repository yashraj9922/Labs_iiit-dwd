// write a java code to find a longest common subsequence and print the table which you have used to find the longest common subsequence.

public class LongestSubsequence {
    public static void main(String[] args) {
        String s1 = "AGGTAB";
        String s2 = "GXTXAYB";

        int m = s1.length();
        int n = s2.length();

        int[][] lcs = new int[m + 1][n + 1];

        for (int i = 0; i <= m; ++i) {
            for (int j = 0; j <= n; ++j) {

                if (i == 0 || j == 0)
                    lcs[i][j] = 0;

                else if (s1.charAt(i - 1) == s2.charAt(j - 1))
                    lcs[i][j] = lcs[i - 1][j - 1] + 1;

                else
                    lcs[i][j] = Math.max(lcs[i - 1][j], lcs[i][j - 1]);

            }
        }

        System.out.println("Length of LCS is: " + lcs[m][n]);

        System.out.println("LCS Table is: ");
        for (int i = 0; i <= m; ++i) {
            for (int j = 0; j <= n; ++j)
                System.out.print(lcs[i][j] + " ");
            System.out.println();
        }

        int index = lcs[m][n];
        int temp = index;

        char[] lcsString = new char[index + 1];
        lcsString[index] = '\u0000';

        int i = m, j = n;
        while (i > 0 && j > 0) {

            if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                lcsString[index - 1] = s1.charAt(i - 1);
                --i;
                --j;
                --index;
            }

            else if (lcs[i - 1][j] > lcs[i][j - 1])
                --i;
            else
                --j;
        }

        System.out.print("LCS is: ");
        for (int k = 0; k <= temp; ++k)
            System.out.print(lcsString[k]);
        System.out.println();


    }


}

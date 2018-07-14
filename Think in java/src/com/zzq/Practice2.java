package com.zzq;


import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        Solution s = new Solution();
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()){
            System.out.println(s.getResult(sc.nextLine()));
        }

    }
}

class Solution{
    public int getResult(String s){
         StringBuffer s1 = new StringBuffer(s);
         StringBuffer s2 = new StringBuffer(s).reverse();
         return s1.length() - LCS(s1,s2);
    }
    public int LCS(StringBuffer s1,StringBuffer s2){
        int m = s1.length();
        int n = s2.length();
        int[][] mutrix = new int[m+1][n+1];
        for(int i = 1 ; i <= m; i ++){
            for(int j = 1 ; j <= n ; j ++){
                if(s1.charAt(i-1) == s2.charAt(j-1))
                    mutrix[i][j] = mutrix[i-1][j-1]+1;
                else
                    mutrix[i][j] = Math.max(mutrix[i-1][j],mutrix[j-1][i]);
            }
        }
        return mutrix[m][n];
    }
}


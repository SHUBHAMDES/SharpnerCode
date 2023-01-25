package Recursion;

import java.util.Scanner;

public class TaskNo23 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int  n=sc.nextInt();
        System.out.println(countSum(n,1));

    }
     static long  countSum(int  n,long sum){
        if(n==0)return sum;
        sum*=n;
        return countSum(n-1,sum);

    }
}

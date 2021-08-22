package com.sharique.programs;
import java.util.Scanner;

public class PrimeTillN {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    sc.close();
    int i = 2;
    while(i<=N) {
        int j = 2;
        int count = 0;
        while (j<=i) {
            if(i%j == 0) {
		count++;
            } 
            j++;
        }
         if(count < 2) {
            System.out.println(i);
        }
         i++;
      }
   }
}

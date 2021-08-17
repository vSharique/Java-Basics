package com.sharique.patterns;

import java.util.Scanner;

/*
 * Pattern 1
 * N = 4
 *      *
 *     **
 *    ***
 *   ****
 */

public class Pattern1 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
	sc.close();
        int i = 1;
        while(i <= N) {
            int space = 1;
            while(space <= (N - i)){
                System.out.print(" ");
                space++;
            }
            int j = 1;
            while(j<=i) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }
	}
}

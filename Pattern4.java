package com.sharique.patterns;

/*
 * Pattern for N = 5
 * 
 *    ..*
 *    .***
 *    *****
 *    .***
 *    ..*
 * 
 * The dots represent spaces.
 */

import java.util.Scanner;
public class Pattern4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the number:");
		int N = sc.nextInt();
		sc.close();
		int i = 1;
		int k = 1;
		while(i<=N/2) {
			int space = N/2;
			while(space >= i) {
				System.out.print(" ");
				space--;
			}
			int j = 1;
			while(j<=k) {
				System.out.print("*");
				j++;
			}
			System.out.println();
			k = k + 2;
			i++;
		}
		i = 1;
		k = N;
		while(i<=N) {
			int space = 1;
			while(space < i) {
				System.out.print(" ");
				space++;
			}
			int j = 1;
			while(j<=k) {
				System.out.print("*");
				j++;
			}
			System.out.println();
			k = k - 2;
			i++;
		}
		
	}

}

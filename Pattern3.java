package com.sharique.patterns;
import java.util.Scanner;
/*
 * n = 4
 *      1
 *     121
 *    12321
 *   1234321
 */
public class Pattern3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the number:");
		int N = sc.nextInt();
		sc.close();
		int i = 1;
		while(i<=N) {
			int space = 1;
			while(space <= N - i) {
				System.out.print(" ");
				space++;
			}
			int j = 1;
			int p = 1;
			while(j<=i) {
				System.out.print(p);
				p++;
				j++;
			}
			p = i - 1;
			j = 1;
			while(j<=i-1) {
				System.out.print(p);
				p--;
				j++;
			}
			System.out.println();
			i++;
		}
	}

}

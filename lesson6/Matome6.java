package lesson6;

import java.util.Scanner;

public class Matome6 {
	public static void main(String[] args) {
		//1.
		//		for(int i = 1; i<=10; i++) {
		//			if(i%2 == 0) {
		//				System.out.println(i);
		//			}
		//		}
		//2.
		//		Scanner scanner = new java.util.Scanner(System.in);
		//		int str1 = scanner.nextInt();
		//		int str2 = scanner.nextInt();
		//		int str3 = scanner.nextInt();
		//		int str4 = scanner.nextInt();
		//		int str5 = scanner.nextInt();
		//		int str6 = scanner.nextInt();
		//		scanner.close();
		//		//int sum = str1+str2+str3+str4+str5+str6;
		//		System.out.println(str1+str2+str3+str4+str5+str6);
		//3.
		//		for (int i = 1; i <= 9; i++) {
		//			for (int j = 1; j <= 9; j++) {
		//				System.out.print(i * j + "\t");
		//			}
		//			System.out.print("\n");
		//		}
		//4.
		//		String l = "*";
		//		for (int i = 1; i <= 5; i++) {
		//			for (int j = 0; j < i; j++) {
		//				System.out.print(l);
		//			}
		//			System.out.print("\n");
		//		}
		//5.
		Scanner scanner = new java.util.Scanner(System.in);
		int so = scanner.nextInt();
		scanner.close();
		for (int i = 2; i <= so; i++) {
			if (i == so) {
				System.out.println("素数");
				System.out.println(i);
			} else if (so % i == 0) {
				System.out.println("not 素数");
				System.out.println(i);
				break;
			}
		}
	}
}

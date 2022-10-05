package lesson11;

import java.util.Scanner;

class Equal {
	public static void main(String[] args) {

		Scanner scanner = new java.util.Scanner(System.in);

		String str = scanner.next();
		int n = scanner.nextInt();

		String str1 = scanner.next();
		int m = scanner.nextInt();

		scanner.close();

		if (str.equals(str1)) {
			System.out.println("同じ名前");
		} else {
			System.out.println("異なる名前");
		}

		if (n == m) {
			System.out.println("同じ点数");
		} else {
			System.out.println("異なる点数");
		}
	}
}

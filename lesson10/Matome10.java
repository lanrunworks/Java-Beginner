package lesson10;

import java.util.Scanner;

class Matome10 {
	public static void main(String[] args) {
		//1.XO
		//2.
		//		Scanner scanner = new java.util.Scanner(System.in);
		//		String hi = scanner.nextLine();
		//		scanner.close();
		//		StringBuffer sb = new StringBuffer(hi);
		//		sb.reverse();
		//		System.out.println(sb);
		//	}
		//}
		//3.
		//Scanner scanner = new java.util.Scanner(System.in);
		//String hi = scanner.nextLine();
		//int num = scanner.nextInt();
		//scanner.close();
		//StringBuffer sb = new StringBuffer(hi);
		//sb.insert(num, 'a');
		//System.out.println(sb);
		//4.		
	Scanner scanner = new java.util.Scanner(System.in);
	int num1 = scanner.nextInt();
	int num2 = scanner.nextInt();
	scanner.close();
	int max = Math.max(num1, num2);
	System.out.println(num1 + "&" + num2 + "=>" + max);
	}
}
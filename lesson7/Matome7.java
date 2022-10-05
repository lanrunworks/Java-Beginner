package lesson7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Matome7 {

	public static void main(String[] args) throws IOException {
		BufferedReader br =new BufferedReader( new InputStreamReader(System.in));
		int[] test = new int[5];
		int max = 0;

		for (int i = 0; i < test.length; i++) {
			String str = br.readLine();
			int num = Integer.parseInt(str);
			test[i] = num;
			if (test[i] > max) {
				max = test[i];
			}
		}for(int i = 0; i < test.length; i++) {
			System.out.println((i+1)+"番目の人の点数は"+test[i]);
		}
		System.out.println("最高点は"+max);
	}

}

//1.XxX => xxO
//2.test[5]
//3.①ア　②エ　③カ　④オ
//4.
//import java.util.Scanner;
//class Matome7 {
//
//	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		int[] test = new int[5];
//		int max = 0;
//
//		for (int i = 0; i < test.length; i++) {
//			test[i] = scanner.nextInt();
//			if (test[i] > max) {
//				max = test[i];
//			}
//		}
//
//		scanner.close();
//		System.out.println(max);
//	}
//
//}
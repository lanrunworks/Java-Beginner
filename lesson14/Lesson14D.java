package lesson14;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Lesson14D {
	public static void main(String[] args) throws IOException {
		PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("testcodes.csv")));
		pw.println("名前,英語,数学");
		
		Scanner scanner = new java.util.Scanner(System.in);
		
		System.out.println("テスト結果を入力する人数を入力してください。");
		int num = scanner.nextInt();
		
		int[] test = new int[num];

		for (int i = 0; i < test.length; i++) {

			System.out.println((i + 1) + "人目の名前を入力してください。");
			String name = scanner.next();

			System.out.println((i + 1) + "人目の英語の点数を入力してください。");
			int eng = scanner.nextInt();

			System.out.println((i + 1) + "人目の数学の点数を入力してください。");
			int math = scanner.nextInt();

			pw.println(name + "," + eng + "," + math);
		}
		System.out.println("ファイルが作成されました。");
		pw.close();
		scanner.close();
	}
}

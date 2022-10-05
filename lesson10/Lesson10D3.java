package lesson10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Lesson10D3 {
	public static void main(String[] args) throws IOException {

		System.out.println("テスト結果を入力する人数を入力してください。");

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str1 = br.readLine();
		int sum = Integer.parseInt(str1);

		TestResult[] student = new TestResult[sum];

		for (int i = 0; i < student.length; i++) {
			System.out.println((i + 1) + "人目の名前を入力してください。");
			student[i] = new TestResult();
			String str2 = br.readLine();
			System.out.println((i + 1) + "人目の英語の点数を入力してください。");
			String str3 = br.readLine();
			System.out.println((i + 1) + "人目の数学の点数を入力してください。");
			String str4 = br.readLine();
			int num1 = Integer.parseInt(str3);
			int num2 = Integer.parseInt(str4);
			student[i].setName(str2);
			student[i].setEnglishScore(num1);
			student[i].setMathScore(num2);
		}

		for (int i = 0; i < student.length; i++) {
			System.out.println(student[i].getName() + "さんの英語の点数は" + student[i].getEnglishScore() + "点、数学の点数は"
					+ student[i].getMathScore() + "点です。");
		}
	}
}

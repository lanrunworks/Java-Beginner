package lesson10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sample5 {
	public static void main(String[] args) throws IOException {
		System.out.println("整数を2つ入力してください。");

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str1 = br.readLine();
		String str2 = br.readLine();

		int num1 = Integer.parseInt(str1);
		int num2 = Integer.parseInt(str2);

		int ans = Math.max(num1, num2);

		System.out.println(num1 + "と" + num2 + "のうち大きいほうは" + ans + "です。");

		int num3 = (int) (Math.random() * 6) + 1;
		System.out.println("(int) (Math.random() * 6) + 1の結果は" + num3);

		int num4 = (int) (Math.random() * 7);
		System.out.println("(int) (Math.random() * 7)の結果は" + num4);

		double num5 = Math.random();
		System.out.println("Math.random()の結果は" + num5);
	}
}

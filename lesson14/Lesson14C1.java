package lesson14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lesson14C1 {

	public static void main(String[] args) throws IOException {
		System.out.println(inputIntNumber());
	}

	static String inputIntNumber() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int input = Integer.parseInt(str);
		try {
			int sum = input * 2;
			String str1 = Integer.toString(sum);
			return str1;
		} catch (NumberFormatException n) {
			String str2 = "数値以外が入力されました。\n 入力した値を2倍にすると0です。";
			return str2;
		}
	}
}

package lesson9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Lesson9C2 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str1 = br.readLine();
		String str2 = br.readLine();
		String str3 = br.readLine();
		int input1 = Integer.parseInt(str1);
		int input2 = Integer.parseInt(str2);
		int input3 = Integer.parseInt(str3);
		int score = score(input1, input2, input3);

		System.out.println(score);
	}

	public static int score(int num1, int num2, int num3) {
		int ans1 = 9;
		int ans2 = 2;
		int ans3 = 5;

		int result1 = 0;
		if (ans1 == num1) {
			result1 = 2;
		} else if (ans1 == num2 || ans1 == num3) {
			result1 = 1;
		}
		int result2 = 0;
		if (ans2 == num2) {
			result2 = 2;
		} else if (ans2 == num1 || ans2 == num3) {
			result2 = 1;
		}
		int result3 = 0;
		if (ans3 == num3) {
			result3 = 2;
		} else if (ans3 == num1 || ans3 == num2) {
			result3 = 1;
		}
		int sum = result1 + result2 + result3;
		return sum;
	}
}

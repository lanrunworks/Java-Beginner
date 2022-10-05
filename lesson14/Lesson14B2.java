package lesson14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lesson14B2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] num = new int[2];
		try {
			for (int i = 0; i < num.length; i++) {
				String str = br.readLine();
				int input = Integer.parseInt(str);
				num[i] = input;
			}
			int sumamari = num[0] % num[1];
			int sum = num[0] / num[1];
			System.out.println(num[0] + "÷" + num[1] + "の商は" + sum + ",余りは" + sumamari + "です");
		} catch (ArithmeticException a) {
			System.out.println("0除算エラーです。");
		} catch (NumberFormatException b) {
			System.out.println("数値以外が入力されました");
		} catch (IOException i) {
			System.out.println("例外が発生されました");
		}

	}
}

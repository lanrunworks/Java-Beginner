package lesson9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Lesson9D3 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		CalcutationBMI data = new CalcutationBMI();
		System.out.println("名前を入力してください。");
		String str1 = br.readLine();
		data.setInfo(str1);

		System.out.println("年齢を入力してください。(1以上100以下で入力)");
		String str2 = br.readLine();
		int num1 = Integer.parseInt(str2);
		data.setInfo(num1);
		if (data.ageCheck == false) {

			System.out.println("年齢は1以上100以下の数字で入力してください。");
			System.out.println("処理を中断します。");
			return;

		}

		System.out.println("身長(単位[m])を入力してください。");
		String str3 = br.readLine();
		double num2 = Double.parseDouble(str3);

		System.out.println("体重を入力してください。");
		String str4 = br.readLine();
		double num3 = Double.parseDouble(str4);
		data.setInfo(num2, num3);
	}
}

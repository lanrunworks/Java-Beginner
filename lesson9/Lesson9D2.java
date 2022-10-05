package lesson9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Lesson9D2 {
	static String name;
	static int age;
	static double height = 0.0;
	static double weight = 0.0;
	static double ansBMI = 0.0;
	static String resultBMI;
	static boolean ageCheck = true;

	//入力値
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("名前を入力してください。");
		String str1 = br.readLine();
		setName(str1);

		System.out.println("年齢を入力してください。(1以上100以下で入力)");
		String str2 = br.readLine();
		int num1 = Integer.parseInt(str2);
		setAge(num1);
		if (ageCheck == false) {

			System.out.println("年齢は1以上100以下の数字で入力してください。");
			System.out.println("処理を中断します。");
			return;

		}

		System.out.println("身長(単位[m])を入力してください。");
		String str3 = br.readLine();
		double num2 = Double.parseDouble(str3);
		height = num2;

		System.out.println("体重を入力してください。");
		String str4 = br.readLine();
		double num4 = Double.parseDouble(str4);
		weight = num4;
		setBmi(num2, num4);
	}

	//名前条件
	static void setName(String str) {
		name = str;
	}

	//年齢条件
	static void setAge(int n) {
		int min = 1;
		int max = 100;
		if (n >= min && n <= max) {

			age = n;

		} else {

			ageCheck = false;

		}

	}

	//BMI計算
	static void setBmi(double h, double w) {
		height = h;
		weight = w;
		ansBMI = weight / (height * height);
		//String result =null;
		//resultBMI = result;
		//BMI条件
		double range1 = 18.5;
		double range2 = 25.0;
		if (ansBMI < range1) {

			resultBMI = "瘦せ型";

		} else if (ansBMI >= range1 && ansBMI < range2) {

			resultBMI = "普通体型";

		} else if (ansBMI > range2) {

			resultBMI = "肥満体型";

		}

		System.out.println(name + "さん(" + age + "歳)のBMIは" + ansBMI + "です。");
		System.out.println("あなたの体型は「" + resultBMI + "」です。");
	}

}
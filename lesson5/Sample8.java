package lesson5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Sample8 {
	public static void main(String[] args) throws IOException {

		System.out.println("何番目のコースにしますか？");
		System.out.println("整数を入力してください");

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();

		//		char ans;
		//		if (res == 1) {
		//			ans = 'A';
		//		} else {
		//			ans = 'B';
		//		}
		//		System.out.println(ans + "コースを選択しました。");

		int res = Integer.parseInt(str);
		char ans = (res == 1) ? 'A' : 'B';
		System.out.println(ans + "コースを選択しました。");
	}
}

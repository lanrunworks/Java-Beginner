package lesson14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lesson14B1 {

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] num = new int[5];
		try {
			for (int i = 0; i < num.length; i++) {
				String str = br.readLine();
				int input = Integer.parseInt(str);
				num[i] = input;

			}
			//最大値と最小値の設定
			int max = num[0];
			int min = num[0];

			for (int i = 0; i < num.length; i++) {
				//次の値が最大値より大きければ最大値を更新
				if (num[i] > max) {
					max = num[i];
				}
				//次の値が最小値より小さければ最小値を更新
				else if (num[i] < min) {
					min = num[i];
				}
			}

			System.out.println("最大値:" + max);
			System.out.println("最小値:" + min);
		} catch (NumberFormatException e) {
			System.out.println("数値以外が入力されました");
		}catch (IOException i) {
			System.out.println("例外が発生されました");
		}
	}
}

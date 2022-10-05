package lesson7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Practice4 {
	
	public static void main(String[] args) throws IOException {
		System.out.println("５人のテストの点数を入力してください。");

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int[] test = new int[5];
		for (int i = 0; i < test.length; i++) {
			String str = br.readLine();
			int tmp = Integer.parseInt(str);
			test[i] = tmp;
			System.out.println((i + 1) + "番目の人の点数は" + test[i] + "です。");
		}
		int max = 0;

		for (int i = 0; i < test.length; i++) {
			if (max < test[i]) {
				max = test[i];
			}
		}
		for (int i = 0; i < test.length; i++) {
			System.out.println((i + 1) + "番目の人の点数は" + test[i] + "です。");
		}
		System.out.println("最高点は" + max + "点です。");
	}
}

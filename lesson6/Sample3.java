﻿package lesson6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Sample3 {
	public static void main(String[] args) throws IOException {

		System.out.println("いくつanus stampを出力しますか？");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int num = Integer.parseInt(str);

		for (int i = 1; i <= num; i++) {

			System.out.println(i+"*");
		}
	}
}
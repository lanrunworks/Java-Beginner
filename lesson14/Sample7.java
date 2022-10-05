package lesson14;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

class Sample7 {

	public static void main(String[] args) {

		try {
			PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("C:\\pleiades\\2022-06\\workspace\\Lesson\\src\\lesson14\\test1.txt")));

			pw.println("Hello!");
			pw.println("Goodbye!");
			System.out.println("ファイルに書き込みました。");

			pw.close();
		} catch (IOException e) {
			System.out.println("入力エラーです。");
		}

	}

}

package lesson9;

import java.util.Scanner;

public class Lesson9E {
	public static void main(String[] args) {

		Scanner scanner = new java.util.Scanner(System.in);
		System.out.println("半径を入力してください。");
		int input1 = scanner.nextInt();
		System.out.println("半径" + input1 + "の円の円周と面積の計算します。");

		Circle circle = new Circle();
		circle.setCir(input1);

		System.out.println("計算を続ける場合は「0」を、処理を終了する場合は「1」を入力してください。");
		int input2 = scanner.nextInt();

		if (input2 == 1) {
			System.out.println("処理を終了します。");
			scanner.close();
			return;
		} else {
			System.out.println("高さを入力してください。");
		}

		int input3 = scanner.nextInt();
		System.out.println("底面の半径" + input1 + "、高さ" + input2 + "の円柱の表面積と体積を計算します。");

		Cylinder cylinder = new Cylinder();
		cylinder.setCyl(input1, input3);
		scanner.close();
	}
}

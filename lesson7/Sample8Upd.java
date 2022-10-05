package lesson7;

public class Sample8Upd {
	public static void main(String[] args) {
		int[] test = { 80, 60, 22, 50, 75 };
		int i = 0;
		for (int j : test) {
			System.out.println((i + 1) + "番目の人の点数は" + j);
			i++;
		}
		System.out.println(test.length);
	}
}

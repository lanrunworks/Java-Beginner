package lesson14;

class Sample2 {
	public static void main(String[] args) {
		try {
			int[] test = new int[5];

			System.out.println("tesst[10]に値を代入します。");

			test[10] = 80;
			System.out.println("test[10]に80を代入しました。");
			System.out.println("無事終了しました。");

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("配列の要素を超えています。\n" + e);
		}
		System.out.println("無事終了しました。");
	}
}
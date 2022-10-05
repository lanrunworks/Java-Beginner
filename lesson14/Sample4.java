package lesson14;

class Sample4 {
	public static void main(String[] args) {
		try {
			int[] test = new int[5];

			System.out.println("tesst[10]に値を代入します。");

			test[10] = 80;
			System.out.println("test[10]に80を代入しました。");
			System.out.println("無事終了しました。");

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("配列の要素を超えています。");
			System.out.println(e + "という例外が発生しました。");
		}
		System.out.println("無事終了しました。");
//		Scanner scanner = new java.util.Scanner(System.in);
//		try {
//			int num = scanner.nextInt();
//			System.out.println(num);
//			scanner.close();
//		} catch (InputMismatchException ie) {
//			System.out.println(ie + "が発生した。");
//		}
	}
}

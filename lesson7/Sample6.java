package lesson7;

class Sample6 {
	public static void main(String[] args) {
		int[] test1;
		test1 = new int[3];

		System.out.println("test1を宣言しました。");
		System.out.println("配列要素を確保しました。");
		System.out.print("\n");
		test1[0] = 80;
		test1[1] = 60;
		test1[2] = 22;

		int[] test2;
		System.out.println("test2を宣言しました。");

		test2 = test1;
		System.out.println("test2にtest1を代入しました。");
		System.out.print("\n");
		for (int i = 0; i < 3; i++) {
			System.out.println("test1がさす" + (i + 1) + "番目の人の点数は" + test1[i] + "です。");
		}
		System.out.print("\n");

		for (int i = 0; i < 3; i++) {
			System.out.println("test2がさす" + (i + 1) + "番目の人の点数は" + test2[i] + "です。");
		}
		System.out.print("\n");

		test1[2] = 100;
		System.out.println("test1がさす３番目の人の点数を変更します。");
		System.out.print("\n");
		for (int i = 0; i < test1.length; i++) {
			System.out.println("test1がさす" + (i + 1) + "番目の人の点数は" + test1[i] + "です。");
		}
//		//for string array
//		String[] test1 = new String[5];
//		test1[0] = "1,2,3";
//		test1[1] = "4,5,6";
//		test1[2] = "7,8,9";
//		test1[3] = "10,11,12";
//		test1[4] = "13,14,15";
//		
//		for (int i = 0; i < 5; i++) {
//			System.out.println(test1[i]);
//		}
	}
}

package lesson2;

class Matome2 {
	public static void main(String[]args) {
		
//1.改行
//2.メソッドの中
//3.
//		System.out.println(123);
//		System.out.println("\\100もらった");
//		System.out.println("またあした");
//4.
//		System.out.println("1\t2\t3");
//5.
		System.out.println("以下は8進数\n");
		System.out.println(06);
		System.out.println(024);
		System.out.println(015);
		System.out.println("\n\066");
		System.out.println("\062"+"\060");
		System.out.println("\061"+"\063\n");
		
		System.out.println("以下は16進数\n");
		System.out.println(0x6);
		System.out.println(0x14);
		System.out.println(0xD);
		System.out.println("\n\u0036");
		System.out.println("\u0032"+"\u0030");
		System.out.println("\u0031"+"\u0033");
	}
}

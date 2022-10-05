package lesson5;

import java.io.IOException;

class Matome5 {
	//	1. ① a>0 && a<=10; ② a = !0 ③ a>10 || a=0

	//	2.
	//	public static void main (String[]args) throws IOException{
	//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	//		String str = br.readLine();
	//		int num = Integer.parseInt(str);
	//		
	//		    if ( num % 2 == 0 ) {
	//		        System.out.println(num+"は偶数");
	//		    }else {
	//		        System.out.println(num+"は奇数");
	//	     }
	//	}
	//	5.B.1
	//		public static void main (String[]args) throws IOException {
	//			
	//			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	//			String str = br.readLine();
	//			int num = Integer.parseInt(str);
	//			
	//		if(num == 35) {
	//			System.out.println("正解");
	//		} else if (num >= 45) {
	//			System.out.println("大きい");
	//		} else if (num <= 25) {
	//			System.out.println("小さい");
	//		} else if (num < 45 && num > 35) {
	//			System.out.println("少し大きい");
	//		} else if (num < 35 && num > 25) {
	//			System.out.println("少し小さい");
	//		}
	//	}
	//	5.B.2
	//		public static void main(String[] args) throws IOException {
	//	
	//			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	//			String str = br.readLine();
	//			int num = Integer.parseInt(str);
	//	
	//			if (num % 100 == 0) {
	//				System.out.println(num + "年はうるう年ではありません。");
	//			}else if( num % 4 == 0) {
	//			System.out.println(num + "年はうるう年です。");
	//		} else {
	//			System.out.println(num + "年はうるう年です。");
	//		}
	//	}
	//	3.
	//	public static void main(String[] args) throws IOException{
	//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	//		
	//		String str1 = br.readLine();
	//		String str2 = br.readLine();
	//		int num1 = Integer.parseInt(str1);
	//		int num2 = Integer.parseInt(str2);
	//		
	//		if (num1==num2) {
	//			System.out.println("２つの数は同じ値です。");	
	//		} else if (num1 > num2) {
	//			System.out.println(num1+"より"+num2+"のほうが小さい値です。");
	//		} else {
	//			System.out.println(num1+"より"+num2+"のほうが大きい値です。");
	//		}
	//	}
	//	4.
	//		public static void main(String[] args) throws IOException {
	//			
	//			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	//			String str = br.readLine();
	//			int num = Integer.parseInt(str);
	//
	//		if (num <= 10 && num >=0) {
	//			System.out.println(num + "は正解です。");
	//		}else {
	//			System.out.println(num + "は不正解です。");
	//		}
	//	}
	//	5.
	//		public static void main(String[] args) throws IOException {
	//			
	//			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	//			String str = br.readLine();
	//			int num = Integer.parseInt(str);
	//		
	//		switch(num) {
	//		case 1:
	//			System.out.println("めっちゃバカ");
	//		break;
	//		case 2:
	//			System.out.println("お前バカじゃね？");
	//		break;
	//		case 3:
	//			System.out.println("そこそこバカ");
	//		break;
	//		case 4:
	//			System.out.println("バカ予備軍");
	//		break;
	//		case 5:
	//			System.out.println("たいへん優秀です。");
	//		break;
	//		}
	//	}
	//	5.B.4
	//	public static void main(String[] args) throws IOException {
	//		
	//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	//		String str1 = br.readLine();
	//		String str2 = br.readLine();
	//		double num1 = Double.parseDouble(str1);
	//		double num2 = Double.parseDouble(str2);
	//		double bmi = (num2/((num1*num1)/10000));
	//		
	//		System.out.println("あなたの肥満指数は"+bmi+"です。");
	//		if(bmi >=18.5 & bmi <= 25) {
	//			System.out.println("デブ予備軍だバカ");
	//		} else if (bmi < 18.5) {
	//			System.out.println("やせすぎだバカ");
	//		} else if (bmi>25 & bmi<=30) {
	//			System.out.println("そのうち肥満だバカ");
	//		} else {
	//			System.out.println("デブデブデブデブデブ");
	//		}
	//	}
	//	5.C.2
	public static void main(String[] args) throws IOException {

		//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//		String str = br.readLine();
		//		int num = Integer.parseInt(str);
		int a = (int)(Math.random()*6)+1;
		
		switch (a) {
		
		case 1:
			System.out.println("超特大凶");
		break;
		
		case 2:
			System.out.println("特大凶");
		break;
		
		case 3:
			System.out.println("大凶");
		break;
		
		case 4:
			System.out.println("中凶");
		break;
		
		case 5:
			System.out.println("小凶");
		break;
		
		case 6:
			System.out.println("凶");
		break;
		}

	}
}

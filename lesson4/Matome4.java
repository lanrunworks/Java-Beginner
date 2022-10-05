package lesson4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Matome4 {
	public static void main (String[]args) throws IOException{
		
//		1.OOX		回答.XOX

//		2.
//		System.out.println(0-4);
//		System.out.println(3.14*2);
//		System.out.println(5/3);
//		System.out.println(30%7);
//		System.out.println((7+32)/5);
		
//		3.
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		
//		String str = br.readLine();
//		int num = Integer.parseInt(str);
//		
//		System.out.println("正方形の面積は"+(num*num)+"です。");
//		
//		4.
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		
//		String str1 = br.readLine();
//		String str2 = br.readLine();
//		int num1 = Integer.parseInt(str1);
//		int num2 = Integer.parseInt(str2);
//		
//		System.out.println("三角形の面積は"+(((double)num1*num2)/2)+"です。");
		
//		5.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str1 = br.readLine();
		String str2 = br.readLine();
		String str3 = br.readLine();
		String str4 = br.readLine();
		String str5 = br.readLine();
		int num1 = Integer.parseInt(str1);
		int num2 = Integer.parseInt(str2);
		int num3 = Integer.parseInt(str3);
		int num4 = Integer.parseInt(str4);
		int num5 = Integer.parseInt(str5);
		
		System.out.println("5科目の合計点は"+(num1+num2+num3+num4+num5)+"です。");
		System.out.println("5科目の平均点は"+(((double)num1+num2+num3+num4+num5)/5)+"です。");
	}
}

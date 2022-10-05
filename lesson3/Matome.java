package lesson3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Matome {
//1)X,X,O
//2)3.14
//3)
//	public static void main(String[] args) throws IOException{
//		System.out.println("あなたは何歳ですか？");
//		
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		
//		String str = br.readLine();
//		
//		int num = Integer.parseInt(str);
//		
//		System.out.println("あなたは"+num+"歳です。");
//		
//	}

//4)
//	public static void main(String[] args) throws IOException{
//		
//		System.out.println("円周率の値はいくつですか？");
//		
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		
//		String str = br.readLine();
//		
//		double num = Double.parseDouble(str);
//		
//		System.out.println("円周率の値は" + num + "です。");
//		
//	}
//5)
	public static void main(String[] args) throws IOException{
		System.out.println("あなたの身長と体重を教えてください。");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str1 = br.readLine();
		String str2 = br.readLine();
		
		double num1 = Double.parseDouble(str1);
		double num2 = Double.parseDouble(str2);
		
		System.out.println("身長は"+num1+"です。");
		
		System.out.println("体重"+num2+"です。");
		
		
	}
}
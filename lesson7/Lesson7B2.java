package lesson7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lesson7B2 {

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
		
		String str1 = br.readLine();
		String str2 = br.readLine();
		String str3 = br.readLine();
		
		int input1 = Integer.parseInt(str1);
		int input2 = Integer.parseInt(str2); 
		int input3 = Integer.parseInt(str3); 
		
		
		//入力した値を配列に移し替える
		int[] num =new int[3];
		num[0] = input1;
		num[1] = input2;
		num[2] = input3;
		
		//最大値と最小値の設定
		int max = num[0];
		int min = num[0];
		
		for(int i=0;i<num.length; i++) {
			//次の値が最大値より大きければ最大値を更新
			if(num[i] > max) {
				max = num[i];
			}
			//次の値が最小値より小さければ最小値を更新
			else if(num[i] < min) {
				min = num[i];
			}
		}
	
		System.out.println("最大値:" + max);
		System.out.println("最小値:" + min);
	}
}

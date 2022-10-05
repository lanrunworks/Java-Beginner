package lesson15;

public class Sample7 {
	public static void main(String[] args) {
		String s = "abc,def:ghi";
//		String w = s.replaceAll("[beh]", "X");//aXc,dXf:gXi
		String w = s.replaceFirst("b", "X");//aXc,def:ghi
		System.out.println(w);
	}
}

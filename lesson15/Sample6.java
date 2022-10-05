package lesson15;

public class Sample6 {
	public static void main(String[] args) {

		String s = "abc,def:ghi";
		String[] words = s.split("[,:]");

		for (int i = 0; i < words.length; i++) {
			System.out.println(words[i] + "->");
		}

	}
}

package lesson15;

public class Sample8 {

	public static void main(String[] args) {

		Hero hero = new Hero();

		hero.name = "minato";
		hero.job = "hero";
		hero.gold = 280;

		final String FORMAT = "%-9s %-13s 所持金%,6d";
		String s = String.format(FORMAT, hero.getName(), hero.getJob(), hero.getGold());

		System.out.println(s);

	}

}

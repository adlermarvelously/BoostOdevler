package homework2;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		TakimManager takimManager = new TakimManager();

		Takim takim1 = new Takim("Türkiye", 0, 0);
		Takim takim2 = new Takim("Real Madrid", 0, 0);
		Takim takim3 = new Takim("Barcelona", 0, 0);
		Takim takim4 = new Takim("Atletico Madrid", 0, 0);

		ArrayList<Takim> list = new ArrayList<>();
		list.add(takim1);
		list.add(takim2);
		list.add(takim3);
		list.add(takim4);

		System.out.println("\n* * * Karşılaşmalar * * *");
		takimManager.macYap(takim1, takim2);
		takimManager.macYap(takim1, takim2);
		takimManager.macYap(takim3, takim4);
		takimManager.macYap(takim1, takim4);
		takimManager.macYap(takim2, takim3);
		takimManager.macYap(takim2, takim4);
		takimManager.macYap(takim1, takim2);

		System.out.println();

		System.out.println("* * * Takım Kasaları * * *");
		takimManager.kasaGoster(takim1);
		takimManager.kasaGoster(takim2);
		takimManager.kasaGoster(takim3);
		takimManager.kasaGoster(takim4);

		takimManager.puanDurumu(list);

		takimManager.sampiyonuGoster(list);

	}

}

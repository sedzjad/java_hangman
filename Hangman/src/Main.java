import java.util.Random;

public class Main {

	static String awnser = "";
	static String hidden = "";
	static int stage = 13;

	static String[] wordlist = { "Kaas", "Melk", "Boter", "Appel", "Wortel", "Nederland", "Duitsland", "Peer", "Aardbij",
			"Fiets", "Trein", "Vliegtuig", "Fabriek", "Boederij", "Schoolgebouw", "Personeel", "Stage", "Tafels",
			"Stoelen", "Koeien", "Zeepbakje", "Werken", "Vloer", "Vloerkleed", "Gordijnen", "Ijzer", "Jaszak",
			"Advertentie", "Agenda", "Documenten", "Afbeeldingen", "Presentaties", "Noedels", "Chinees", "Turkije",
			"Rusland", "Communisme", "Donald", "Obama", "Despacito", "Baby Shark", "Lennards Laptop", "School boeken",
			"Oplaad Kabel", "Kapper", "NS Trein", "Dubai City", "White Board", "OV Kaart" };

	public static void main(String[] args) {
		getWord();
	}

	public static void getWord() {
		int rnd = new Random().nextInt(wordlist.length);
		awnser =  wordlist[rnd];
		hidden = awnser.toUpperCase().replace(" ", "  ").replaceAll("[A-Z]", "_ ");
		System.out.println(hidden);
	}

	public static void getASCII(int type) {
		switch (type) {
		case 1:
			System.out.println("  _______________");
			System.out.println("   |          |");
			System.out.println("   |          O");
			System.out.println("   |         \\|/");
			System.out.println("   |          /\\");
			System.out.println(" _/|\\___________");
			break;
		case 2:
			System.out.println("  _______________");
			System.out.println("   |          |");
			System.out.println("   |          O");
			System.out.println("   |         \\|/");
			System.out.println("   |          /");
			System.out.println(" _/|\\___________");
			break;
		case 3:
			System.out.println("  _______________");
			System.out.println("   |          |");
			System.out.println("   |          O");
			System.out.println("   |         \\|/");
			System.out.println("   |");
			System.out.println(" _/|\\___________");
			break;
		case 4:
			System.out.println("  _______________");
			System.out.println("   |          |");
			System.out.println("   |          O");
			System.out.println("   |         \\|");
			System.out.println("   |");
			System.out.println(" _/|\\___________");
			break;
		case 5:
			System.out.println("  _______________");
			System.out.println("   |          |");
			System.out.println("   |          O");
			System.out.println("   |          |");
			System.out.println("   |");
			System.out.println(" _/|\\___________");
			break;
		case 6:
			System.out.println("  _______________");
			System.out.println("   |          |");
			System.out.println("   |          O");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println(" _/|\\___________");
			break;
		case 7:
			System.out.println("  _______________");
			System.out.println("   |          |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println(" _/|\\___________");
			break;
		case 8:
			System.out.println("  _______________");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println(" _/|\\___________");
			break;
		case 9:
			System.out.println("");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println(" _/|\\___________");
			break;
		case 10:
			System.out.println("");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println(" _/|____________");
			break;
		case 11:
			System.out.println("");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println(" __|____________");
			break;
		case 12:
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println(" _______________");
			break;
		case 13:
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			break;
		}

	}

}

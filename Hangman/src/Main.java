import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {

	static String awnser = "";
	static String hidden = "";
	static int stage = 13;
	static Scanner scan = new Scanner(System.in);
	static List<String> guesslist = new ArrayList<>();

	static String[] wordlist = { "Kaas", "Melk", "Boter", "Appel", "Wortel", "Nederland", "Duitsland", "Peer", "Aardbij",
			"Fiets", "Trein", "Vliegtuig", "Fabriek", "Boederij", "Schoolgebouw", "Personeel", "Stage", "Tafels",
			"Stoelen", "Koeien", "Zeepbakje", "Werken", "Vloer", "Vloerkleed", "Gordijnen", "Ijzer", "Jaszak",
			"Advertentie", "Agenda", "Documenten", "Afbeeldingen", "Presentaties", "Noedels", "Chinees", "Turkije",
			"Rusland", "Communisme", "Donald", "Obama", "Despacito", "Baby Shark", "Lennards Laptop", "School boeken",
			"Oplaad Kabel", "Kapper", "NS Trein", "Dubai City", "White Board", "OV Kaart" };

	public static void main(String[] args) {
		game();
	}
	
	public static void game() {
		System.out.println("Wilt u spelen? (ja/nee)");
		String vraag = scan.nextLine();
		if ((vraag).equalsIgnoreCase("ja")) {
			System.out.println("============================================================");
			System.out.println("Welkom bij galgje.");
			System.out.println("U heeft 12 levens om het woord letter voor letter te raden.");
			System.out.println("Als u dit lukt wint u het spel en anders verliest u.");
			System.out.println("============================================================");
			getWord();
			System.out.println();
			chooseLetter();
		} else {
			System.out.println("Tot ziens!");
			resetGame();
		}
	}
	
	public static void chooseLetter() {
		System.out.println();
		System.out.println("Please enter a letter:");
		String vraag = scan.nextLine();
		if(!vraag.equals("") && !vraag.equals(" ")) {
			if(vraag.length() > 1) {
				System.out.println("You are only allowed to use 1 character");
				chooseLetter();
				return;
			}
			if(guesslist.contains(vraag.toUpperCase())) {
				System.out.println("U heeft de letter, " + vraag + " al gebruikt!");
			} else {
				if(awnser.toUpperCase().contains(vraag.toUpperCase())) {
					System.out.println();
					System.out.println();
					System.out.println();
					System.out.println();
					guesslist.add(vraag.toUpperCase());
					System.out.println("De letter, " + vraag + " is correct!");
					getASCII(stage);
					System.out.println(hidden);
				} else {
					System.out.println();
					System.out.println();
					System.out.println();
					System.out.println();
					guesslist.add(vraag.toUpperCase());
					System.out.println("De letter, " + vraag + " is incorrect!");
					stage = stage - 1;
					getASCII(stage);
					System.out.println(hidden);
				}
			}
		}
		chooseLetter();
	}
	
	public static void resetGame() {
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		game();
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

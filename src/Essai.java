import java.util.Scanner;

public class Essai {
	public static void main(String [] args) {
			Scanner my_scanner;
			String ligne;
			my_scanner = new Scanner(System.in);
			System.out.println("Saisissez un ligne");
			ligne = my_scanner.nextLine();
			System.out.println("Vous avez saisi la ligne:"+ligne);
	}
}

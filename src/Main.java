import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class Main {

	public static void main(String[] args) {
		InputStream is;
		OutputStream os;
		try {
			Niveau n;		
			is = new FileInputStream("src/Original.txt");
			os = new FileOutputStream("src/test.txt");
			LecteurNiveaux ln = null;
			n = ln.lisProchainNiveau(is);
			System.out.println();
			RedacteurNiveau rd = null;
			rd.ecrisNiveau(os, n);
			
			 for(int i = 0;i<n.ligne; i++) {
				
					System.out.print(n.monTableau[i]);
				
				System.out.println();
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return;
	}
}


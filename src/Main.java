import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class Main {

	public static void main(String[] args) {
		InputStream is;
		try {
			Niveau n;		
			is = new FileInputStream("src/Original.txt");
			LecteurNiveaux ln = null;
			n = ln.lisProchainNiveau(is);
			System.out.println();
			
			
			 for(int i = 0;i<n.monTableau.length; i++) {
				for(int j =0;j<n.monTableau[i].length;j++) {
					System.out.print(n.monTableau[i][j]);
				}
				System.out.println();
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return;
	}
}


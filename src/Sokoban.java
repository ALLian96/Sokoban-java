import java.io.InputStream;

public class Sokoban {

	public static void main(String[] args) {
		InputStream in;
		// La m¨¦thode de chargement suivante ne d¨¦pend pas du syst¨¨me de fichier et sera
		// donc utilisable pour un .jar
		// Attention, par contre, le fichier doit se trouver dans le CLASSPATH
		in = ClassLoader.getSystemClassLoader().getResourceAsStream("Original2.txt");
		if (in == null) {
			System.err.println("ERREUR : impossible de trouver le fichier de niveaux");
			System.exit(1);
		}

		LecteurNiveaux l = new LecteurNiveaux(in);
		RedacteurNiveau r = new RedacteurNiveau(System.out);
		Niveau n = l.lisProchainNiveau();
		while (n != null) {
			System.out.println("Niveau lu :");
			r.ecrisNiveau(n);
			n = l.lisProchainNiveau();
		}
	}
}


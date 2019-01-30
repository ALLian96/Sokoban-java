package sources.Global;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.NoSuchElementException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

import sources.Structures.FabriqueSequence;
import sources.Structures.FabriqueSequenceListe;
import sources.Structures.FabriqueSequenceTableau;


public class Configuration {
	private static Configuration instance = null;
	Properties prop;
	FabriqueSequence fab;
	Logger logger;
	
	public static InputStream charge(String nom) {
		return ClassLoader.getSystemClassLoader().getResourceAsStream("nom");
	}
	
	static void chargerProprietes(Properties p,InputStream in,String nom) {
		try {
			p.load(in);
		}
		catch(IOException e) {
			System.err.println("Impossible de charger " + nom);
			System.err.println(e.toString());
			System.exit(1);
		}
	}
	//�ù��캯��Ϊ private����������Ͳ��ᱻʵ����
	private Configuration() {
		//On charge les propri��t��s
		InputStream in = charge("default.cfg");
		Properties defaut = new Properties();
		chargerProprietes(defaut,in,"default,cfg");
		// Il faut attendre le dernier moment pour utiliser le logger
				// car celui-ci s'initialise avec les propri��t��s
		String message  = "Fichier de propri��t��s defaut.cfg charg��";
		String nom = System.getProperty("user.home") + "/.sokoban";
		try {
			in = new FileInputStream(nom);
			prop = new Properties(defaut);
			chargerProprietes(defaut,in,nom);
			logger().info(message);
			logger().info("Fichier de propri��t��s" + nom + "charg��");
		}
		catch(FileNotFoundException e) {
			prop = defaut;
			logger().info(message);
		}
		
		
		// On cr��e la fabrique de s��quences
		String type = lis("Sequence");
		switch(type) {
		case "Liste":
			fab  = new FabriqueSequenceListe();
			break;
			
		case "Tableau":
			fab = new FabriqueSequenceTableau();
			break;
		default:
			throw new NoSuchElementException("Sequences de type "+type+" non support��es");
		}
		

	}
	//��ȡΨһ���õĶ���
	public static Configuration instance() {
			if(instance == null) {
				instance  = new Configuration();
			}
			return instance;
	}
	/*
	public String lis1(String nom) {
		String value = prop.getProperty(nom);
		if(value!=null) {
			return value;
		}
		else {
			throw new NoSuchElementException("Propi��t�� " + nom +" manquante");
		}
	}*/
	public String lis(String nom) {
		String value = prop.getProperty(nom);
		if(value == null) {
			throw new NoSuchElementException("Propri��t�� " + nom + " manquante");
		}
		else {
			return value;
		}
	}
	
	public FabriqueSequence fabriqueSequence() {
		return fab;
	}
	public Logger logger() {
		if(logger == null) {
			System.setProperty("java.util.logging.SimpleFormatter.format", "%4$s : %5$s%n");
			//java.util.logging.SimpleFormatter.format="%4$s: %5$s [%1$tc]%n"
			//This prints 1 line with the log level (4$), the log message (5$) and the timestamp (1$) in a square bracket.
			logger = Logger.getLogger("Sokoban.Logger");
			logger.setLevel(Level.parse(lis("LogLevel")));

		}
		return logger;
	}
	
}

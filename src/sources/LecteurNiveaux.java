package sources;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Scanner;


public class LecteurNiveaux {
	Scanner s;
	Niveau n;
	
	LecteurNiveaux(InputStream in){
		s = new Scanner(in);
	}
	
	String lisLigne() {
		if(s.hasNextLine()) {
			String ligne;
			ligne = s.nextLine();
			//Nettoyage des séparateurs de fin et commentaires
			int i;
			int dernier = -1;
			boolean commentaire = false;
			for( i = 0; (i <ligne.length()) && !commentaire; i++) {
				char c = ligne.charAt(i);
				if(!Character.isWhitespace(c) && (c!=';')) {
					dernier = i;
					
				}

				if(c ==';') {
					commentaire = true;
				}
			}
			// Un commentaire non vide sera pris comme nom de niveau
			// -> le dernier commentaire non vide sera le nom final
			
			if(commentaire) {
			
				char c = ' ';
				while(Character.isWhitespace(c) && (i<ligne.length())) {
					c = ligne.charAt(i);
					if(!Character.isWhitespace(c)) {
						n.fixeNom(ligne.substring(i));

					}
					i++;
				}
			}
			return ligne.substring(0,dernier+1);
		}
		else {
			return null;
		}
	}
	
	Niveau lisProchainNiveau() {
		n = new Niveau();
		String ligne = "";
		while (ligne.length() == 0) {
			ligne = lisLigne();
			if(ligne == null) {
				return null;
			}		
		}
		int i = 0;
		while((ligne != null) && (ligne.length() >0)) {
			for(int j =0; j<ligne.length();j++) {
				char c = ligne.charAt(j);
				n.videCase(i,j);
				switch(c) {
				case ' ':
					break;
				case '#':
					n.ajouteMur(i, j);
					break;
				case '@':
					n.ajoutePousseur(i, j);
					break;
				case '+':
					n.ajoutePousseur(i, j);
					n.ajouteBut(i, j);
					break;
				case '$':
					n.ajouteCaisse(i, j);
					break;
				case '*':
					n.ajouteCaisse(i, j);
					n.ajouteBut(i, j);
					break;
				case '.':
					n.ajouteBut(i, j);
					break;
				default:
					System.out.println("Caractère inconnu : "+ c);
				}
			}
			ligne = lisLigne();
			i++;
		}
		if(i > 0)
			return n;
		else
			return null;
	}	
	
	
	
	/*
	 * public static Niveau lisProchainNiveau(InputStream is){
	 
		Niveau n;		
		n = new Niveau();

        int i = 0;
		try {
       InputStreamReader isr = new InputStreamReader(is);  //将字节流转化成字符流，并指定字符集
       BufferedReader br = new BufferedReader(isr);//将字符流以缓存的形式一行一行输出
          String str = null;   
          boolean stop = false;
          while(stop != true) {
        	  str = br.readLine();      
        	  n.colonne = Integer.max(str.length(), n.colonne);
        	 //	 System.out.print("colonne" + n.colonne);
        	  if(str != null) {		  
        		  System.out.println(str);
        		  if(str.charAt(0)==';') { 
        			  stop = true;        			  
        		  }
        		  else {        			 
        			  n.monTableau[i]= str.toCharArray();
        			  i++; 
        		  }
        		 
        	  }
        	        	 
          }
          n.ligne = i;
          is.close();        
       } catch (Exception e) {
         e.printStackTrace();
	  }
		 return n;
	
		
	
		 	//methode 2
	/*  FileReader fr = null;
		BufferedReader br = null;
		try {
			fr = new FileReader("src/Original.txt");
			br  = new BufferedReader(fr);
			String s  = "";
			boolean stop = false;
			while((s=br.readLine())!=null && stop == false ) {
				if(s.charAt(0)==';') { 
						
					/*
					 public String substring(int beginIndex, int endIndex)
第一个int为开始的索引，对应String数字中的开始位置，
第二个是截止的索引位置，对应String中的结束位置
1、取得的字符串长度为：endIndex - beginIndex;
2、从beginIndex开始取，到endIndex结束，从0开始数，其中不包括endIndex位置的字符
如：
"hamburger".substring(4, 8) returns "urge"
"smiles".substring(1, 5) returns "mile"
取长度大于等于3的字符串a的后三个子字符串，只需a.subString(a.length()-3, a.length());
					 
					stop = true;
				}
				System.out.println(s);
				
			}
			if()
			
		}
		catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				br.close();
				fr.close();
			}catch(IOException ex) {
				ex.printStackTrace();
			}
		}*/
			
	public static int[] stringToAscii(String str){			   
			char[] chars=str.toCharArray();
		    int[] t = new int[chars.length];
		    for(int i=0;i<chars.length;i++){
		         t[i] = (int)chars[i];
		       
		    }
		    return t;
		        
	}
}

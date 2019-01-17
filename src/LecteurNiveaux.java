import java.io.BufferedReader;
import java.io.FileReader;
import java.io.*;



public class LecteurNiveaux {
	public static void main(String [] args) {
			FileReader fr = null;
			BufferedReader br = null;
			try {
				fr = new FileReader("H:\\java\\Sokoban-java\\src\\Original.txt");
				br  = new BufferedReader(fr);
				String s  = "";
				StringBuffer str = new StringBuffer();
				boolean stop = false;
				while((s=br.readLine())!=null && stop == false ) {
					if(s.startsWith(";")) {
						stop = true;
					}
					System.out.println(s);
					
				}
				
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
			}
		
	    }
		
			
}


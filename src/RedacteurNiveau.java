import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class RedacteurNiveau {
	public static void ecrisNiveau(OutputStream os, Niveau n) {
		try(BufferedWriter ow = new BufferedWriter(new OutputStreamWriter(os))) {
			for(int i = 0;i < n.ligne; i++) {			
				ow.write(n.monTableau[i]);			
				ow.newLine();
			}
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
}

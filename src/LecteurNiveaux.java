import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class LecteurNiveaux {


	public static Niveau lisProchainNiveau(InputStream is){
		Niveau n;
		n = new Niveau();
		try {
		  System.out.println("another method");
          is = new FileInputStream("src/Original.txt");
          BufferedReader br = new BufferedReader(new InputStreamReader(is));
          String str = null;
          while(true) {
        	  str = br.readLine();
        	  if(str != null) {
        		  System.out.println(str);
        	  }
        	  else 
        		  break;
          }
          is.close();
        
      } catch (Exception e) {
         e.printStackTrace();
		}
		 return null;
	
		
	
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
			
}
}


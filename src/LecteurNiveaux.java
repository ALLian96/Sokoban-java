import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class LecteurNiveaux {


	public static Niveau lisProchainNiveau(InputStream is){
		Niveau n;		
		n = new Niveau();

        int i = 0;
		try {
          BufferedReader br = new BufferedReader(new InputStreamReader(is));
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
��һ��intΪ��ʼ����������ӦString�����еĿ�ʼλ�ã�
�ڶ����ǽ�ֹ������λ�ã���ӦString�еĽ���λ��
1��ȡ�õ��ַ�������Ϊ��endIndex - beginIndex;
2����beginIndex��ʼȡ����endIndex��������0��ʼ�������в�����endIndexλ�õ��ַ�
�磺
"hamburger".substring(4, 8) returns "urge"
"smiles".substring(1, 5) returns "mile"
ȡ���ȴ��ڵ���3���ַ���a�ĺ��������ַ�����ֻ��a.subString(a.length()-3, a.length());
					 
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
	public static int[] stringToAscii(String str){			   
			char[] chars=str.toCharArray();
		    int[] t = new int[chars.length];
		    for(int i=0;i<chars.length;i++){
		         t[i] = (int)chars[i];
		       
		    }
		    return t;
		        
	}
}

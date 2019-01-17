import java.io.*;



public class LecteurNiveaux {
	public static void main(String [] args) {
			FileReader fr = null;
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
取长度大于等于3的字符串a的后三个子字符串，只需a.subString(a.length()-3, a.length());*/
						 
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
			//methode 2
			try {
				  System.out.println("another method");
	            InputStream is = new FileInputStream("src/Original.txt");
	            int size = is.available();
	            	
	            for (int i = 0; i < size; i++) {
	                System.out.print((char) is.read());
	            }
	            is.close();
	        } catch (IOException e) {
	            System.out.print("Exception");
			}
		
			
}
}


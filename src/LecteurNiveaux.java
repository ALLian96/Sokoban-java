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
��һ��intΪ��ʼ����������ӦString�����еĿ�ʼλ�ã�
�ڶ����ǽ�ֹ������λ�ã���ӦString�еĽ���λ��
1��ȡ�õ��ַ�������Ϊ��endIndex - beginIndex;
2����beginIndex��ʼȡ����endIndex��������0��ʼ�������в�����endIndexλ�õ��ַ�
�磺
"hamburger".substring(4, 8) returns "urge"
 "smiles".substring(1, 5) returns "mile"
ȡ���ȴ��ڵ���3���ַ���a�ĺ��������ַ�����ֻ��a.subString(a.length()-3, a.length());*/
						 
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


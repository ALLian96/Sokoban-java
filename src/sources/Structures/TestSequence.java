package sources.Structures;

import java.util.Random;
import java.util.Scanner;

public class TestSequence {
	static int min,max,count;
	
	static int operation(Sequence seq,int code) throws Exception {
		int s;
		System.out.println(seq);
		switch(code) {
		case 0:
			s = min;
			System.out.println("Insertion en Tete de "+ s);
			seq.insereTete(s);
			assert(!seq.estVide());
			break;
			
		case 1:
			s = max;
			System.out.println("Insertion en Queue de "+ s);
			seq.insereQueue(s);
			assert(!seq.estVide());
			break;
			
		case 2 :
		case 3 :
			if(count>0) {
				s = seq.extraitTete();
				System.out.println("Extraction en Tete de "+ s);
				assert (s == min + 1);
				assert ((count == 1) == (seq.estVide()));
				return s;

			}
			break;
		}
		return Integer.MIN_VALUE;
	}
	
	
	/*public static void main(String[] args) throws Exception {
		Random r = new Random();
		SequenceListe s1 = new SequenceListe();
		SequenceTableau s2 = new SequenceTableau();
		assert (s1.estVide());
		assert (s2.estVide());
		min = -1;
		max = 0;
		count = 0;

		for (int i = 0; i < 10; i++) {
			int code = r.nextInt(4);
			System.out.println(code);
			int r1 = operation(s1, code);
			int r2 = operation(s2, code);
			if (code < 2) {
				count++;
				if (code < 1)
					min--;
				else
					max++;
			} else {
				if (count > 0) {
					count--;
					min++;
				}
			}
			assert (r1 == r2);
		}
	}*/
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		switch(Integer.parseInt(s.substring(0,1))) {
		case 0: test(new FabriqueSequenceListe());break;
		case 1: test(new FabriqueSequenceTableau());break;
		case 2: test(new FabriqueSequenceListe());
		test(new FabriqueSequenceTableau());break;
		}
	}
	
	public static void test(FabriqueSequence s) {
		
		Sequence s1,s2;
		s1 = s.nouvelle();
		s1.insereQueue(10);
		s1.insereQueue(5);
		s2 = s.nouvelle();
		while(!s1.estVide()) {
			s2.insereQueue(s1.extraitTete());
			System.out.println(s2.extraitTete());
		}
		
	}
}

package etape2;

public interface NodeInterface {
	void insereTete(int element);
	
	void insereQueue(int element);
	int extraitTete() throws Exception;	
	boolean estVide();
	
	public static void main(String[] args) throws Exception {
		SequenceListe s1 = new SequenceListe();
		int teteValue;
		String str;
		boolean vide;
		vide = s1.estVide();
		System.out.println("vide? :"+ vide);
		s1.insereTete(6);
		s1.insereQueue(5);
		s1.insereQueue(4);
		s1.insereQueue(3);
		s1.insereQueue(2);
		s1.insereTete(1);
		s1.insereTete(8);
		str = s1.toString();
		System.out.print("My linked liste : " + str + " size : " + s1.size);
		System.out.println();
		vide = s1.estVide();
		System.out.println("vide now? :"+ vide);
	
		teteValue = s1.extraitTete();
		str = s1.toString();
		System.out.print("My linked liste : " + str + " Et la tete :"+ teteValue +" "+ "size : "+s1.size);
	}
}

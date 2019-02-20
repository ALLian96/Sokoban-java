package sources.Structures;


public interface Sequence<E> {
		void insereTete(E element);
		
		void insereQueue(E element);
		E extraitTete() ;
		boolean estVide();
		Iterateur iterateur();

}

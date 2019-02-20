package sources.Structures;

public class FAPListe<E extends Comparable<E>> extends FAP<E>{
	SequenceListe<E> s;
	
	public FAPListe() {
		s = new SequenceListe<>();
		super.s = s;
	}
	@Override
	public void insere(E element) {
		Maillon<E> precedent,courant;
		
		precedent = null;
		courant = s.tete;
		while((courant != null) && (element.compareTo(courant.element)>0)) {
			precedent = courant;
			courant = courant.suivant;
		}
		Maillon<E> m = new Maillon<>(element,courant);
		if(precedent == null) {
			s.tete = m;
		}
		else {
			precedent.suivant = m;
		}
		if(courant == null)
			s.queue = m;
	}
	
	
}

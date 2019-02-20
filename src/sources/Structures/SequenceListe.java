package sources.Structures;

public class SequenceListe<E> implements Sequence<E> {
	Maillon<E> tete,queue;

	@Override	
	public void insereTete(E element) {
			Maillon<E> m = new Maillon<>(element,tete);
			if(queue == null)
				queue = m;
			tete = m;
	}
	
	@Override
	public void insereQueue(E element) {
			Maillon<E> m = new Maillon<E>(element,null);
			if(queue == null) {
				queue = tete = m;
			}
				
			else {
				queue.suivant = m;
				queue = m;
			}
		
	}
	
	public E extraitTete(){
			E valTete;
			if(tete == null) {
				throw new RuntimeException("S¨¦quence vide");
			}
			else {
				valTete = tete.element;
				tete = tete.suivant;
				if(tete == null) {
					queue = null;
				}
				return valTete;
			}
	}
		
	public boolean estVide() {
		return (tete == null);
			
	}
	
	public String toString() {
		String resultat = "SequenceListe [ ";
		boolean premier = true;
		Maillon<E> m = tete;
		if(m == null) {
			resultat = "vide";
		}
		else{
			while(m != null) {
				if(!premier) {
					resultat += ", ";
				}
				resultat += m.element;
				m = m.suivant;
				premier = false;
			}
			resultat += "]";

		}
		return resultat;	
	}
	@Override
	public Iterateur<E> iterateur() {
		return new IterateurSequenceListe<>(this);
	}

}

package sources.Structures;
public class SequenceTableau<E> implements Sequence<E>{
	Object[] elements;
	int taille,debut;
	
	public SequenceTableau() {
			elements = new Object[1];
			debut = 0;
			taille = 0;
	}
	void redimensionne(int nouvelleCapacite){
		Object[] nouveau;
		if(nouvelleCapacite > elements.length) {
			nouveau = new Object[nouvelleCapacite];
			int aCopier = taille;
			for (int i = 0;i < aCopier; i++) {
				nouveau[i] = extraitTete();
			}
			debut = 0;
			taille = aCopier;
			elements = nouveau;
		}
	}
	@Override
	public void insereTete(E element) {
		// TODO Auto-generated method stub
		if (taille == elements.length)
			redimensionne(taille * 2);
		debut = debut - 1;
		if(debut<0) {
			debut = elements.length -1;
		}
		elements[debut] = element;
		taille ++;

		
	}

	@Override
	public void insereQueue(E element) {
		// TODO Auto-generated method stub
		if(taille == elements.length) {
			redimensionne(taille * 2);
		}
		elements[(debut+taille)%elements.length] = element;
		System.out.println("index : "+(debut+taille)%elements.length);
		taille++;
	}

	@Override
	public E extraitTete() {
		// Resultat invalide si la sequence est vide
				@SuppressWarnings("unchecked")

		E resultat = (E)elements[debut];
		debut = (debut + 1) % elements.length;
		taille--;
		return resultat;

	}

	@Override
	public boolean estVide() {
		// TODO Auto-generated method stub
		return taille == 0;
	}
	@Override
	public String toString() {
		String resultat = "SequenceTableau [ ";
		int pos = debut;
		for(int i=0;i<taille;i++) {
			if(i>0) {
				resultat +=", ";
			}
			resultat +=elements[pos];
			pos =(pos+1)%elements.length;
		}
		resultat +="]";
		return resultat;
	}
	@Override
	public Iterateur<E> iterateur() {
		return new IterateurSequenceTableau<>(this);
	}


	
}

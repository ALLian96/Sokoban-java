package sources.Structures;

public class SequenceListe implements Sequence {
	Maillon tete,queue;

	@Override	
	public void insereTete(int element) {
			Maillon m = new Maillon(element,tete);
			if(queue == null)
				queue = m;
			tete = m;
	}
	
	@Override
	public void insereQueue(int element) {
			Maillon m = new Maillon(element,null);
			if(queue == null) {
				queue = tete = m;
			}
				
			else {
				queue.suivant = m;
				queue = m;
			}
		
	}
	
	public int extraitTete(){
			int valTete;
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
		Maillon m = tete;
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

}

package sources.Structures;


public class Maillon {
	int element;
	Maillon suivant;
	
	Maillon(int element, Maillon suivant){
		this.element = element;
		this.suivant = suivant;
	}
}

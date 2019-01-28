package etape2;

public class Maillon {
	int element;
	Maillon suivant;
	
	Maillon(int element, Maillon suivant){
		this.element = element;
		this.suivant = suivant;
	}
}

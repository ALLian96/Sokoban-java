import java.util.Scanner;


public class Niveau {
	
	char[][] monTableau;
	int ligne,colonne=0;
	String nom;
	
		public Niveau(){
			monTableau = new char [42][42];
		}
		
		void fixeNom(String s) {
			nom = s;			
		}
		
		void videCase(int i,int j) {
			monTableau[i][j] = 0;
		}
		
		void ajouteMur(int i,int j) {
			monTableau[i][j] = 35;
		}
		void ajoutePousseur(int i, int j) {
			if(monTableau[i][j] == 46) {
				monTableau[i][j]= 43;
			}
			else {
				monTableau[i][j]= 64;
			}
		}
		
		void ajouteCaisse(int i,int j) {
			if(monTableau[i][j] == 46) {
				monTableau[i][j]= 42;
			}
			else {
				monTableau[i][j]= 36;
			}
		}
		
		void ajouteBut(int i,int j) {
			monTableau[i][j]= 46;
		}
		
		int lignes() {
			return ligne;			
		}
		
		int colonnes() {		
			return this.colonne;	
		}
		
		String nom() {
			return this.nom;
		}
		
		boolean estVide(int l, int c) {
			return (monTableau[l][c]== 0);
			
		}
		
		boolean aMur(int l,int c) {
			return (monTableau[l][c]== 35);
			
		}
		
		boolean aBut(int l,int c) {
			return (monTableau[l][c]== 46);
			
		}
		boolean aPousseur(int l,int c) {
			return ((monTableau[l][c]== 43) ||(monTableau[l][c]== 64));
			
		}
		boolean aCaisse(int l,int c) {
			return ((monTableau[l][c]== 42) ||(monTableau[l][c]== 36));		
		}
}

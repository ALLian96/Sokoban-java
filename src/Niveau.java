import java.util.Scanner;

public class Niveau {
	
	int[][] monTableau;
	
		public Niveau(){
		 monTableau = new int [42][42];
		}
	
	
	
		
		void fixeNom(String s) {
			
		}
		
		void videCase(int i,int j) {
			
		}
		
		void ajouteMur(int i,int j) {
			
		}
		void ajoutePousseur(int i, int j) {
			
		}
		
		void ajouteCaisse(int i,int j) {
			
		}
		
		void ajouteBut(int i,int j) {
			
		}
		
		int lignes() {
			return monTableau.length;					
		}
		
		int colonnes() {		
			return  monTableau[0].length;			
		}
		
		String nom() {
			return null;
			
		}
		
		boolean estVide(int l, int c) {
			return false;
			
		}
		
		boolean aMur(int l,int c) {
			return false;
			
		}
		
		boolean aBut(int l,int c) {
			return false;
			
		}
		boolean aPousseur(int l,int c) {
			return false;
			
		}
		boolean aCaisse(int l,int c) {
			return false;
			
		}
}

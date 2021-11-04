package src.n1exercici6;

public class Main {

	public static void main(String[] args) {
		Frog rana = new Frog();
		Amphibian padre = (Amphibian)rana;
		padre.comer();
		padre.nadar();
		
		System.out.println();
		Frog hijo = (Frog)padre;
		hijo.comer();
		hijo.croar();
		hijo.reproducir();
		

	}

}

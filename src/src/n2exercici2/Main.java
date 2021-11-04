package n2exercici2;

public class Main {

	public static void main(String[] args) {
		Jerbo jb = new Jerbo();
		Hamster hm = new Hamster();
		Raton rt = new Raton();
		
		Roedor[] lista = new Roedor[3];
		lista[0] = jb;
		lista[1] = hm;
		lista[2] = rt;
		
		//Només puc cridar a funcions de la classe 'pare'
		//perque l'objecte ara es de tipus Roedor.
		lista[0].caminar();
		lista[0].comer();
		lista[0].reproducir();
		
		((Jerbo)lista[0]).cazarMoscas();

	}

}

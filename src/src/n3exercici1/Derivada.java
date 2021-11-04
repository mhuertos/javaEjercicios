package n3exercici1;

public class Derivada extends Base{
	
	public static void main(String[] args) {
		Derivada p1 = new Derivada();
		Base b1 = new Base();
		Base bGeneralizado = (Base)p1;
		b1.metodo2();
		bGeneralizado.metodo2();

	}
	
	public void metodo2() {
		metodo1();
		System.out.println("Este es el método 2 de Derivada");
	}
}

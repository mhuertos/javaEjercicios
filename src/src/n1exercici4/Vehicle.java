package src.n1exercici4;

public class Vehicle {
	final static int velocidad = 150;
	final String marca;
	static String color;
	
	public Vehicle(String carMarca, String carColor) {
		marca = carMarca;
		color = carColor;
	}
	
	public void arrancarCoche() {
		System.out.println("Esto es el método para arrancar el coche");
	}
	
	public static void parar() {
		System.out.println("Esto es el método para parar el coche");
	}
	
	public void acelerar() {
		System.out.println("Este es el método para acelerar el coche");
	}
}

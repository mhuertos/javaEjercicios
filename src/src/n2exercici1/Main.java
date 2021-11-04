package src.n2exercici1;

public class Main {

	public static void main(String[] args) {
		Bicycle bc = new Bicycle();
		Tricycle tc = new Tricycle();
		Unicycle uc = new Unicycle();
		ride(bc);
		ride(tc);
		ride(uc);
		
		bc.wheels();
		tc.wheels();
		uc.wheels();
		
		Cycle[] matriz = new Cycle[3];
		matriz[0] = bc;
		matriz[1] = tc;
		matriz[2] = uc;
		
		((Bicycle)matriz[0]).balance();
		//((Tricycle)matriz[1]).balance(); NO FUNCIONA
		((Unicycle)matriz[2]).balance();
	}
	
	public static void ride(Cycle c) {
		c.wheels();
	}

}


public class mainApp {

	public static void main(String[] args) {

		//Creamos la raiz
		Raices raiz = new Raices(1, 12, 4);
		
		if(raiz.calcular() == 2) {
			System.out.println("Solucion 1: " +raiz.obtenerRaices()[0] );
			System.out.println("Solucion 2: " +raiz.obtenerRaices()[1] );
	
		}else if(raiz.calcular() == 1) {
			System.out.println("Solucion: " + raiz.obtenerRaiz());
		}else {
			System.out.println("Esta raiz no tiene solucion");
		}
		
	}

}

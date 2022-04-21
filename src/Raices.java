
public class Raices {

	int a, b, c;

	public Raices(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	// Calcula el discriminante
	public double getDiscriminante() {

		double discriminante = 0;

		discriminante = (Math.pow(this.b, 2)) - (4 * this.a * this.c);

		return discriminante;

	}

	// Si el discriminante es mas grande o igual a 0 tiene dos Raices
	public boolean tieneRaices() {

		if (getDiscriminante() >= 0) {
			return true;
		}
		return false;
	}

	public boolean tieneRaiz() {

		if (getDiscriminante() == 0) {
			return true;
		}
		return false;
	}

	public int calcular() {


		int soluciones;

		if (tieneRaices()) {

			if (tieneRaiz()) {
				soluciones = 1;
			} else {
				soluciones = 2;
			}
		} else {
			soluciones = 0;
		}

		return soluciones;
	}
	
	public double[] obtenerRaices() {
		double soluciones[] = new double[2];
		System.out.println("Tiene dos soluciones");
		
		//Positiva
		soluciones[0] = ((-this.b) + Math.sqrt(Math.pow(this.b, 2) - (4 * this.a * this.c))) / (2 * this.a);
		//Negativa
		soluciones[1] = ((-this.b) - Math.sqrt(Math.pow(this.b, 2) - (4 * this.a * this.c))) / (2 * this.a);
		
		return soluciones;
	}
	
	public double obtenerRaiz() {
		System.out.println("Tiene una solucion");
		double solucion = ((-this.b) - Math.sqrt(Math.pow(this.b, 2) - (4 * this.a * this.c))) / (2 * this.a);
		
		return solucion;
	}

}

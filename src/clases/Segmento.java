package clases;

public class Segmento {
	
	private Punto puntoA, puntoB;
	
	/**
	 * Creo mi segmento a base de utilizar la Clase Punto, asignando (0,0) al punto A y (1,1) al punto B
	 */
	public Segmento() {
		puntoA.setPosX(0);
		puntoA.setPosY(0);
		
		puntoB.setPosX(1);
		puntoB.setPosY(1);
	}
	
	/**
	 * @param a
	 * @param b
	 * 
	 * Constructor donde inserto Puntos de la clase Punto para asignarselos a mis variables puntoA y puntoB
	 */
	public Segmento(Punto a, Punto b) {
		
		try {
			
			if(a.toString().equals(b.toString()))
				throw new IllegalArgumentException("No se puede ingresar la misma coordenada para ambos puntos");
			
			this.puntoA = a;
			this.puntoB = b;
			
		}catch(IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
	}
	
	/**
	 * @return this.puntoA
	 */
	
	public Punto getPuntoA() {
		return this.puntoA;
	}
	
	/**
	 * @return this.puntoB
	 */
	
	public Punto getPuntoB() {
		return this.puntoB;
	}
	
	/**
	 * @param x,y 
	 * Le asigno las variables correspondientes a puntoA
	 */
	
	public void setPuntoA(int x, int y) {
		this.puntoA.setPosX(x);
		this.puntoA.setPosY(y);
	}
	
	/**
	 * @param x,y
	 * Le asigno las variables correspondientes a puntoB
	 */
	public void setPosY(int x, int y) {
		this.puntoB.setPosX(x);
		this.puntoB.setPosY(y);
	}
	
	/**
	 * Devuelvo los valores que ingreso en el toString (los valores de puntoA y puntoB)
	 */
	@Override
	public String toString() {
		return "[(" + puntoA.getPosX() + "," + puntoA.getPosY() + "),(" + puntoB.getPosX() + "," + puntoB.getPosY() + ")]";
	}
	
	/**
	 * Función que devuelve la distacia entre dos puntos
	 */
	
	public double distancia() {
		double resultado = Math.sqrt(Math.pow((puntoB.getPosX() - puntoA.getPosX()), 2) + Math.pow((puntoB.getPosY() - puntoA.getPosY()), 2));
		return resultado;
	}
}

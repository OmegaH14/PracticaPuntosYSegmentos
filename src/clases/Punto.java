package clases;

public class Punto {
	private int coordenadaX, coordenadaY;
	
	
	/**
	 * Constructor donde le doy el valor 0 a las variables
	 */
	public Punto() {
		this.coordenadaX = 0;
		this.coordenadaY = 0;
	}
	/**
	 * @param x
	 * @param y
	 * 
	 * Constructor donde le doy los valores que yo indico como parámetros
	 */
	
	public Punto(int x, int y) {
		this.coordenadaX = x;
		this.coordenadaY = y;
	}
	
	/**
	 * @return this.coordenadaX
	 */
	
	public int getPosX() {
		return this.coordenadaX;
	}
	
	/**
	 * @return this.coordenadaY
	 */
	
	public int getPosY() {
		return this.coordenadaY;
	}
	
	/**
	 * @param x
	 */
	
	public void setPosX(int x) {
		this.coordenadaX = x;
	}
	
	/**
	 * @param y
	 */
	public void setPosY(int y) {
		this.coordenadaY = y;
	}
	
	/**
	 * Devuelvo los valores que ingreso en el toString (los valores de coordenadasX y coordenadasY)
	 */
	@Override
	public String toString() {
		return "(" + this.coordenadaX + "," + this.coordenadaY + ")";
	}
}

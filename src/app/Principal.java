package app;

import clases.Punto;
import clases.Segmento;

public class Principal {

	public static void main(String[] args) {
		
		int x,y;
		
		x = (int)(Math.random() * 11 - 1);
		y = (int)(Math.random() * 11 - 1);
		
		Punto puntoA = new Punto (x,y);
		
		x = (int)(Math.random() * 11 - 1);
		y = (int)(Math.random() * 11 - 1);
		
		Punto puntoB = new Punto (x,y);
		
		x = (int)(Math.random() * 11 - 1);
		y = (int)(Math.random() * 11 - 1);
		
		Punto puntoC = new Punto (x,y);
		
		x = (int)(Math.random() * 11 - 1);
		y = (int)(Math.random() * 11 - 1);
		
		Punto puntoD = new Punto (x,y);
		
		Segmento segmento1 = new Segmento(puntoA,puntoB);
		Segmento segmento2 = new Segmento(puntoC,puntoD);
		
		

	}

}

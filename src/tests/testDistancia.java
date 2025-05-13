package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import clases.Punto;
import clases.Segmento;

class testDistancia {

	@Test
	void testSegmentoPositivo() {
		
		
		Punto puntoA = new Punto(2, 1);
		Punto puntoB = new Punto(3, 4);
		
		Segmento segmento1 = new Segmento(puntoA, puntoB);
		
		double distanciaObtenida = segmento1.distancia();
		double distanciaEsperada = 3.1622776601683795;
		
		assertEquals(distanciaEsperada, distanciaObtenida);
		
	}
	
	@Test
	void testSegmentoNegativo() {
		Punto puntoA = new Punto(-5, -8);
		Punto puntoB = new Punto(-3, -7);
		
		Segmento segmento1 = new Segmento(puntoA, puntoB);
		
		double distanciaObtenida = segmento1.distancia();
		double distanciaEsperada = 2.23606797749979;
		
		assertEquals(distanciaEsperada, distanciaObtenida);
	}
	
	@Test
	void testSegmentoPositivoNegativo() {
		Punto puntoA = new Punto(1, 10);
		Punto puntoB = new Punto(-15, -2);
		
		Segmento segmento1 = new Segmento(puntoA, puntoB);
		
		double distanciaObtenida = segmento1.distancia();
		double distanciaEsperada = 20;
		
		assertEquals(distanciaEsperada, distanciaObtenida);
	}
	
	@Test
	void testSegmentoMismoValor() {
		try {
		Punto puntoA = new Punto(2, 3);
		Punto puntoB = new Punto(2, 3);
		if(puntoA.toString().equals(puntoB.toString()))
			throw new IllegalArgumentException("No se puede ingresar la misma coordenada para ambos puntos");
		}catch(IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}

		
	}

}

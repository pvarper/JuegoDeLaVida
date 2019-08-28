package tdd.juego.test;

import static org.junit.Assert.*;

import org.junit.Test;

import tdd.juego.vida.Matriz;

public class JuegoTest {

	@Test
	public void cargarMatrizFila() {
		Matriz matriz= new Matriz();
		int inputFila=2;

		int[][]matrizCargada=matriz.cargarMatriz(inputFila, 0);
		
		int expectedFila=2;

		
		assertEquals(expectedFila, matrizCargada.length);
		
	}

}

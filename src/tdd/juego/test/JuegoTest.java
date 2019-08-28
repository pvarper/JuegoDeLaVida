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
	
	@Test
	public void cargarMatrizColumna() {
		Matriz matriz= new Matriz();
		int inputFila=4;
		int inputColumna=12;

		int[][]matrizCargada=matriz.cargarMatriz(inputFila, inputColumna);
		
		int expectedColumna=12;

		
		assertEquals(expectedColumna, matrizCargada[0].length);
		
	}

}

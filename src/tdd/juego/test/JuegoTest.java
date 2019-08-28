package tdd.juego.test;

import static org.junit.Assert.*;

import org.junit.Test;

import tdd.juego.vida.Matriz;

public class JuegoTest {

	@Test
	public void cargarMatrizFila() {
		Matriz matriz= new Matriz();
		int inputFila=2;

		matriz.cargarMatriz(inputFila, 0);
		
		int expectedFila=2;

		
		assertEquals(expectedFila, matriz.getMatriz().length);
		
	}
	
	@Test
	public void cargarMatrizColumna() {
		Matriz matriz= new Matriz();
		int inputFila=4;
		int inputColumna=12;

		matriz.cargarMatriz(inputFila, inputColumna);
		
		int expectedColumna=12;

		
		assertEquals(expectedColumna, matriz.getMatriz()[0].length);
		
	}
	
//	@Test
//	public void cargarMatrizCelulasVivas() {
//		Matriz matriz= new Matriz();
//		int inputFila=4;
//		int inputColumna=12;
//
//		int[][]matrizCargada=matriz.cargarMatriz(inputFila, inputColumna);
//		matriz.cargarCelula();
//		
//		int expectedColumna=1;
//
//		
//		assertEquals(expectedColumna, matrizCargada[0].length);
//		
//	}

}

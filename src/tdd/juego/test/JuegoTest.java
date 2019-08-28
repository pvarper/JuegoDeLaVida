package tdd.juego.test;

import static org.junit.Assert.*;

import org.junit.Test;

import tdd.juego.vida.Matriz;

public class JuegoTest {

	@Test
	public void cargarMatrizFilaColumna() {
		Matriz matriz= new Matriz();
		int inputFila=3;
		int inputColumna=4;
		int[][]matrizCargada=matriz.cargarMatriz(inputFila, inputColumna);
		
		int expectedFila=3;
		int expectedColumna=4;
		
		assertEquals(expectedFila, matrizCargada.length);
		
	}

}

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
	
	@Test
	public void cargarMatrizCelulasVivas() {
		Matriz matriz= new Matriz();
		matriz.cargarMatriz(7, 12);
		
		int coordenadaFila=5;
		int coordenadaColumna=5;
		matriz.cargarCelulaViva(coordenadaFila, coordenadaColumna);
		
		int expectedCelula=1;

		
		assertEquals(expectedCelula, matriz.getMatriz()[coordenadaFila-1][coordenadaColumna-1]);
		
	}
	
	@Test
	public void esCelulaViva() {
		Matriz matriz= new Matriz();
		matriz.cargarMatriz(7, 12);
		

		
		matriz.cargarCelulaViva(2, 2);

		boolean esCelulaViva=matriz.celulaViva(7, 12);
		
		boolean expectedCelula=false;

		
		assertEquals(expectedCelula, esCelulaViva);
		
	}

}

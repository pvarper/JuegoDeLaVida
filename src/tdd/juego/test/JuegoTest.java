package tdd.juego.test;

import static org.junit.Assert.*;

import org.junit.Test;

import tdd.juego.vida.Juego;
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
		Juego juego= new Juego();
		juego.cargarMatriz(7, 8);
		
		int coordenadaFila=5;
		int coordenadaColumna=5;
		int[][]matriz=juego.cargarCelulaViva(coordenadaFila, coordenadaColumna);
		
		int expectedCelula=1;

		
		assertEquals(expectedCelula, matriz[coordenadaFila-1][coordenadaColumna-1]);
		
	}
	
	@Test
	public void esCelulaViva() {
		Juego juego= new Juego();
		juego.cargarMatriz(7, 12);
		

		
		juego.cargarCelulaViva(2, 2);

		boolean esCelulaViva=juego.celulaViva(2, 2);
		
		boolean expectedCelula=true;

		
		assertEquals(expectedCelula, esCelulaViva);
		
	}

}

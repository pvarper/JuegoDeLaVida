package tdd.juego.test;

import static org.junit.Assert.*;

import org.junit.Test;

import tdd.juego.vida.Juego;
import tdd.juego.vida.Matriz;

public class JuegoTest {

	@Test
	public void testCargarMatrizFila() {
		Matriz matriz= new Matriz();
		int inputFila=2;

		matriz.cargarMatriz(inputFila, 0);
		
		int expectedFila=2;

		
		assertEquals(expectedFila, matriz.getMatriz().length);
		
	}
	
	@Test
	public void testCargarMatrizColumna() {
		Matriz matriz= new Matriz();
		int inputFila=4;
		int inputColumna=12;

		matriz.cargarMatriz(inputFila, inputColumna);
		
		int expectedColumna=12;

		
		assertEquals(expectedColumna, matriz.getMatriz()[0].length);
		
	}
	
	@Test
	public void testCargarMatrizCelulasVivas() {
		Juego juego= new Juego();
		juego.cargarMatriz(7, 8);
		
		int coordenadaFila=5;
		int coordenadaColumna=5;
		int[][]matriz=juego.cargarCelulaViva(coordenadaFila, coordenadaColumna);
		
		int expectedCelula=1;

		
		assertEquals(expectedCelula, matriz[coordenadaFila-1][coordenadaColumna-1]);
		
	}
	
	@Test
	public void testEsCelulaViva() {
		Juego juego= new Juego();
		juego.cargarMatriz(7, 12);
		juego.cargarCelulaViva(2, 2);
		boolean esCelulaViva=juego.celulaViva(2, 2);	
		boolean expectedCelula=true;	
		assertEquals(expectedCelula, esCelulaViva);
		
	}
	
	@Test
	public void testVerificarCelulaVive() {
		Juego juego= new Juego();
		juego.cargarMatriz(4, 4);
		juego.cargarCelulaViva(1, 2);
		juego.cargarCelulaViva(2, 2);
		juego.cargarCelulaViva(1, 1);
		
		int coordenadaFila=2;
		int coordenadaColumna=2;
		boolean expectedCelula=true;	
		assertEquals(expectedCelula, juego.verificarCelulaViveMuere(1, coordenadaFila-1, coordenadaColumna-1));
		
	}
	
	@Test
	public void testVerificarCelulaMuere() {
		Juego juego= new Juego();
		juego.cargarMatriz(4, 4);
		juego.cargarCelulaViva(1, 2);
		juego.cargarCelulaViva(2, 2);
		//juego.cargarCelulaViva(1, 1);
		
		int coordenadaFila=2;
		int coordenadaColumna=2;
		boolean expectedCelula=false;	
		assertEquals(expectedCelula, juego.verificarCelulaViveMuere(1, coordenadaFila-1, coordenadaColumna-1));
		
	}

}

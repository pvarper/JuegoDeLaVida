package tdd.juego.test;

import static org.junit.Assert.*;

import org.junit.Test;

import tdd.juego.vida.Juego;
import tdd.juego.vida.Matriz;

public class JuegoTest {

	@Test
	public void testCargarMatrizFila() {

		Juego juego= new Juego();
		int inputFila=2;

		juego.matriz.cargarMatriz(inputFila, 0);
		
		int expectedFila=2;

		
		assertEquals(expectedFila, juego.matriz.getMatriz().length);
		
	}
	
	@Test
	public void testCargarMatrizColumna() {
		Juego juego= new Juego();
		int inputFila=4;
		int inputColumna=12;

		juego.matriz.cargarMatriz(inputFila, inputColumna);
		
		int expectedColumna=12;

		
		assertEquals(expectedColumna, juego.matriz.getMatriz()[0].length);
		
	}
	
	@Test
	public void testCargarMatrizCelulasVivas() {
		Juego juego= new Juego();
		juego.cargarMatriz(7, 8);//8 filas y 9 columnas
		
		int coordenadaFila=5;//6
		int coordenadaColumna=5;//6
		
		juego.cargarCelulaViva(coordenadaFila, coordenadaColumna);
		
		int expectedCelula=1;

		
		assertEquals(expectedCelula, juego.matriz.getMatriz()[coordenadaFila][coordenadaColumna]);
		
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
		assertEquals(expectedCelula, juego.verificarCelulaViveMuere(1, coordenadaFila, coordenadaColumna));
		
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
		assertEquals(expectedCelula, juego.verificarCelulaViveMuere(1, coordenadaFila, coordenadaColumna));
		
	}
	
	@Test
	public void testActualizarCelulaVivaAmuerta() {
		Juego juego= new Juego();
		juego.cargarMatriz(4, 4);
		juego.cargarCelulaViva(1, 1);
		juego.actualizarCelula();
		
		int coordenadaFila=1;
		int coordenadaColumna=1;
		
		
		int expectedCelula=0;	
		assertEquals(expectedCelula, juego.matriz.getMatriz()[coordenadaFila][coordenadaColumna]);
		
	}
	
	@Test
	public void testActualizarCelulaMuertaAviva() {
		Juego juego= new Juego();
		juego.cargarMatriz(4, 4);
		juego.cargarCelulaViva(2, 2);
		juego.cargarCelulaViva(1, 2);
		juego.cargarCelulaViva(2, 1);
		
		juego.actualizarCelula();
		
		int coordenadaFila=1;
		int coordenadaColumna=1;
		
		
		int expectedCelula=1;	
		assertEquals(expectedCelula, juego.matriz.getMatriz()[coordenadaFila][coordenadaColumna]);
		
	}
	
	@Test
	public void testActualizarCelulaVivaAmuertaPorSuperPoblacion() {
		Juego juego= new Juego();
		juego.cargarMatriz(4, 4);
		juego.cargarCelulaViva(1, 1);
		juego.cargarCelulaViva(0,0);
		juego.cargarCelulaViva(0, 1);
		juego.cargarCelulaViva(0, 2);
		juego.cargarCelulaViva(1, 0);
		juego.cargarCelulaViva(1, 2);
		juego.matriz.pintarMatriz();
		juego.actualizarCelula();
		System.out.println("------");
		juego.matriz.pintarMatriz();
		int coordenadaFila=1;
		int coordenadaColumna=1;
		
		
		int expectedCelula=0;	
		assertEquals(expectedCelula, juego.matriz.getMatriz()[coordenadaFila][coordenadaColumna]);
		
	}

}

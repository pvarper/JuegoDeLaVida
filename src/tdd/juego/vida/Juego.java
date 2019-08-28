package tdd.juego.vida;

public class Juego {

	Matriz matriz = new Matriz();
	public static final int celulaViva=1;
	public static final int celulaMuerta=0;

	public static void main(String[] args) throws InterruptedException {
		

	}

	public void cargarMatriz(int filas, int columnas) {
		matriz.cargarMatriz(filas, columnas);

	}

	public void jugar() {

		

	}

	public boolean verificarCelulaViveMuere(int celulaViva, int coordenadaFila, int coordenadaColumnsa) {
		
		return true;
	}
	
	public int[][] cargarCelulaViva(int filas, int columna) {
		matriz.getMatriz()[filas - 1][columna - 1] = celulaViva;
		return matriz.getMatriz();
	}

	public boolean celulaViva(int coordenadaFila, int coordenadaColumna) {
		boolean esCelulaViva = false;
		if (matriz.getMatriz()[coordenadaFila - 1][coordenadaColumna - 1] == celulaViva) {
			esCelulaViva = true;
		}

		return esCelulaViva;
	}

	public void limpiar() {
		for (int i = 0; i < matriz.matriz.length; i++) {
			System.out.println();
		}
	}
}

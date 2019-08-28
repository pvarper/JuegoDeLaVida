package tdd.juego.vida;

public class Juego {

	Matriz matriz = new Matriz();
	public static final int celulaViva = 1;
	public static final int celulaMuerta = 0;

	public static void main(String[] args) throws InterruptedException {

	}

	public void cargarMatriz(int filas, int columnas) {
		matriz.cargarMatriz(filas, columnas);

	}

	public void jugar() {

	}

	public boolean verificarCelulaViveMuere(int celulaEstado, int coordenadaFila, int coordenadaColumna) {

		int cantidadVecinos = 0;
		try {
			if (celulaViva(coordenadaFila - 1, coordenadaColumna - 1)) {
				cantidadVecinos++;
			}
			if (celulaViva(coordenadaFila - 1, coordenadaColumna)) {
				cantidadVecinos++;
			}
			 
			if (celulaViva(coordenadaFila - 1, coordenadaColumna + 1)) {
				cantidadVecinos++;
			}
			if (celulaViva(coordenadaFila, coordenadaColumna - 1)) {
				cantidadVecinos++;
			}
			if (celulaViva(coordenadaFila , coordenadaColumna + 1)) {
				cantidadVecinos++;
			}
			if (celulaViva(coordenadaFila + 1, coordenadaColumna - 1)) {
				cantidadVecinos++;
			}
			if (celulaViva(coordenadaFila + 1, coordenadaColumna )) {
				cantidadVecinos++;
			}
			if (celulaViva(coordenadaFila +1, coordenadaColumna +1)) {
				cantidadVecinos++;
			}
		} catch (java.lang.ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		
		// Si está muerta y tiene 3 o más vivas
		if (celulaEstado==Juego.celulaMuerta && cantidadVecinos == 3) {
			return true;
		}
		// si está viva y tiene 2 o 3 vivas sigue viva
		if (celulaEstado==Juego.celulaViva && (cantidadVecinos == 2 || cantidadVecinos == 3)) {
			return true;
		}
		// de lo contrario muere
		return false;
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

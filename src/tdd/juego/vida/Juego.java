package tdd.juego.vida;

public class Juego {

	public Matriz matriz = new Matriz();
	public static final int celulaViva = 1;
	public static final int celulaMuerta = 0;

	public static void main(String[] args) throws InterruptedException {

	}

	public void cargarMatriz(int filas, int columnas) {
		matriz.cargarMatriz(filas, columnas);

	}

	public void jugar() {

	}
	
	public void actualizarCelula() {
		boolean estadoCelula;
		for (int i = 0; i < matriz.matriz.length; i++) {
			for (int j = 0; j < matriz.matriz[i].length; j++) {
				
				// Si la célula está muerta
				if (!celulaViva(i, j)) {
					// puede nacer o seguir muerta
					estadoCelula = verificarCelulaViveMuere(celulaMuerta, i, j);
				} // Si la célula está viva
				else {
					// puede sobrevivir o morir
					estadoCelula = verificarCelulaViveMuere(celulaViva, i, j);
				}
				if (estadoCelula) {
					cargarCelulaViva(i, j);
				} else {
					matriz.matriz[i][j] = celulaMuerta;
				}
			}
		}

	}

	public boolean verificarCelulaViveMuere(int celulaEstado, int coordenadaFila, int coordenadaColumna) {

		int cantidadVecinos = 0;
		try {
			if (celulaViva(coordenadaFila - 1, coordenadaColumna - 1)) {
				cantidadVecinos++;
			}
		} catch (java.lang.ArrayIndexOutOfBoundsException e) {
		}
		try {
			if (celulaViva(coordenadaFila - 1, coordenadaColumna)) {
				cantidadVecinos++;
			}
		} catch (java.lang.ArrayIndexOutOfBoundsException e) {
		}
		try { 
			if (celulaViva(coordenadaFila - 1, coordenadaColumna + 1)) {
				cantidadVecinos++;
			}
		} catch (java.lang.ArrayIndexOutOfBoundsException e) {
		}
		try {
			if (celulaViva(coordenadaFila, coordenadaColumna - 1)) {
				cantidadVecinos++;
			}
		} catch (java.lang.ArrayIndexOutOfBoundsException e) {
		}
		try {
			if (celulaViva(coordenadaFila , coordenadaColumna + 1)) {
				cantidadVecinos++;
			}
		} catch (java.lang.ArrayIndexOutOfBoundsException e) {
		}
		try {
			if (celulaViva(coordenadaFila + 1, coordenadaColumna - 1)) {
				cantidadVecinos++;
			}
		} catch (java.lang.ArrayIndexOutOfBoundsException e) {
		}
		try {
			if (celulaViva(coordenadaFila + 1, coordenadaColumna )) {
				cantidadVecinos++;
			}
		} catch (java.lang.ArrayIndexOutOfBoundsException e) {
		}
		try {
			if (celulaViva(coordenadaFila +1, coordenadaColumna +1)) {
				cantidadVecinos++;
			}
		} catch (java.lang.ArrayIndexOutOfBoundsException e) {
			
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
		matriz.getMatriz()[filas][columna] = celulaViva;
		return matriz.getMatriz();
	}

	public boolean celulaViva(int coordenadaFila, int coordenadaColumna) {
		boolean esCelulaViva = false;
		if (matriz.getMatriz()[coordenadaFila][coordenadaColumna] == celulaViva) {
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

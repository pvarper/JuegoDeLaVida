package tdd.juego.vida;

public class Juego {
	
	Matriz matriz= new Matriz();
	
	public static void main(String[] args) {

//		Juego juego = new Juego();
//		juego.jugar();
	}
	
	public void cargarMatriz(int filas, int columnas) {
		matriz.cargarMatriz(filas, columnas);	
//		matriz.pintarMatriz();
		
	}
	
	public void jugar() {
		
	}
	
	private void regla1() {
		
	}
	
	private void regla2() {
		
	}
	
	public int[][] cargarCelulaViva(int filas, int columna) {
		matriz.getMatriz()[filas-1][columna-1]=1;
		return matriz.getMatriz();
	}
	
	public boolean celulaViva(int coordenadaFila, int coordenadaColumna) {
		boolean esCelulaViva=false;
		if(matriz.getMatriz()[coordenadaFila-1][coordenadaColumna-1]==1) {
			esCelulaViva=true;
		}		
		
		return esCelulaViva;
	}
}

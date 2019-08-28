package tdd.juego.vida;

public class Matriz {
	
	int[][] matriz;
	
	public void cargarMatriz(int filas, int columnas) {
		matriz = new int[filas][columnas];		
	}
	
	public void cargarCelulaViva(int filas, int columna) {
		matriz[filas-1][columna-1]=1;
	}
	
	public void pintarMatriz() {
		for (int i = 0; i < matriz.length; i++) { 
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
	}
	
	public static void main(String[] args) {
		Matriz m= new Matriz();
		m.cargarMatriz(7,12);
		m.cargarCelulaViva(5, 5);
		m.pintarMatriz();
	}

	public int[][] getMatriz() {
		return matriz;
	}

	public void setMatriz(int[][] matriz) {
		this.matriz = matriz;
	}
	
	
	

}

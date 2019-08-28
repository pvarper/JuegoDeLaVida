package tdd.juego.vida;

public class Matriz {
	
	int[][] matriz;
	
	public void cargarMatriz(int filas, int columnas) {
		this.matriz = new int[filas][columnas];		
	}
	
	
	
	
	public void pintarMatriz() {
		for (int i = 0; i < matriz.length; i++) { 
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
	}
	
	

	public int[][] getMatriz() {
		return matriz;
	}

	public void setMatriz(int[][] matriz) {
		this.matriz = matriz;
	}
	
	
	

}

package tdd.juego.vida;

public class Matriz {
	
	int[][] matriz;
	
	public int[][] cargarMatriz(int filas, int columnas) {
		matriz = new int[filas][columnas];	
		return matriz;
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
		m.cargarMatriz(10,12);
		//m.pintarMatriz();
	}
	

}

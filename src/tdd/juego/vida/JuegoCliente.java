package tdd.juego.vida;

public class JuegoCliente {
	
public static void main(String[] args) throws InterruptedException {
		
		Juego juego = new Juego();
		juego.cargarMatriz(5, 5);
		juego.cargarCelulaViva(1, 2);
		juego.cargarCelulaViva(2, 2);
		juego.cargarCelulaViva(3, 2);
		juego.cargarCelulaViva(3, 2);
		juego.cargarCelulaViva(2, 1);
		juego.cargarCelulaViva(2, 3);


		//juego.cargarCelulaViva(4, 4);


		juego.matriz.pintarMatriz();
		Thread.sleep(1000);
		juego.limpiar();

		int cont = 0;
		while (cont < 50) {
			juego.jugar();
			juego.matriz.pintarMatriz();
			juego.limpiar();

			Thread.sleep(1000);

			cont = cont + 1;
		}

	}

}

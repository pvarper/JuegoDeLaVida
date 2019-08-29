Para ejecutar el juego debera abrir la clase JuegoCliente y seguir los siguientes pasos

1.-Inicializar la clase Juego

Juego juego = new Juego();

2.- Cargar la Matriz

juego.cargarMatriz(5, 5);

3.- Agregar Celulas Vivas

juego.cargarCelulaViva(1, 2);
		juego.cargarCelulaViva(2, 2);
		juego.cargarCelulaViva(3, 2);
		juego.cargarCelulaViva(3, 2);
		juego.cargarCelulaViva(2, 1);
		juego.cargarCelulaViva(2, 3);

4.- Jugar

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
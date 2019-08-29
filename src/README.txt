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
		
		juego.cargarCelulaViva(4, 2);
		juego.cargarCelulaViva(2, 5);
		juego.cargarCelulaViva(3, 7);
		juego.cargarCelulaViva(7, 8);
		juego.cargarCelulaViva(9, 3);
		juego.cargarCelulaViva(2, 1);
		
		juego.cargarCelulaViva(4, 6);
		juego.cargarCelulaViva(2, 1);
		juego.cargarCelulaViva(4, 7);
		juego.cargarCelulaViva(8, 8);
		juego.cargarCelulaViva(8, 2);
		juego.cargarCelulaViva(1, 0);
		
		juego.cargarCelulaViva(7, 2);
		juego.cargarCelulaViva(7, 3);
		juego.cargarCelulaViva(7, 4);
		juego.cargarCelulaViva(7, 5);
		juego.cargarCelulaViva(7, 6);
		juego.cargarCelulaViva(7, 7);
		
		juego.cargarCelulaViva(6, 2);
		juego.cargarCelulaViva(6, 3);
		juego.cargarCelulaViva(6, 4);
		juego.cargarCelulaViva(6, 5);
		juego.cargarCelulaViva(6, 6);
		juego.cargarCelulaViva(6, 7);

4.- Jugar (desde un IDE)

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

O tambien ejecutar de cmd el siguiente comando


java -jar D:\workspace\JuegoDeLaVida\bin\JuegoDeLaVida.jar

Tomar en cuenta donde se descarga el proyecto
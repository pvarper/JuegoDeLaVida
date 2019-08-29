La estrategia aplicada para la solucion de este juego fue:

1.- Utilizar una matriz de enteros donde 0 son celulas muertas y 1 son celulas vivas

2.- Se aplico TDD para la creacion de los metodos que se necesitarian para que el juego funcione

3.- Se realizaron test incialmente fallidos y luego se refactorizo el codigo para cumplir con test

4.- Para solucionar el juego, lo que se hizo fue recorrer la matriz casilla por casilla y preguntar si era celula muerta o viva.

5.- Sabiendo si era celula viva o muerta se verificaban las celulas vecinas y se inicializaba un contador para poder aplicar las reglas descritas en el juego.
	regla 1.- si la celula esta viva y tiene dos o tres celulas vecinas vivas, esta permanece viva, pero si tiene mas de 3, esta muere por sobrepoblacion.
	regla 2.- si la celula esta muerta y tres celulas vecinas vivas, la celula revive


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

package curso.g05.condicionales.p05;

import curso.utilidades.Consola;
/*
 * Pedir el d�a, mes y a�o de una fecha e indicar si la fecha es correcta. Con meses de 28, 30 y 31 d�as.
Sin a�os bisiestos.
 */
public class FiltroFechaConsole {

	public static void main(String[] args) {
		int dia, mes, año;
		// para que una fecha sea correcta se tiene que cumplir
		// d�a en el rango 1..30
		// mes en el rango 1..12
		// a�o cualquiera distinto del 0
		System.out.print("Introduzca d�a: ");
		dia = Consola.entero();
		System.out.print("Introduzca mes: ");
		mes = Consola.entero();
		System.out.print("Introduzca a�o: ");
		año = Consola.entero();
		if (dia >= 1 && dia <= 30)
			if (mes >= 1 && mes <= 12)
				if (año != 0)
					System.out.println("Fecha correcta");
				else
					System.out.println("A�o incorrecto");
			else
				System.out.println("Mes incorrecto");
		else
			System.out.println("D�a incorrecto");
	}

}

package examen;
/**
 * Paquete examen del proyecto del examen de segunda evaluacion
 * 
 * 
 *@author Diego Somovilla daw13.2024@gmail.com
 *@version 1.0
 * **/

 public class Fecha {
	public static boolean fechaValida;
	/**
	 * El método validarFecha comprueba si una Fecha a la que se le pasan 3 parámetros
	 * tiene unos valores acordes a los que una fecha se refieren,
	 * devolverá True o False dependiendo si la fecha es correcta.
	 * 
	 * @param anio = se le dará un entero que hace referencia al año de la Fecha
	 * @param mes = se le dará un entero que hace referencia al mes de la Fecha
	 * @param dia = se le dará un entero que hace referencia al día de la Fecha
	 * @return devolvera un booleano true o false dependiendo del valor de fechaValida
	 **/
	public static boolean validarFecha(int anio, int mes, int dia) {
		fechaValida = false;
		if ((dia > 0) && (mes > 0) && (anio > 0)) {
			if ((mes <= 12) && (dia <= 31)) {
				if (mes == 2) {
					fechaValida = dia <= 28;
				} else if (mes % 2 == 0) {
					fechaValida = dia <= 30;
				} else {
					fechaValida = dia <= 31;
				}
			}
		}
		return fechaValida;
	}
}
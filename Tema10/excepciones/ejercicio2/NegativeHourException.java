package ejercicio2;

public class NegativeHourException extends Exception{

	@Override
	public String toString() {
		return "Valor de horas negativo";
	}
	
	@Override
	public String getMessage() {
		return "Valor de horas negativo";
	}
	
}

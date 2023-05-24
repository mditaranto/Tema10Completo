package ejercicio2;

public class NegativeMinuteException extends Exception {

	@Override
	public String toString() {
		return "Valor de minutos negativo";
	}
	
	@Override
	public String getMessage() {
		return "Valor de minutos negativo";
	}
	
}

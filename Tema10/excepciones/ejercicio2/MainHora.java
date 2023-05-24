package ejercicio2;

public class MainHora {

	public static void main(String[] args) throws Exception{

		Hora h = new Hora(20, 50, -10);
		
		try {
			h.setSegundo(-50);
		} catch (NegativeSecondException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			h.setMinuto(-21);
		} catch (NegativeMinuteException e) {
			System.out.println(e.getMessage());
		}

	}

}

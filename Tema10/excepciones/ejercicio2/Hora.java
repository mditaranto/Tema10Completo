package ejercicio2;

public class Hora {

	private int hora;
	private int minuto;
	private int segundo;

	public Hora() {

	}

	public Hora(int hora, int minuto, int segundo) throws Exception {

		if (segundo < 0) {
			throw new NegativeSecondException();
		} else {
			this.segundo = segundo;
		}

		if (minuto < 0) {
			throw new NegativeMinuteException();
		} else {
			this.minuto = minuto;
		}

		if (hora < 0) {
			throw new NegativeHourException();
		} else {
			this.hora = hora;
		}

	}

	public Hora(Hora h) throws Exception {
		if (segundo < 0) {
			throw new NegativeSecondException();
		} else {
			this.segundo = h.segundo;
		}

		if (minuto < 0) {
			throw new NegativeMinuteException();
		} else {
			this.minuto = h.minuto;
		}

		if (hora < 0) {
			throw new NegativeHourException();
		} else {
			this.hora = h.hora;
		}

	}

	public int getHora() {
		return hora;
	}

	public void setHora(int hora) throws Exception{
		if (hora >= 0 && hora <= 23) {
			if (hora < 0) {
				throw new NegativeHourException();
			} else {
				this.hora = hora;
			}
		}
	}

	public int getMinuto() {
		return minuto;
	}

	public void setMinuto(int minuto) throws Exception {
		if (minuto < 0) {
			throw new NegativeMinuteException();
		} else {
			this.minuto = minuto;
		}
	}

	public int getSegundo() {
		return segundo;
	}

	public void setSegundo(int segundo) throws Exception {
		if (segundo < 0) {
			throw new NegativeSecondException();
		} else {
			this.segundo = segundo;
		}

	}
}

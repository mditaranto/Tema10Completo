package ejercicio3;

public class MainFecha {

	public static void main(String[] args) {
		Fecha fechaVacia = new Fecha();
		Fecha fechaCompleta = null;
		try {
			fechaCompleta = new Fecha(31, 12, 2023);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		Fecha fechaErronea = null;
		try {
			fechaErronea = new Fecha(30, 2, 2023);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		Fecha fechaErronea2 = null;
		try {
			fechaErronea2 = new Fecha(30, 15, 2023);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println();
		}

		System.out.println("Fecha vacía: " + fechaVacia);
		System.out.println("Fecha completa: " + fechaCompleta);
		System.out.println("Fecha errónea: " + fechaErronea);
		System.out.println("Fecha errónea2: " + fechaErronea2);

		System.out.println(fechaVacia.fechaCorrecta());
		System.out.println(fechaCompleta.fechaCorrecta());
		System.out.println(fechaErronea.fechaCorrecta());

		fechaVacia.diaSiguiente();
		fechaCompleta.diaSiguiente();
		fechaErronea.diaSiguiente();
		System.out.println("Fecha vacía: " + fechaVacia);
		System.out.println("Fecha completa: " + fechaCompleta);
		System.out.println("Fecha errónea: " + fechaErronea);

		System.out.println(fechaVacia.fechaCorrecta());
		System.out.println(fechaCompleta.fechaCorrecta());
		System.out.println(fechaErronea.fechaCorrecta());
	}

}

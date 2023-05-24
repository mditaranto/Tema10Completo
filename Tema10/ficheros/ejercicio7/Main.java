package ejercicio7;

import java.io.*;
import java.util.*;

public class Main {

	protected static final String RUTA = "C:\\Users\\Matis\\git\\Ficheros\\Tema10Ficheros\\src\\ejercicio7\\Agenda.txt";

	public static void main(String[] args) {

		TreeMap<String, Integer> contactos = new TreeMap<>();

		File agenda = new File(RUTA);
		if (!agenda.exists()) {
			try {
				agenda.createNewFile();
			} catch (Exception e) {
				System.err.println("No se ha podido crear el archivo");
			}
		}

		Agenda.reconectar(contactos);

		Scanner read = null;
		Scanner sca = new Scanner(System.in);

		int opc = 0;
		boolean end = false;
		String nombre;
		int tel;

		while (!end) {
			System.out.println(Agenda.Menu());
			opc = sca.nextInt();
			sca.nextLine();
			switch (opc) {
			case 1 -> {
				// Funcion añadir
				System.out.println("Introduzca el nombre del contacto: ");
				nombre = sca.nextLine();
				if (Agenda.añadirContacto(contactos, nombre)) {
					System.out.println("Introduzca el telefono del contacto: ");
					tel = sca.nextInt();
					sca.nextLine();

					contactos.put(nombre, tel);

				} else {
					System.err.println("No se ha podido introducir el contacto"
							+ "\nEl contacto ya existe o esta la agenda llena.");
				}
			}
			case 2 -> {
				System.out.println("Introduzca el nombre del contacto: ");
				nombre = sca.nextLine();
				System.out.println(Agenda.buscarNombre(contactos, nombre));
			}
			case 3 -> {
				System.out.println(Agenda.mostrarAgenda(contactos));
			}
			case 4 -> {
				end = true;
				Agenda.cerrarAgenda(contactos);
			}
			}
		}

	}

}

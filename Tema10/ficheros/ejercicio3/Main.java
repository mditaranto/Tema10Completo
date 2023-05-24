package ejercicio3;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sca = null;

		int edades = 0;
		float alturas = 0;
		int cont = 0;
		String nombres = "";
		String linea = " ";

		try {
			sca = new Scanner(new FileReader(
					"C:\\Users\\mditaranto\\elipse-workspace 2\\Tema10Ficheros\\src\\ejercicio3\\Alumnos.txt"));
			sca.useLocale(Locale.US);

			boolean acabado = false;

			while (sca.hasNextLine() && !acabado) {
				linea = sca.nextLine();
				if (linea.isEmpty()) {
					acabado = true;
				} else {
					String datos[] = linea.split(" ");

					nombres += datos[0] + " ";
					edades += Integer.valueOf(datos[1]);
					alturas += Float.valueOf(datos[2]);
					cont++;
				}
			}
		} catch (FileNotFoundException e) {
			System.err.printf("El archivo en la ruta no ha sido encontrado...\n");

		} catch (IOException e) {
			System.err.printf("Error al leer el archivo");
		} finally {
			System.out.println(nombres + "\n" + (float) edades / cont + " " + alturas / cont);
		}

	}
}

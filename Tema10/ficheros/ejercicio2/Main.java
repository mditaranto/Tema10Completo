package ejercicio2;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sca = null;
		try {
			sca = new Scanner(new FileReader(
					"C:\\Users\\mditaranto\\elipse-workspace 2\\Tema10Ficheros\\src\\ejercicio2\\Enteros.txt"));
			sca.useLocale(Locale.US);
			double suma = 0;
			int contador = 0;
			double media = 0;
			while (sca.hasNext()) {
				suma += sca.nextDouble();
				contador++;
			}

			media = suma / contador;
			System.out.println("Suma total: " + suma);
			System.out.println("Media: " + media);

		} catch (FileNotFoundException e) {
			System.out.println("No se encuentra el fichero");
			System.out.println(e.getMessage());
		} finally {
			if (sca != null) {
				sca.close();
			}
		}
	}

}

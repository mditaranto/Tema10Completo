package ejercicio6;

import java.io.*;
import java.util.*;

public class Main {
	
	private final static String RUTA = "C:\\Users\\mditaranto\\elipse-workspace 2\\Tema10Ficheros\\src\\ejercicio6";
	private static final String DES = RUTA + "\\desordenados.txt";
	private static final String ORD = RUTA + "\\ordenados.txt";

	public static void main(String[] args) {
		
		List <Integer> numeros = new ArrayList<>();
		int aleat;
		
		File desor = new File(DES);
		if (!desor.exists()) {
			try {
				desor.createNewFile();
			} catch (Exception e) {
				System.err.println("Error al crear el archivo");
			}
		}
		
		File ord = new File(ORD);
		if (!desor.exists()) {
			try {
				desor.createNewFile();
			} catch (Exception e) {
				System.err.println("Error al crear el archivo");
			}
		}
		
		BufferedWriter in = null;
		Scanner read = null;
		
		try {
			in = new BufferedWriter(new FileWriter(DES));
			
			
			for (int i = 0; i < 20; i++) {
				aleat = (int)(Math.random()*100);
				in.write(String.valueOf(aleat));
				in.newLine();
			}
			
			
		} catch (IOException e) {
			System.err.println("Error al abrir el archivo");
		} finally {
			try {
				in.flush();
				in.close();
			} catch (IOException e) {
				System.err.println("Error al cerrar el archivo");
			}
		}
		
		try {
			read = new Scanner(new FileReader(DES));
			
			while (read.hasNextLine()) {
				numeros.add((Integer.valueOf(read.nextLine())));	
			}
			
			numeros.sort(null);
			
		} catch (FileNotFoundException e) {
			System.err.println("No se encontro el archivo");
		} catch (IOException e) {
			System.err.println("Error al abrir el archivo");
		}
		
		try {
			in = new BufferedWriter(new FileWriter(ORD));
			
			for (Integer values: numeros) {
				in.write((String.valueOf(values)));
				in.newLine();
			}
			
		} catch (IOException e) {
			System.err.println("Error al abrir el archivo");
		} finally {
			try {
				in.flush();
				in.close();
				
			} catch (IOException e) {
				System.err.println("Error al cerrar el archivo");
			}
		}
		
	}

}

package ejercicio7;

import java.io.*;
import java.util.*;

public class Agenda {

	public static String Menu() {
		return "AGENDA +"
				+ "\n--------------"
				+ "\n [1] Nuevo contacto."
				+ "\n [2] Buscar contacto"
				+ "\n [3] Mostrar contactos"
				+ "\n [4] Salir";
				
	}
	
	public static boolean añadirContacto(TreeMap<String, Integer> agenda, String nombre) {
		boolean añadido = false;
		
		if (agenda.size() < 20 && !agenda.containsKey(nombre)) {
			añadido = true;
		} 
		
		return añadido;
	}
	
	public static String buscarNombre(TreeMap<String, Integer> agenda, String nombre) {
		String contacto= "No se ha encontrado el contacto";
		
		if (agenda.containsKey(nombre)) {
			contacto = "El contacto es: " + nombre + agenda.get(nombre);
		}
		
		return contacto;
	}
	
	public static String mostrarAgenda(TreeMap<String, Integer> agenda) {
		String res = "";
		
		for (Map.Entry<String, Integer> entry: agenda.entrySet()) {
			res += entry.getKey() + " " + entry.getValue() + "\n"; 
		}
		
		return res;
	}
	
	public static void reconectar(TreeMap<String, Integer> contactos) {
		try {
			Scanner read = new Scanner(new FileReader(Main.RUTA));
			
			while (read.hasNextLine()) {
				String [] datos = read.nextLine().split(",");
				contactos.put(datos[0], Integer.valueOf(datos[1]));
			}
		} catch (FileNotFoundException e) {
			System.err.println("No se encontro el archivo");
		} catch (IOException e) {
			System.err.println("Error al leer el archivo");
		}
	}
	
	public static void cerrarAgenda(TreeMap<String, Integer> contactos) {
		BufferedWriter in = null;
		try {
			in = new BufferedWriter(new FileWriter(Main.RUTA));
			
			for (Map.Entry<String, Integer> entry : contactos.entrySet()) {
				in.write(entry.getKey() + "," + entry.getValue().toString());
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

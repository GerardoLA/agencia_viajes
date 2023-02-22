package agencia_viajes;

import java.util.ArrayList;

public class Visor {


	
	public static void mostrarClientes(ArrayList<Cliente>clientes) {
		for (Cliente cliente : clientes) {
			System.out.println(cliente);
		}	
	}
	
	public static void mostrarCliente(Cliente cliente) {
		System.out.println(cliente);
	}
	
	public static void mostrarHabitacion(Habitacion habitacion) {
		System.out.println(habitacion);
		
	}
	
	public static void mostrarHabitaciones(ArrayList<Habitacion>ListaHabitaciones) {
		for (Habitacion habitacion : ListaHabitaciones) {
			System.out.println(habitacion);
		}
		
	}
	
	public static void mostrarHotel(Hotel hotel) {
		System.out.println(hotel);
	}
	
	
	public static void mostrarHoteles(ArrayList<Hotel>ListaHoteles) {
		for (Hotel hotel : ListaHoteles) {
			System.out.println(hotel);
		}
	}
	
}

	
	
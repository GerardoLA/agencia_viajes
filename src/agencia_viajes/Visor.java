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
}

	
	
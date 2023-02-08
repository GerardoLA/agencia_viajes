package agencia_viajes;

import java.sql.SQLException;
import java.util.Scanner;

public class GestorClientes {
	public static void run (Scanner scan) throws SQLException {
	
		int opcion;
		Cliente cliente = new Cliente();
		GestorBBDD gestor = new GestorBBDD();
		
		do {
			Menu.mostrarMenuCliente();
			opcion = Integer.parseInt(scan.nextLine());
			switch(opcion) {
			
			case Menu.ALTA_CLIENTE:
				cliente = FormularioDeDatos.pedirDatosCliente(scan);
				gestor.insertarCliente(cliente);
				System.out.println("Cliente dado de alta");

				break;
			case Menu.MODIFICAR_CLIENTE:
				cliente = FormularioDeDatos.modificarDatosCliente(cliente, scan);
				gestor.modificarCliente(cliente, null);
				System.out.println("Cliente modificado");
			
			
			
			}
			
		}while(opcion!=Menu.SALIR);
	}

}

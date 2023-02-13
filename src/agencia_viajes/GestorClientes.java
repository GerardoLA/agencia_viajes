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
				String dniCliente= FormularioDeDatos.pedirDniCliente(scan);
				cliente = FormularioDeDatos.modificarDatosCliente(cliente, scan);
				gestor.modificarCliente(cliente, dniCliente);
				System.out.println("Cliente modificado");
				break;
				
			case Menu.BAJA_CLIENTE:

				 gestor.eliminarCliente(FormularioDeDatos.pedirDniCliente(scan));
				 System.out.println("Cliente elmininado");
				break;

			

				
			case Menu.VER_CLIENTE:
				dniCliente = FormularioDeDatos.pedirDniCliente(scan);
				gestor.getCliente(dniCliente);
				Visor.mostrarCliente(cliente);
				 break;
				
				
				
			case Menu.SALIR:
				break;
			
			}
			
		}while(opcion!=Menu.SALIR);
	}

}

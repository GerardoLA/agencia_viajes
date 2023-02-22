package agencia_viajes;

import java.sql.SQLException;
import java.util.ArrayList;
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
				dniCliente= FormularioDeDatos.pedirDniCliente(scan);
				gestor.eliminarCliente(dniCliente);
				System.out.println("Fulminado");
				break;
				
			case Menu.VER_CLIENTE:
				 dniCliente=FormularioDeDatos.pedirDniCliente(scan);
				 cliente=gestor.getCliente(dniCliente);
				Visor.mostrarCliente(cliente);
				break;
				
			case Menu.VER_CLIENTES:
				Visor.mostrarClientes(gestor.getClientes());
	
				break;
			case Menu.CLIENTES_ORDENADOS_NOMBRE:
				ordenarNombre(gestor.getClientes());
				break;
				
			case Menu.CLIENTES_ORDENADOS_APELLIDOS:
				ordenarApellidos(gestor.getClientes());
				break;
				
			case  Menu.BUSCAR_CADENA_EN_CLIENTE:
				String cadena = FormularioDeDatos.pedirCadenaCliente(scan);
				Visor.mostrarClientes(gestor.buscarCadena(cadena));
				break;
				
			}
			
			
			
		}while(opcion!=Menu.SALIR);
	}
	private static void ordenarNombre(ArrayList<Cliente> nombres) {
		OdenacionPorNombre ordena=new OdenacionPorNombre();
		nombres.sort(ordena);
		Visor.mostrarClientes(nombres);
	}
	private static void ordenarApellidos(ArrayList<Cliente> apellidos) {
		OrdenacionClientePorApellido ordena=new OrdenacionClientePorApellido();
		apellidos.sort(ordena);
		Visor.mostrarClientes(apellidos);
		}
}

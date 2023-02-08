package agencia_viajes;

import java.util.Scanner;

public class GestorClientes {
	public static void run (Scanner scan) {
	
		int opcion;
		Cliente cliente = new Cliente();
		GestorBBDD gestor = new GestorBBDD();
		
		do {
			Menu.mostrarMenuCliente();
			opcion = Integer.parseInt(scan.nextLine());
			
			
			switch(opcion) {
			case Menu.ALTA_CLIENTE:
				
				break;
			}
			
		}while(opcion!=Menu.SALIR);
	}

}

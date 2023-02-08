package agencia_viajes;

import java.sql.SQLException;
import java.util.Scanner;

public class GestorAgencia {
	
	public static void run(Scanner scan) throws SQLException {
		int opcion_menu;
		
		do {
			Menu.mostrarMenuPrincipal();
			opcion_menu = Integer.parseInt(scan.nextLine());
			switch(opcion_menu) {
			
			case Menu.GESTIONAR_CLIENTES:
				GestorClientes.run(scan);
				
				break;
				
//			case Menu.GESTIONAR_RESERVAS:
//				break;
//				
//			case Menu.GESTIONAR_HOTELES:
//				break;
//				
//			case Menu.GESTIONAR_RESERVAS:
//				break;
			case Menu.SALIR:
				System.out.println("Agur benhur");
				break;
			default:
				System.out.println("Opción incorrecta");
				
			}
		}while (opcion_menu !=0);
	}

}

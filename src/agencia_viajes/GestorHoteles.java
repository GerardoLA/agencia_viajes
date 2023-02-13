package agencia_viajes;

import java.sql.SQLException;
import java.util.Scanner;

public class GestorHoteles {
	
	public static void run (Scanner scan) throws SQLException {
		int opcion;
		Hotel hotel = new Hotel();
		GestorBBDD gestor = new GestorBBDD();
		
		do {
			 Menu.mostrarMenuHoteles();
			 opcion = Integer.parseInt(scan.nextLine());
			 switch(opcion) {
			 case Menu.ALTA_HOTEL:
				 hotel =FormularioDeDatos.pedirDatosHotel(scan);
				 gestor.darAltaHotel(hotel);
				 System.out.println("Hotel dado de alta");
				 break;
				 
			 }
			
			
			
			
		}while(opcion !=Menu.SALIR);
		
	}

}

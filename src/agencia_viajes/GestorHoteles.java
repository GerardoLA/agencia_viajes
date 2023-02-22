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
				 
			 case Menu.BAJA_HOTEL:
				 System.out.println("in progress...");
				 break;
				 
			 case Menu.VER_HOTEL:
				 
				 String nombreHotel=FormularioDeDatos.pedirNombreHotel(scan);
				 hotel=gestor.getHotel(nombreHotel);
				 Visor.mostrarHotel(hotel);
				 
				 System.out.println("Sus habitaciones son:");
				 int id_hotel=Integer.parseInt(scan.nextLine());
				 Visor.mostrarHabitaciones(gestor.getHabitacionesPorHotel(id_hotel));
				 
				 
				 
				 break;
				 
			 }
			
			
			
			
		}while(opcion !=Menu.SALIR);
		
	}

}

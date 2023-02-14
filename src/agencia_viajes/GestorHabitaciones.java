package agencia_viajes;

import java.sql.SQLException;
import java.util.Scanner;

public class GestorHabitaciones {
	public static void run(Scanner scan) throws SQLException {
		
	
	
	int opcion;
	Habitacion habitacion=new Habitacion();
	GestorBBDD gestor = new GestorBBDD();
	
	do {
		Menu.mostrarMenuHabitaciones();
		opcion = Integer.parseInt(scan.nextLine());
		switch(opcion) {
		
		case Menu.ANADIR_HABITACION:
			habitacion=FormularioDeDatos.pedirDatosHabitacion(scan);
			gestor.añadirHabitacion(habitacion);
			System.out.println("Habitacion añadida");
			
		
		
		}
		
	}while(opcion !=Menu.SALIR);
	

}
}

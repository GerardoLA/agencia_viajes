package agencia_viajes;

import java.sql.SQLException;
import java.text.ParseException;
import java.util.Scanner;

public class GestorReservas {
	public static void run (Scanner scan) throws ParseException, SQLException {
		
		int opcion;
		Reserva reserva=new Reserva();
		GestorBBDD gestor = new GestorBBDD();
		
		do {
			Menu.mostrarMenuReservas();
			opcion = Integer.parseInt(scan.nextLine());
			switch(opcion)
			{
			case Menu.REALIZAR_RESERVA:
				reserva = FormularioDeDatos.pedirDatosReserva(scan);
				gestor.realizarReserva(reserva);
				System.out.println("Reserva realizada con exito!");
				
			}
		
		
	}while (opcion!=Menu.SALIR);
}

}

package agencia_viajes;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class FormularioDeDatos {
	
	public static String  pedirCadenaCliente(Scanner scan) {
		System.out.println("introduce la cadena: ");
		String cadena = scan.nextLine();
		
		return cadena;
	}
	
	public static Reserva pedirDatosReserva(Scanner scan) throws ParseException {
		Reserva reserva=new Reserva();
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("introduse la id de la habitacion: ");
		reserva.setId_habitacion(Integer.parseInt(scan.nextLine()));
		
		System.out.println("Introduce el dni: ");
		reserva.setDni(scan.nextLine());
		
		System.out.println("introduce la fecha de entrada, formato(dd/mm/yyyy)");
		reserva.setDesde(format.parse(scan.nextLine()));
		
		System.out.println("introduce fecha de salida, formato (dd/mm/yyyy)");
		reserva.setHasta(format.parse(scan.nextLine()));
		
		return reserva;
	}
	
	public static Habitacion pedirDatosHabitacion(Scanner scan) {
		Habitacion habitacion=new Habitacion();
		
		System.out.println("introduce id : ");
		habitacion.setId(Integer.parseInt(scan.nextLine()));
		
		System.out.println("Introduce la id de hotel: ");
		habitacion.setId_hotel(Integer.parseInt(scan.nextLine()));
		
		System.out.println("introduce el numero de habitacion: ");
		habitacion.setNumero(scan.nextLine());
		
		System.out.println("Introduce la descripcion: ");
		habitacion.setDescripcion(scan.nextLine());
		
		System.out.println("Introduce el precio por noche: ");
		habitacion.setPrecio(Double.parseDouble(scan.nextLine()));
		
	return habitacion;
	
	}
	
	public static Hotel pedirDatosHotel(Scanner scan) {
		Hotel hotel =new Hotel();
		
		System.out.println("Introduce el cif: ");
		hotel.setCif(scan.nextLine());
		
		System.out.println("Introduce el nonmbre del hotel: ");
		hotel.setNombre(scan.nextLine());
		
		System.out.println("Introduce el nombre del gerente");
		hotel.setGerente(scan.nextLine());
		
		System.out.println("Introoduce el numero de estrellas :");
		hotel.setEstrellas(Integer.parseInt(scan.nextLine()));
		
		System.out.println("Introduce el nombre de la compañia: ");
		hotel.setCompania(scan.nextLine());
		
		
		
		return hotel;
	}
	
	public static Cliente pedirDatosCliente(Scanner scan) {
	Cliente cliente = new Cliente();
	
	System.out.println("Introduce el dni del cliente: ");
	cliente.setDni(scan.nextLine());
	
	System.out.println("Introduce el nombre del cliente");
	cliente.setNombre(scan.nextLine());
	
	System.out.println("Introduce los apellidos del cliente: ");
	cliente.setApellidos(scan.nextLine());
	
	System.out.println("Introduce la dirección del cliente: ");
	cliente.setDireccion(scan.nextLine());
	
	System.out.println("Introduce la localidad del cliente");
	cliente.setLocalidad(scan.nextLine());
	
	
	return cliente;
	}
	
	public static Cliente modificarDatosCliente(Cliente cliente,Scanner scan) {
		
		
		System.out.println("Introduce el  nuevo nombre: ");
		cliente.setNombre(scan.nextLine());
		
		System.out.println("Introduce los apellidos nuevos: ");
		cliente.setApellidos(scan.nextLine());
		
		System.out.println("Introduce la nueva direccion: ");
		cliente.setDireccion(scan.nextLine());
		
		System.out.println("Introduce la nueva localiad: ");
		cliente.setLocalidad(scan.nextLine());
		
		return cliente;
	}
	
	public static String pedirDniCliente(Scanner scan) {
		System.out.println("Dni del cliente :");
		String dni = scan.nextLine();
	
		return dni;
	}

}

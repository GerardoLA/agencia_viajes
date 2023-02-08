package agencia_viajes;

import java.util.Scanner;

public class FormularioDeDatos {
	
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

}

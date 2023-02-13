package agencia_viajes;

public class Menu {
	
	public static final int GESTIONAR_CLIENTES = 1;
	public static final int GESTIONAR_HABITACIONES = 2;
	public static final int GESTIONAR_HOTELES =3;
	public static final int GESTIONAR_RESERVAS = 4;
	
	public static final int SALIR = 0;
	
	public static final int ALTA_CLIENTE=1;
	public static final int BAJA_CLIENTE = 2;
	public static final int MODIFICAR_CLIENTE = 3;
	public static final int VER_CLIENTE = 4;
	
	public static final int REALIZAR_RESERVA=1;
	public static final int ANULAR_RESERVA=1;
	

	
	public static void mostrarMenuPrincipal() {
		System.out.println("MENU PRINCIPAL");
		System.out.println("1.- Gestionar Clientes");
		System.out.println("2.- Gestionar habitaciones");
		System.out.println("3.- Gestionar Hoteles");
		System.out.println("4.- Gestionar Reservas");
		System.out.println("0.- Salir ");
		
	}
	
	public static void mostrarMenuCliente() {
		System.out.println("MENU CLIENTES");
		System.out.println("1.- Insertar clientes");
		System.out.println("2.- Eliminar clientes");
		System.out.println("3.- Modificar Clientes");
		System.out.println("4.- Ver Clientes");
		System.out.println("0.- Salir ");
	}
	
	public static void mostrarMenuReservas() {
		System.out.println("MENU RESERVAS");
		System.out.println("1.- Realizar reserva: ");
		System.out.println("2.- Eliminar reserva: ");
		System.out.println("0.- SALIR ");
	
	}







}




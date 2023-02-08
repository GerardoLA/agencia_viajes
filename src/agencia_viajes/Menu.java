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
	

	
	public static void mostrarMenuPrincipal() {
		System.out.println("Menu Principal");
		System.out.println("1.- Gestionar Clientes");
		System.out.println("2.- Gestionar habitaciones");
		System.out.println("3.- Gestionar Hoteles");
		System.out.println("4.- Gestionar Reservas");
		
	}
	
	public static void mostrarMenuCliente() {
		System.out.println("Menu Clientes");
		System.out.println("1.- Insertar clientes");
		System.out.println("2.- Eliminar clientes");
		System.out.println("3.- Modificar Clientes");
		System.out.println("4.- Ver Clientes");
	}







}




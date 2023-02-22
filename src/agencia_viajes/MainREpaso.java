package agencia_viajes;

import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class MainREpaso {

	public static void main(String[] args) throws SQLException {
	Scanner scan=new Scanner(System.in);
	
//	1er ejercicio
//	System.out.println("Introduce el nombre del hotel del que quieres saber la id :");
//	String nombre=scan.nextLine();
//	
//	GestorBBDD gestor= new GestorBBDD();
//	gestor.saberIdHotel(nombre);
	
	System.out.println("introduce una fecha a buscar en formato DD/MM/YYYY: ");
	SimpleDateFormat formato=new SimpleDateFormat();
	 
	GestorBBDD gestor=new GestorBBDD();
	gestor.getReservas();
	
	
	
	
	
	
	
	
	}
}

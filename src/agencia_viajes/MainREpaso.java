package agencia_viajes;

import java.sql.SQLException;
import java.util.Scanner;

public class MainREpaso {

	public static void main(String[] args) throws SQLException {
	Scanner scan=new Scanner(System.in);
	
	System.out.println("Introduce el nombre del hotel del que quieres saber la id :");
	String nombre=scan.nextLine();
	
	GestorBBDD gestor= new GestorBBDD();
	gestor.saberIdHotel(nombre);
	
	
	
	
	
	
	
	}
}

package agencia_viajes;

import java.sql.SQLException;
import java.text.ParseException;
import java.util.Scanner;

public class AgenciaApp {
	
	public static void main (String[]args) throws SQLException, ParseException {
		Scanner scan =new Scanner(System.in);
		GestorAgencia.run(scan);
	
	
		
	}

}

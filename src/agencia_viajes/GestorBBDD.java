package agencia_viajes;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class GestorBBDD extends Conector{
	PreparedStatement pst;
	
	public void insertarCliente(Cliente cliente) throws SQLException {
		super.conectar();
		pst=con.prepareStatement("INSERT INTO clientes VALUES (?,?,?,?)");
		pst.setString(1, cliente.getDni());
		pst.setString(2, cliente.getNombre());
		pst.setString(3, cliente.getApellidos());
		pst.setString(4, cliente.getDireccion());
		pst.setString(5, cliente.getLocalidad());
		
		pst.execute();
		super.cerrar();
	}

}

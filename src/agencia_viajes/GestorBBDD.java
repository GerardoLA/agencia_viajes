package agencia_viajes;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class GestorBBDD extends Conector{
	PreparedStatement pst;
	
	public void insertarCliente(Cliente cliente) throws SQLException {
		super.conectar();
		pst=con.prepareStatement("INSERT INTO clientes VALUES (?,?,?,?,?)");
		pst.setString(1, cliente.getDni());
		pst.setString(2, cliente.getNombre());
		pst.setString(3, cliente.getApellidos());
		pst.setString(4, cliente.getDireccion());
		pst.setString(5, cliente.getLocalidad());
		
		pst.execute();
		super.cerrar();
	}
	
	public void modificarCliente(Cliente cliente,String dni) throws SQLException {
		super.conectar();
		pst=con.prepareStatement("UPDATE clientes set nombre=?,apellidos=?,direccion=?,localidad=? where dni=?");
		
		pst.setString(1, cliente.getNombre());
		pst.setString(2, cliente.getApellidos());
		pst.setString(3, cliente.getDireccion());
		pst.setString(4, cliente.getLocalidad());
		pst.setString(5, dni);
		
		pst.executeUpdate();
		super.cerrar();
		
		
	}
	
	public void eliminarCliente(String dni) throws SQLException {
		super.conectar();
		pst=con.prepareStatement("DELETE from clientes where dni = ?");
		pst.setString(1,dni);
		pst.execute();
		System.out.println("Cliente eliminado");
		
		super.cerrar();
	
	}
	
	public Cliente getCliente (String dni) throws SQLException {
		super.conectar();
		String sentenciaSelect = "SELECT * from clientes WHERE dni =?";
		pst =con.prepareStatement(sentenciaSelect);
		pst.setString(1, dni);
		Cliente cliente = new Cliente();
		ResultSet resultado = pst.executeQuery(sentenciaSelect);
		cliente.setNombre(resultado.getString("nombre"));
		cliente.setApellidos(resultado.getString("apellidos"));
		cliente.setDireccion(resultado.getString("direccion"));
		cliente.setLocalidad(resultado.getString("localidad"));
		super.cerrar();
		return cliente;
		
	}

}

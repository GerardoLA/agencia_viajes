package agencia_viajes;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

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
		
		
		super.cerrar();
	
	}
	


	public Cliente getCliente (String dni) throws SQLException {
		super.conectar();
		String sentenciaSelect = "SELECT * FROM clientes WHERE dni=?";
		Cliente cliente = new Cliente();
		
		pst=con.prepareStatement(sentenciaSelect);
		pst.setString(1,dni);
		
		ResultSet resultado = pst.executeQuery();
		resultado.next();
		
		
		cliente.setDni(resultado.getString("dni"));
		cliente.setNombre(resultado.getString("nombre"));
		cliente.setApellidos(resultado.getString("apellidos"));
		cliente.setDireccion(resultado.getString("direccion"));
		cliente.setLocalidad(resultado.getString("localidad"));
		super.cerrar();
		return cliente;
		
	}
	public ArrayList<Cliente>getClientes() throws SQLException{
		ArrayList<Cliente>clientes=new ArrayList<Cliente>();
		super.conectar();
		String sentenciaSelect ="SELECT * from Clientes";
		pst = con.prepareStatement(sentenciaSelect);
		ResultSet resultado = pst.executeQuery();
		
		while (resultado.next()) {
			Cliente cliente = new Cliente();
			cliente.setDni(resultado.getString("dni"));
			cliente.setNombre(resultado.getString("nombre"));
			cliente.setApellidos(resultado.getString("Apellidos"));
			cliente.setDireccion(resultado.getString("direccion"));
			cliente.setLocalidad(resultado.getString("localidad"));
			clientes.add(cliente);
		}
		super.cerrar();
		return clientes;

		
	}

}

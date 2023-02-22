package agencia_viajes;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class GestorBBDD extends Conector{
	PreparedStatement pst;
	
	public void realizarReserva(Reserva reserva) throws SQLException {
		super.conectar();
		pst=con.prepareStatement("INSERT INTO reservas(id,id_habitacion,dni,desde,hasta)VALUES(?,?,?,?,?)");
		pst.setInt(1, reserva.getId());
		pst.setInt(2, reserva.getId_habitacion());
		pst.setString(3, reserva.getDni());
		pst.setDate(4, new Date(reserva.getDesde().getTime()));
		pst.setDate(5, new Date(reserva.getHasta().getTime()));
		pst.execute();
		super.cerrar();
	}
	
	public void añadirHabitacion(Habitacion habitacion) throws SQLException {
		super.conectar();
		pst=con.prepareStatement("INSERT INTO habitaciones(id_hotel,numero,descripcion,precio)VALUES(?,?,?,?)");
		
		pst.setInt(1, habitacion.getId_hotel());
		pst.setString(2, habitacion.getNumero());
		pst.setString(3, habitacion.getDescripcion());
		pst.setDouble(4, habitacion.getPrecio());		
		pst.execute();
		super.cerrar();
	}
	
	public void darAltaHotel(Hotel hotel) throws SQLException {
		super.conectar();
		pst=con.prepareStatement("INSERT INTO hoteles(cif,nombre,gerente,estrellas,compania)VALUES (?,?,?,?,?)");
		pst.setString(1, hotel.getCif());
		pst.setString(2,hotel.getNombre());
		pst.setString(3, hotel.getGerente());
		pst.setInt(4, hotel.getEstrellas());
		pst.setString(5, hotel.getCompania());
		
		pst.execute();
		super.cerrar();
		
		
	}
	
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
		pst=con.prepareStatement("DELETE from clientes where dni=?");
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
	
	public Hotel saberIdHotel(String nombre) throws SQLException {
		super.conectar();
		Hotel hotel=new Hotel();
		String sentenciaSelect="SELECT id from hoteles where nombre=?";
		
		pst=con.prepareStatement(sentenciaSelect);
		pst.setString(1, nombre);
		
		ResultSet resultado=pst.executeQuery();
		resultado.next();
		
		hotel.setId(resultado.getInt("id"));
		super.cerrar();
		System.out.println("La id del hotel"+ nombre+ " es : " + hotel.getId());
		return hotel;
		
	}
	
	
	
	
//	public ArrayList<Hotel>buscarIdHotel() throws SQLException{
//		ArrayList<Hotel>buscaId=new ArrayList<Hotel>();
//		super.conectar();
//		String sentenciaSelect = "SELECT id from hoteles where nombre=? ";
//		pst=con.prepareStatement(sentenciaSelect);
//		pst.setInt(1,String nombre);
//		
//		ResultSet resultado= pst.executeQuery();
//		
//		while(resultado.next()) {
//			Hotel hotel =new Hotel();
//			hotel.setId(resultado.getInt("id"));
//		}
//		return buscaId;	
//		
//	}
}

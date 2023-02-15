package agencia_viajes;

import java.util.Comparator;

public class OrdenacionClientePorApellido implements Comparator<Cliente>{

	@Override
	public int compare(Cliente o1, Cliente o2) {
		int num=o1.getApellidos().toUpperCase().compareTo(o2.getApellidos().toUpperCase());
		return num;
	}



}

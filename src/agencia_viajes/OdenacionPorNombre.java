package agencia_viajes;

import java.util.Comparator;

public class OdenacionPorNombre implements Comparator<Cliente> {

	@Override
	public int compare(Cliente o1, Cliente o2) {
		int num= o1.getNombre().toUpperCase().compareTo(o2.getNombre().toUpperCase());
		return num;
	}

}

package pe.edu.tecsup.app.util;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class Fecha {

	public static String obtenerFechaActual() {
		
		Calendar calendar = Calendar.getInstance();
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY hh:mm:ss", new Locale("es", "PE"));
	
		String fecha=sdf.format(calendar.getTime());

		return fecha;
	}
	
}

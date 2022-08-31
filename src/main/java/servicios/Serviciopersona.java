package servicios;

import java.util.HashMap;
import java.util.Map;

import modelos.Persona;

public class Serviciopersona {
	
	private Map<String, String> personasDB = new HashMap<>();
	
	public String crearPersona (Persona personas) {
			if(personas !=null) {
			personasDB.put(personas.getRut(), personas.getNombre());
			return "Creada";
		}else {
			return "No creada";
		}
	}
	
	public String actualizarPersona(Persona personas) {
		if(personas !=null) {
			personasDB.put(personas.getRut(), personas.getNombre());
			return "Actualizada";
		}else {
			return "No actualizada";
		}
	}
	
	public Map<String, String> listarPersonas() {
		return personasDB;
	}
	
	public String eliminarPersona(Persona personas) {
		if(personas !=null) {
			personasDB.remove(personas.getRut());
			return "Eliminada";
		}else {
			return "No eliminada";
		}
	}

}

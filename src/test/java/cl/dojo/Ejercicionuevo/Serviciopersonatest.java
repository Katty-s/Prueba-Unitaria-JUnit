package cl.dojo.Ejercicionuevo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.Map;
import java.util.logging.Logger;

import org.junit.jupiter.api.*;

import modelos.Persona;
import servicios.Serviciopersona;

	@DisplayName("Test clase Serviciopersona")
	public class Serviciopersonatest {
		
		 private static Logger logger = Logger.getLogger("servicios.Serviciopersona");
		 
		 private final Serviciopersona serviciopersona = new Serviciopersona();
		 
		 @Test
		 public void testCrearPersona() {
			 logger.info("info test crear persona");
			 Persona personanueva = new Persona("16.524.814-7", "Antonio");
			 String respuestaServicio = serviciopersona.crearPersona(personanueva);
			 assertEquals("Creada", respuestaServicio);
			 
		 }
		 
		 @Test
		 public void testActualizarPersona() {
			 logger.info("info Actualizar Persona");
			 Persona actualizarpersona = new Persona("16.524.814-7", "Camilo");
			 String respuestaServicio = serviciopersona.actualizarPersona(actualizarpersona);
			 assertEquals("Actualizada", respuestaServicio);
		 }
		 
		 @BeforeAll
		 static void setup() {
			 logger.info("Inicio clase de prueba");
		 }
		 
		 @BeforeEach
		 void init() {
			 logger.info("Inicio metodo de prueba");
		 }
		 
		 @AfterEach
		 public void tearDown() {
			 logger.info("Metodo de prueba finalizado");
		 }
		 
		 @AfterAll
		 public static void done() {
			 logger.info("Fin clase de prueba");
		 }
		 
		 @Test
		 public void testListarPersona() {
			 logger.info("info listar persona");
			 Map<String, String> listaPersona = serviciopersona.listarPersonas();
			 assertNotNull(listaPersona);
		 }
	}


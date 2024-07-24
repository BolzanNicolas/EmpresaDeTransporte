package ar.com.unlam.pb2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestEmpresaTransporte {
	
	EmpresaTransporte pokiu = new EmpresaTransporte("Pokiu");
	
	@Before
	public void setup() {
		pokiu = new EmpresaTransporte("Pokiu");
	}

	@Test
	public void queSePuedaCrearUnChofer() {
		Chofer chofer1 = new Chofer("Nico", 3425);
		
		assertTrue(pokiu.crearChofer(chofer1));
	}

	@Test
	public void queSePuedaCrearUnVehiculo() {
		Chofer chofer1 = new Chofer("Nico", 3425);
		Vehiculo autobus1 = new Vehiculo(123, chofer1, null);
		
		pokiu.crearChofer(chofer1);
		assertTrue(pokiu.crearVehiculo(autobus1));
	}
	
	@Test
	public void queSePuedaAsignarChoferAVehiculo() {
		Chofer chofer1 = new Chofer("Nico", 3425);
		Vehiculo autobus1 = new Vehiculo(123, chofer1, null);
		
		pokiu.crearChofer(chofer1);
		pokiu.crearVehiculo(autobus1);
		assertThrows(NoSeRealizoOperacionException.class, () -> { pokiu.asignarChofer(123, 3425); });
	}
	
}

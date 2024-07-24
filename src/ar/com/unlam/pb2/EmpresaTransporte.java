package ar.com.unlam.pb2;

import java.util.HashSet;

public class EmpresaTransporte {

	private String nombre;
	private HashSet<Vehiculo> vehiculos;
	private HashSet<Chofer>choferes;
	
	
	public EmpresaTransporte(String nombre) {
		this.nombre = nombre;
		this.vehiculos = new HashSet<Vehiculo>();
		this.choferes = new HashSet<Chofer>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public HashSet<Vehiculo> getVehiculos() {
		return vehiculos;
	}

	public void setVehiculos(HashSet<Vehiculo> vehiculos) {
		this.vehiculos = vehiculos;
	}

	public HashSet<Chofer> getChoferes() {
		return choferes;
	}

	public void setChoferes(HashSet<Chofer> choferes) {
		this.choferes = choferes;
	}
	
	public Boolean crearVehiculo(Vehiculo vehiculo) {
		return this.vehiculos.add(vehiculo);
	}
	
	public Boolean crearChofer(Chofer chofer) {
		return this.choferes.add(chofer);
	}
	
	public Boolean asignarChofer(Integer patenteVehiculo, Integer dniChofer) {
		
		for(Vehiculo vehiculo : vehiculos) {
			if(vehiculo.getPatente().equals(patenteVehiculo) && vehiculo.getChofer() == null) {
				for(Chofer chofer : choferes) {
					if(chofer.getDni().equals(dniChofer)) {
						vehiculo.setChofer(chofer);
						return true;
					}
				}
			}
		}
		throw new NoSeRealizoOperacionException();		
	}
	
	public Boolean cambiarChofer(Integer patenteVehiculo, Integer dniChoferACambiar) {
		
		for(Vehiculo vehiculo : vehiculos) {
			if(vehiculo.getPatente().equals(patenteVehiculo)) {			
				for(Chofer chofer : choferes) {
					if(chofer.getDni().equals(dniChoferACambiar)) {
						return vehiculo.setChofer(chofer);						
					}
				}
			}
		}
		throw new NoSeRealizoOperacionException();		
	}
	
	
}

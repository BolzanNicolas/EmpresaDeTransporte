package ar.com.unlam.pb2;

import java.util.ArrayList;
import java.util.Objects;

public class Vehiculo  {

	private Integer patente;
	private Chofer chofer;
	private Integer kmRecorridos;
	private ArrayList<Pasajero> pasajeros;
	
	public Vehiculo(Integer patente, Chofer chofer, Integer kmRecorridos) {
		this.patente = patente;
		this.chofer = chofer;
		this.kmRecorridos = 0;
		this.pasajeros = new ArrayList<Pasajero>();
	}

	public Integer getPatente() {
		return patente;
	}

	public void setPatente(Integer patente) {
		this.patente = patente;
	}

	public Chofer getChofer() {
		return chofer;
	}

	public Boolean setChofer(Chofer chofer) {
		this.chofer = chofer;
		return true;
	}

	public Integer getKmRecorridos() {
		return kmRecorridos;
	}

	public void setKmRecorridos(Integer kmRecorridos) {
		this.kmRecorridos = kmRecorridos;
	}

	public ArrayList<Pasajero> getPasajeros() {
		return pasajeros;
	}

	public void setPasajeros(ArrayList<Pasajero> pasajeros) {
		this.pasajeros = pasajeros;
	}

	@Override
	public int hashCode() {
		return Objects.hash(patente);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vehiculo other = (Vehiculo) obj;
		return Objects.equals(patente, other.patente);
	}
	
}

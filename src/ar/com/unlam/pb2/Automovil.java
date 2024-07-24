package ar.com.unlam.pb2;

public class Automovil extends Vehiculo{

	private Integer limitePasajeros;

	public Automovil(Integer patente, Chofer chofer, Integer kmRecorridos) {
		super(patente, chofer, kmRecorridos);
		this.limitePasajeros = 3;
	}

	public Integer getLimitePasajeros() {
		return limitePasajeros;
	}

	public void setLimitePasajeros(Integer limitePasajeros) {
		this.limitePasajeros = limitePasajeros;
	}
	
	
}

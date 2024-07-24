package ar.com.unlam.pb2;

public class Autobus extends Vehiculo{

	private Integer limitepasajeros;

	public Autobus(Integer patente, Chofer chofer, Integer kmRecorridos) {
		super(patente, chofer, kmRecorridos);
		this.limitepasajeros = 20;
	}

	public Integer getLimitepasajeros() {
		return limitepasajeros;
	}

	public void setLimitepasajeros(Integer limitepasajeros) {
		this.limitepasajeros = limitepasajeros;
	}
	
	@Override
	public Boolean setChofer(Chofer chofer) {
		if(this.getPasajeros().size() == 0 ) {
			return super.setChofer(chofer);
		} else {
			return false;
		}
	}
	
}

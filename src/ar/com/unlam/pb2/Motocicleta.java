package ar.com.unlam.pb2;

public class Motocicleta extends Vehiculo{

	private Boolean acompaniante;

	public Motocicleta(Integer patente, Chofer chofer, Integer kmRecorridos) {
		super(patente, chofer, kmRecorridos);
		this.acompaniante = false;
	}

	public Boolean getAcompaniante() {
		return acompaniante;
	}

	public void setAcompaniante(Boolean acompaniante) {
		this.acompaniante = acompaniante;
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

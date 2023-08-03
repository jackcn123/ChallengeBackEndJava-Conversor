
public class Moneda {
	private String tipo;
	private double tcambioSoles;

	public Moneda(String tipo, double tcambioSoles) {
		this.tipo = tipo;
		this.tcambioSoles = tcambioSoles;
	}

	public String getTipo() {
		return tipo;
	}

	public double getTcambioSoles() {
		return tcambioSoles;
	}

	public String toString() {
		return tipo;
	}

}

public class ConversionTemperatura {

	private String tipoConversion;
	private String simboloInicial;
	private String simboloFinal;

	public ConversionTemperatura(String tipoConversion,String simboloInicial, String simboloFinal) {
		this.tipoConversion = tipoConversion;
		this.simboloInicial = simboloInicial;
		this.simboloFinal = simboloFinal;

	}

	public String getTipoConversion() {
		return tipoConversion;
	}

	public String getSimboloInicial() {
		return simboloInicial;
	}

	public String getSimboloFinal() {
		return simboloFinal;
	}

	public String toString() {
		return tipoConversion;
	}

}

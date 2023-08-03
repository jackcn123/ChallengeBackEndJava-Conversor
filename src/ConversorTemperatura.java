import javax.swing.JOptionPane;

public class ConversorTemperatura {

	public void ConvertirTemperatura(double temperatura) {
		ConversionTemperatura conversion[] = new ConversionTemperatura[6];
		conversion[0] = new ConversionTemperatura("Grados Celsius a Grados Fahrenheit","°C", "°F");
		conversion[1] = new ConversionTemperatura("Grados Celsius a Kelvin","°C", "K");
		conversion[2] = new ConversionTemperatura("Grados Fahrenheit a Grados Celsius","°F", "°C");
		conversion[3] = new ConversionTemperatura("Grados Fahrenheit a Kelvin","°F", "K");
		conversion[4] = new ConversionTemperatura("Kelvin a Grados Celsius","K", "°C");
		conversion[5] = new ConversionTemperatura("Kelvin a Grados Fahrenheit","K", "°F");

		Object input = JOptionPane.showInputDialog(null, "Elije una opción para convertir", "Temperatura",
				JOptionPane.PLAIN_MESSAGE, null, conversion, conversion[0]);
		if (input != null) {
			double resultado = 0.0;
			for (int i = 0; i < conversion.length; i++) {
				if (input.toString() == conversion[i].getTipoConversion()) {
					switch (i) {
					case 0: // °C a °F
						resultado = (1.8 * temperatura) + 32;
						break;
					case 1: // °C a K
						resultado = temperatura + 273.15;
						break;
					case 2: // °F a °C
						resultado = (temperatura - 32) / 1.8;
						break;
					case 3: // °F a K
						resultado = ((temperatura - 32) / 1.8) + 273.15;
						break;
					case 4: // K a °C
						resultado = temperatura - 273.15;
						break;
					case 5: // K a °F
						resultado = (1.8 * (temperatura - 273.15)) + 32;
						break;
					}
					resultado = (double) Math.round(resultado * 100d) / 100;
					JOptionPane.showMessageDialog(null, temperatura + " " + conversion[i].getSimboloInicial()
							+ "\nEquivalente a: " + resultado + " " + conversion[i].getSimboloFinal());
				}
			}
		}
	}
}

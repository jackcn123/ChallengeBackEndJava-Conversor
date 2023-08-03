import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		ConversorMoneda conversor = new ConversorMoneda();
		ConversorTemperatura conversorTemperatura = new ConversorTemperatura();
		boolean continuar = true;

		while (continuar) {
			Object possibleValues[] = { "Conversor Moneda", "Conversor Temperatura" };
			Object input = JOptionPane.showInputDialog(null, "Seleccione una opción de conversión", "MENU",
					JOptionPane.PLAIN_MESSAGE, null, possibleValues, possibleValues[0]);
				
			if (input != null) {
				switch (input.toString()) {
				case "Conversor Moneda":
					String entrada = JOptionPane.showInputDialog("Ingresa la cantidad de dinero que deseas convertir:");
					if (entrada == null) {
						break;
					}
					if (ValidarNumero(entrada) == true) {
						double cantidad = Double.parseDouble(entrada);
						try {
							conversor.ConvertirMonedas(cantidad);
						} catch (NullPointerException ex) {
							break;
						}
						continuar = DeseaContinuar();
					} else {
						JOptionPane.showMessageDialog(null, "Valor inválido");
					}
					break;

				case "Conversor Temperatura":
					String entrada2 = JOptionPane.showInputDialog("Ingresa la temperatura que deseas convertir:");
					if (entrada2 == null) {
						break;
					}
					if (ValidarNumero(entrada2) == true) {
						double cantidad = Double.parseDouble(entrada2);
						conversorTemperatura.ConvertirTemperatura(cantidad);
						continuar=DeseaContinuar();
					} else {
						JOptionPane.showMessageDialog(null, "Valor inválido");
					}
					break;
				}
			} else {
				continuar = false;
			}

		}
	}

	public static boolean ValidarNumero(String in) {
		try {
			Double.parseDouble(in);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}

	public static boolean DeseaContinuar() {
		int respuesta = JOptionPane.showConfirmDialog(null, "¿Deseas realizar otra conversión?");
		if (JOptionPane.OK_OPTION == respuesta) {
			return true;
		} else {
			JOptionPane.showMessageDialog(null, "Programa terminado");
			return false;
		}
	}
}

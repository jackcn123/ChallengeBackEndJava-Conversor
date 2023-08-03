import javax.swing.JOptionPane;

public class ConversorMoneda {
	public Moneda moneda[] = new Moneda[6];

	public void ConvertirMonedas(double Monto) {
		// Datos obtenidos al 01/08/23
		moneda[0] = new Moneda("Soles", 1.000000);
		moneda[1] = new Moneda("Dólares", 3.614);
		moneda[2] = new Moneda("Euros", 4.264);
		moneda[3] = new Moneda("Libras Esterlinas", 4.670);
		moneda[4] = new Moneda("Yenes", 0.02525);
		moneda[5] = new Moneda("Wons", 0.00279);

		String opcion1 = (JOptionPane.showInputDialog(null, "Elije la Moneda de Origen", "Monedas",
				JOptionPane.PLAIN_MESSAGE, null, moneda, moneda[0])).toString();

		String opcion2 = (JOptionPane.showInputDialog(null, "Elije la Moneda de Destino", "Monedas",
				JOptionPane.PLAIN_MESSAGE, null, moneda, moneda[0])).toString();

		double cambioDeMonedaASoles = 0.000;
		double cambioDeSolesAMoneda = 0.000;

		for (int i = 0; i < moneda.length; i++) {
			if (opcion1 == moneda[i].getTipo()) {
				cambioDeMonedaASoles = Monto * moneda[i].getTcambioSoles();
			}
		}

		for (int i = 0; i < moneda.length; i++) {
			if (opcion2 == moneda[i].getTipo()) {
				cambioDeSolesAMoneda = cambioDeMonedaASoles / moneda[i].getTcambioSoles();
			}
		}

		double resultado = (double) Math.round(cambioDeSolesAMoneda * 1000d) / 1000;
		JOptionPane.showMessageDialog(null, Monto + " " + opcion1 + "\nEquivalente a: " + resultado + " " + opcion2);
	}

}

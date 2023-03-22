import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class ProgramaMenu {

	private ProgramaMoneda m;
	private ProgramaTemperatura t;

	public ProgramaMenu() {
		this.m = new ProgramaMoneda();
		this.t = new ProgramaTemperatura();
	}
	
	DecimalFormat df = new DecimalFormat("0.00");
	
	public void menuSelecionConversor() throws Errores {

		boolean flagMenu = false;

		String[] menu = { 
				"Conversor de monedas", 
				"Conversor de temperaturas",
				};
		
		while (flagMenu == false) {
			String opcionMenu = (String) JOptionPane.showInputDialog(null, "Seleccioná el conversor que desees",
					"Conversores", JOptionPane.DEFAULT_OPTION, null, menu, menu[0]);		
	
			if (opcionMenu == null) {
				JOptionPane.showMessageDialog(null, "¡Gracias por elegirnos!");
				break;
			} else {
				switch (opcionMenu) {
					case "Conversor de monedas":
						menuConversorMoneda();
						break;
					case "Conversor de temperaturas":
						menuConversorTemperatura();
						break;
				}
			}
			
			int respuesta = JOptionPane.showConfirmDialog(null, "¿Querés continuar utilizando nuestro conversor?", 
					"Conversor", JOptionPane.YES_NO_OPTION);
			if (respuesta == 1 || respuesta == -1) {
				JOptionPane.showMessageDialog(null, "¡Gracias por elegirnos!");
				flagMenu = true;
			}
		} 
	}

	public void menuConversorMoneda() throws Errores {

		String[] conversoresDeMonedas = { 
				"De Peso AR a Dólar Oficial", 
				"De Peso AR a Euro", 
				"De Peso AR a Libras Esterlinas",
				"De Peso AR a Yen Japonés", 
				"De Peso AR a Won Surcoreano", 
				"De Dólar Oficial a Peso AR", 
				"De Euro a Peso AR",
				"De Libras Esterlinas a Peso AR", 
				"De Yen Japonés a Peso AR", 
				"De Won Surcoreano a Peso AR",
				}; 

		String respuestaConversorMoneda = (String) JOptionPane.showInputDialog(null,
				"Seleccioná el conversor de monedas que desees", "Conversores de Monedas", JOptionPane.DEFAULT_OPTION, null,
				conversoresDeMonedas, conversoresDeMonedas[0]);

		if (respuestaConversorMoneda == null) {
			menuSelecionConversor();
		}
		
		switch (respuestaConversorMoneda) {
			case "De Peso AR a Dólar Oficial":
				double montoPesoDolar = ingresoDeDato();
				JOptionPane.showMessageDialog(null,
					"$" + montoPesoDolar + " equivalen a US$" + df.format(m.dePesoADolar(montoPesoDolar)) + ".");
				break;
			case "De Peso AR a Euro":
				double montoPesoEuro = ingresoDeDato();
				JOptionPane.showMessageDialog(null,
					"$" + montoPesoEuro + " equivalen a €" + df.format(m.dePesoAEuro(montoPesoEuro)) + ".");
				break;
			case "De Peso AR a Libras Esterlinas":
				double montoPesoLibros = ingresoDeDato();
				JOptionPane.showMessageDialog(null,
					"$" + montoPesoLibros + " equivalen a £" + df.format(m.dePesoALibras(montoPesoLibros)) + ".");
				break;
			case "De Peso AR a Yen Japonés":
				double montoPesoYenes = ingresoDeDato();
				JOptionPane.showMessageDialog(null,
					"$" + montoPesoYenes + " equivalen a ¥" + df.format(m.dePesoAYen(montoPesoYenes)) + ".");
				break;
			case "De Peso AR a Won Surcoreano":
				double montoPesoWon = ingresoDeDato();
				JOptionPane.showMessageDialog(null,
					"$" + montoPesoWon + " equivalen a ₩" + df.format(m.dePesoAWon(montoPesoWon)) + ".");
				break;
			case "De Dólar Oficial a Peso AR":
				double montoDolarPeso = ingresoDeDato();
				JOptionPane.showMessageDialog(null,
					"US$" + montoDolarPeso + " equivalen a $" + df.format(m.deDolarAPeso(montoDolarPeso)) + ".");
				break;
			case "De Euro a Peso AR":
				double montoEuroPeso = ingresoDeDato();
				JOptionPane.showMessageDialog(null,
					"€" + montoEuroPeso + " equivalen a $" + df.format(m.deEuroAPeso(montoEuroPeso)) + ".");
				break;
			case "De Libras Esterlinas a Peso AR":
				double montoLibrasPeso = ingresoDeDato();
				JOptionPane.showMessageDialog(null,
					"£" + montoLibrasPeso + " equivalen a $" + df.format(m.deLibrasAPeso(montoLibrasPeso)) + ".");
				break;
			case "De Yen Japonés a Peso AR":
				double montoYenesPeso = ingresoDeDato();
				JOptionPane.showMessageDialog(null,
					"¥" + montoYenesPeso + " equivalen a $" + df.format(m.deYenAPeso(montoYenesPeso)) + ".");
				break;
			case "De Won Surcoreano a Peso AR":
				double montoWonPeso = ingresoDeDato();
				JOptionPane.showMessageDialog(null,
					"₩" + montoWonPeso + " equivalen a $" + df.format(m.deWonAPeso(montoWonPeso)) + ".");
				break;
		}
	}
	
	public void menuConversorTemperatura() throws Errores {
		
		String[] conversoresTemperatura = { 
				"De Celsius a Fahrenheit", 
				"De Celsius a Kelvin", 
				"De Fahrenheit a Celsius",
				"De Fahrenheit a Kelvin", 
				"De Kelvin a Celsius", 
				"De Kelvin a Fahrenheit" 
				};
		
		String respuestaConversorTemperatura = (String) JOptionPane.showInputDialog(null,
				"Seleccioná el conversor de temperaturas que desees", "Conversores de Temperaturas",
				JOptionPane.DEFAULT_OPTION, null, conversoresTemperatura, conversoresTemperatura[0]);

		if (respuestaConversorTemperatura == null) {
			menuSelecionConversor();
		}
		
		switch (respuestaConversorTemperatura) {
			case "De Celsius a Fahrenheit":
				double celsiusFahrenheit = ingresoDeDato();
				JOptionPane.showMessageDialog(null, celsiusFahrenheit + "°C equivalen a "
					+ df.format(t.deCelsiusAFahrenheit(celsiusFahrenheit)) + "°F.");			
				break;
			case "De Celsius a Kelvin":
				double celsiusKelvin = ingresoDeDato();
				JOptionPane.showMessageDialog(null, celsiusKelvin + "°C equivalen a "
					+ df.format(t.deCelsiusAKelvin(celsiusKelvin)) + "°K.");	
				break;
			case "De Fahrenheit a Celsius":
				double fahrenheitCelsius = ingresoDeDato();
				JOptionPane.showMessageDialog(null, fahrenheitCelsius + "°F equivalen a "
					+ df.format(t.deFahrenheitACelsius(fahrenheitCelsius)) + "°C.");	
				break;
			case "De Fahrenheit a Kelvin":
				double fahrenheitKelvin = ingresoDeDato();
				JOptionPane.showMessageDialog(null, fahrenheitKelvin + "°F equivalen a "
					+ df.format(t.deFahrenheitAKelvin(fahrenheitKelvin)) + "°K.");	
				break;
			case "De Kelvin a Celsius":
				double kelvinCelsius = ingresoDeDato();
				JOptionPane.showMessageDialog(null, kelvinCelsius + "°K equivalen a "
					+ df.format(t.deKelvinACelsius(kelvinCelsius)) + "°C.");	
				break;
			case "De Kelvin a Fahrenheit":
				double kelvinFahrenheit = ingresoDeDato();
				JOptionPane.showMessageDialog(null, kelvinFahrenheit + "°K equivalen a "
					+ df.format(t.deKelvinAFahrenheit(kelvinFahrenheit)) + "°F.");	
				break;
		}
	}
	
	public double ingresoDeDato() throws Errores {
		
		boolean flag = false;
		
		String cadena = "";
		
		while (flag == false) {
			
			cadena = (String) JOptionPane.showInputDialog(null, "Ingresá el valor que deseas convertir:");
			
			if (cadena == null || cadena.isEmpty()) {
				JOptionPane.showMessageDialog(null, "Debés ingresar un valor para continuar.");
			} else {
				flag = true;
			}
		}
		return convertirADouble(cadena);
	}
	
	public double convertirADouble(String numero) throws Errores {
		try {
			if (numero == null || numero.isEmpty()) {
				throw new Errores("Debés ingresar un valor para continuar.");
			}
			
			double decimal = Double.parseDouble(numero);

			return decimal;
		} catch (Exception e) {
			e.getStackTrace();
			return 0.0;
		}
	}
}
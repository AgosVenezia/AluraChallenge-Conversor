package Programa;

import javax.swing.JOptionPane;

import Monedas.Monedas;
import Excepciones.ErroresMoneda;

public class Moneda {

	private Monedas moneda;
	
	public Moneda() {
		this.moneda = new Monedas();
	}
	
	public double dePesoADolar(double peso) throws ErroresMoneda {
		validar(peso);
		try {
			return peso / moneda.getDolar();
		} catch (Exception e) {
			e.getStackTrace();
			return 0.0;
		}
	}
	
	public double dePesoAEuro(double peso) throws ErroresMoneda {
		validar(peso);
		try {
			return peso / moneda.getEuro();
		} catch (Exception e) {
			e.getStackTrace();
			return 0.0;
		}
	}
	
	public double dePesoALibras(double peso) throws ErroresMoneda {
		validar(peso);
		try {
			return peso / moneda.getLibras();
		} catch (Exception e) {
			e.getStackTrace();
			return 0.0;
		}
	}
	
	public double dePesoAYen(double peso) throws ErroresMoneda {
		validar(peso);
		try {
			return peso / moneda.getYen();
		} catch (Exception e) {
			e.getStackTrace();
			return 0.0;
		}
	}
	
	public double dePesoAWon(double peso) throws ErroresMoneda {
		validar(peso);
		try {
			return peso / moneda.getWon();
		} catch (Exception e) {
			e.getStackTrace();
			return 0.0;
		}
	}
	
	public double deDolarAPeso(double dolar) throws ErroresMoneda {
		validar(dolar);
		try {
			return dolar * moneda.getDolar();
		} catch (Exception e) {
			e.getStackTrace();
			return 0.0;
		}
	}
	
	public double deEuroAPeso(double euro) throws ErroresMoneda {
		validar(euro);
		try {
			return euro * moneda.getEuro();
		} catch (Exception e) {
			e.getStackTrace();
			return 0.0;
		}
	}
	
	public double deLibrasAPeso(double libras) throws ErroresMoneda {
		validar(libras);
		try {
			return libras * moneda.getLibras();
		} catch (Exception e) {
			e.getStackTrace();
			return 0.0;
		}
	}

	public double deYenAPeso(double yen) throws ErroresMoneda {
		validar(yen);
		try {
			return yen * moneda.getYen();
		} catch (Exception e) {
			e.getStackTrace();
			return 0.0;
		}
	}
	
	public double deWonAPeso(double won) throws ErroresMoneda {
		validar(won);
		try {
			return won * moneda.getWon();
		} catch (Exception e) {
			e.getStackTrace();
			return 0.0;
		}
	}

	private void validar(double moneda) throws ErroresMoneda {
		if (moneda <= 0) {
			JOptionPane.showMessageDialog(null, "Debés ingresar un valor mayor a 0.");
			//throw new ErroresMoneda("Debés ingresar un valor mayor a 0");
		}
	}

}
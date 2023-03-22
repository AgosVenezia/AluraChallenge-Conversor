import javax.swing.JOptionPane;

public class ProgramaMoneda {

	private Divisas moneda;
	
	public ProgramaMoneda() {
		this.moneda = new Divisas();
	}
	
	public double dePesoADolar(double peso) throws Errores {
		validar(peso);
		try {
			return peso / moneda.getDolar();
		} catch (Exception e) {
			e.getStackTrace();
			return 0.0;
		}
	}
	
	public double dePesoAEuro(double peso) throws Errores {
		validar(peso);
		try {
			return peso / moneda.getEuro();
		} catch (Exception e) {
			e.getStackTrace();
			return 0.0;
		}
	}
	
	public double dePesoALibras(double peso) throws Errores {
		validar(peso);
		try {
			return peso / moneda.getLibras();
		} catch (Exception e) {
			e.getStackTrace();
			return 0.0;
		}
	}
	
	public double dePesoAYen(double peso) throws Errores {
		validar(peso);
		try {
			return peso / moneda.getYen();
		} catch (Exception e) {
			e.getStackTrace();
			return 0.0;
		}
	}
	
	public double dePesoAWon(double peso) throws Errores {
		validar(peso);
		try {
			return peso / moneda.getWon();
		} catch (Exception e) {
			e.getStackTrace();
			return 0.0;
		}
	}
	
	public double deDolarAPeso(double dolar) throws Errores {
		validar(dolar);
		try {
			return dolar * moneda.getDolar();
		} catch (Exception e) {
			e.getStackTrace();
			return 0.0;
		}
	}
	
	public double deEuroAPeso(double euro) throws Errores {
		validar(euro);
		try {
			return euro * moneda.getEuro();
		} catch (Exception e) {
			e.getStackTrace();
			return 0.0;
		}
	}
	
	public double deLibrasAPeso(double libras) throws Errores {
		validar(libras);
		try {
			return libras * moneda.getLibras();
		} catch (Exception e) {
			e.getStackTrace();
			return 0.0;
		}
	}

	public double deYenAPeso(double yen) throws Errores {
		validar(yen);
		try {
			return yen * moneda.getYen();
		} catch (Exception e) {
			e.getStackTrace();
			return 0.0;
		}
	}
	
	public double deWonAPeso(double won) throws Errores {
		validar(won);
		try {
			return won * moneda.getWon();
		} catch (Exception e) {
			e.getStackTrace();
			return 0.0;
		}
	}

	private void validar(double moneda) throws Errores {
		if (moneda <= 0) {
			JOptionPane.showMessageDialog(null, "Debés ingresar un valor mayor a 0.");
			//throw new ErroresMoneda("Debés ingresar un valor mayor a 0");
		}
	}

}
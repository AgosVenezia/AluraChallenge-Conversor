public class Divisas {

	private double dolar = 201.50;
	private double euro = 216.87;
	private double libras = 247.14;
	private double yen = 1.54;
	private double won = 0.15;
		
	public Divisas() {
		super();
	}
	
	public Divisas(double dolar, double euro, double libras, double yen, double won) {
		super();
		this.dolar = dolar;
		this.euro = euro;
		this.libras = libras;
		this.yen = yen;
		this.won = won;
	}
	
	public double getDolar() {
		return dolar;
	}
	
	public void setDolar(double dolar) {
		this.dolar = dolar;
	}
	
	public double getEuro() {
		return euro;
	}
	
	public void setEuro(double euro) {
		this.euro = euro;
	}
	public double getLibras() {
		return libras;
	}
	
	public void setLibras(double libras) {
		this.libras = libras;
	}

	public double getYen() {
		return yen;
	}
	
	public void setYen(double yen) {
		this.yen = yen;
	}
	
	public double getWon() {
		return won;
	}
	
	public void setWon(double won) {
		this.won = won;
	}
	
}
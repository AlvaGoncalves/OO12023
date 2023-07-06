package ar.edu.unlp.info.oo1.parcial5del11_PrimeraFecha;

public class Inmueble implements Dominio{	
	private int num;
	private double valorL;
	private double valorE;
	private Contribuyente propie;
	
	public Inmueble(int num, double vl, double ve, Contribuyente propie) {
		this.num = num;
		this.valorL = vl;
		this.valorE = ve;
		this.propie = propie;
	}
	
	public double calcularImp() {
		return ( this.valorE + this.valorL ) * 0.01;
	}
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public double getValorL() {
		return valorL;
	}
	public void setValorL(double valorL) {
		this.valorL = valorL;
	}
	public double getValorE() {
		return valorE;
	}
	public void setValorE(double valorE) {
		this.valorE = valorE;
	}
	public Contribuyente getPropie() {
		return propie;
	}
	public void setPropie(Contribuyente propie) {
		this.propie = propie;
	}

	
}

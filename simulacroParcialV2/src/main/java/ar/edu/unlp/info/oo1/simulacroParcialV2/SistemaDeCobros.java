package ar.edu.unlp.info.oo1.simulacroParcialV2;

import java.util.ArrayList;
import java.util.List;

public class SistemaDeCobros {
	List<FormaDePago> cobros;
	
	
	public SistemaDeCobros() {
		this.cobros = new ArrayList<FormaDePago>();
	}
	
	public double valorLiquido() {
		return cobros.stream().mapToDouble(cobro -> cobro.valorLiquido()).sum();
	}
	
}

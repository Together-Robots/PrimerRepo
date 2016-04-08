package ar.edu.unlam.tallerweb.clase2;

public class Anillo {
	
	private Double radioInterno = 1.2;
	private Double radioExterno = 2.4;
	private Double pi = 3.1416;
	
	public Double calcularPerimetroInterno(){
		return 2 * pi * radioInterno;	
	}
	
	public Double calcularPerimetroExterno(){
		return 2 * pi * radioExterno;	
	}
	
	public Double calcularArea(){
		return radioExterno - radioInterno;
	}
}

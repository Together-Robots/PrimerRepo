package ar.edu.unlam.tallerweb.clase2;

public class Calculadora {
	
	public int sumar(Integer primerValor, Integer segundoValor){
		
		return primerValor + segundoValor;
	}
	
	public int restar(Integer primerValor, Integer segundoValor){
		return primerValor - segundoValor;
	}
	
	public int multiplicar(Integer primerValor, Integer segundoValor){
		return primerValor * segundoValor;
	}
	
	public Double dividir(Double primerValor, Double segundoValor){
		
		if(segundoValor == 0){
			return null;
		}
		else{
			return primerValor / segundoValor;
		}
	}
}

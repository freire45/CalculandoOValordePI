package br.com.erickfreire.calculandoovalordepi;

/**
 * Programa em Java que calcula o valor de PI
 * @author Erick Freire
 * @version 1 - Criado em 21-04-2021 as 15:52
 */

public class CalculandoOValordePI {

	public static void main(String[] args) {
		
		double pi = 4.0;
		double n1 = 3.0;
		
		for(int i = 1; i <= 200000; i++) {			
			
			if(i == 1) {
				pi = pi - (4.0 / n1);
			} else {
				if(i % 2 == 0) {
					pi = pi + (4.0 / n1);
				} 
				
				if(i % 2 == 1) {
					
					pi =pi - (float)(4.0 / n1) ;
				}
					    
			}
			
			n1 += 2;
			
			System.out.printf("%.5f %n", pi);
			
			if(pi == 3.14159) {
				System.out.printf("O PI chegou no resultado no passo: %d%n", i);
				
			}
			
		}
		
	}

}

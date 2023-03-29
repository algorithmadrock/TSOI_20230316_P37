/*
RESUMO      : Exercicio da pg.37, Simulação de um cruzamento de carros. Classe Principal
PROGRAMADORA: Luiza Felix
DATA        : 29/03/2023
 */

package view;

import controller.Carro;

public class Principal {
	public static void main(String[] args) {	
		
		String[] sentidos = {"norte", "sul", "leste", "oeste"};
		
		for (int i = 0; i<4; i++) {		
			Thread thread = new Carro(sentidos[i]);
			
			thread.start();
		}
	}

}

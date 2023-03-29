/*
RESUMO      : Exercicio da pg.37, Simulação de um cruzamento de carros. Classe dos carros
PROGRAMADORA: Luiza Felix
DATA        : 29/03/2023
 */

package controller;

import java.util.concurrent.Semaphore;

//TC = Thread Carro
public class Carro extends Thread {
	
	private String sentido;
	private Semaphore semaforo = new Semaphore(1);
	
	public Carro(String sentido) {
		this.sentido = sentido;
		
	}

	@Override
	public void run() {
		try {
			semaforo.acquire(); // é mutex por padrão
			cruzamento();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			semaforo.release();
		}
	}

	private void cruzamento() {
		try {
//			simulando a passagem do carro, bem rapidinho
			sleep(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("O carro que estava indo sentido " + sentido + " cruzou.");
		
	}
}

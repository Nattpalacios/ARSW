package edu.eci.arsw.math;

import java.util.ArrayList;

public class ControlDigits {
	
	private ArrayList<Thread> digitos;

	public void calcularDigitos(int N) throws InterruptedException{
		digitos = new ArrayList<>();
		for(int i = 0; i <= N; i++) {
			PiDigits pi = new PiDigits();
			digitos.add(pi);
			pi.start();
			
		}
		for(Thread t : digitos) {
			t.join();
		}
		
		//llamar concatenar
	}
	
	//concatenar
	
}

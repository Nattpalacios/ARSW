package edu.eci.arsw.primefinder;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Timer;
import java.util.TimerTask;

public class Main {
	
	private static Timer time;
	private boolean pausar;

	public static void main(String[] args) {
		
		//PrimeFinderThread pft=new PrimeFinderThread(0, 30000000);
		PrimeFinderThread pft1=new PrimeFinderThread(0, 10000000);
		PrimeFinderThread pft2=new PrimeFinderThread(10000001, 20000000);
		PrimeFinderThread pft3=new PrimeFinderThread(20000001, 30000000);
		
		//pft.start();
		pft1.start();
		pft2.start();
		pft3.start();
		
		/*time = new Timer();
		TimerTask task = new TimerTask() {

			@Override
			public void run() {
				
			}
		
		};
		time.schedule(task, 5000);*/
		
	}
	
}

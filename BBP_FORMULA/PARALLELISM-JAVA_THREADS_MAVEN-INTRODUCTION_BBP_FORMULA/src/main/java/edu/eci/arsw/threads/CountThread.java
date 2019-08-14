/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.threads;

/**
 *
 * @author hcadavid
 */
public class CountThread extends Thread{
	
	private int ini;
	private int fin;
	
	public CountThread(int A, int B) {
		ini = A;
		fin = B;
	}
	
	private void print(int A, int B) {
		ini = A;
		while(ini <= B) {
			System.out.println(ini);
			ini++;
		}
	}
	
	@Override
	public void run() {
		print(ini, fin);
	}
    
}

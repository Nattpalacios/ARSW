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
public class CountThread {
	
	private int number;
	
	public void print(int A, int B) {
		number = A;
		while(number <= B) {
			System.out.println(number);
			number++;
		}
	}
    
}

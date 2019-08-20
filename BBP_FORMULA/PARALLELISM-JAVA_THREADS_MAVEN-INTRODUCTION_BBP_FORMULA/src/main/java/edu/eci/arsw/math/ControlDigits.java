package edu.eci.arsw.math;

import java.util.ArrayList;

public class ControlDigits extends Thread{
	
	public int start, end;
	public ControlDigits (int s, int e) {
		start = s; end = e;
	}
	
	@Override
	public void run () {
		System.err.println(end);
		byte[] digits = PiDigits.getDigitsOriginal(start, end);
		for(int i = 0; i < end; i++) {
			PiDigits.agregue(digits[i], i + start);
		}
	}
}




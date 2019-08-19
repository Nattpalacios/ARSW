package edu.eci.arsw.math;

import java.util.ArrayList;

public class ControlDigits extends Thread{

	private static int DigitsPerSum = 8;
	private int C,S,ind;
	private PiDigits PD;

	public ControlDigits(int i, int count, int start, PiDigits Pidigits){
		ind = i;
		C = count;
		S = start + (((ind / 8) - (ind % 8)) * 8);
		PD = Pidigits;
	}

	@Override
	public void run(){		
        double sum = 0;
        for (int i = ind; i < C; i++) {
            if ((i % DigitsPerSum == 0) && (i != ind)) {
                sum = 4 * PD.sum(1, S)
                        - 2 * PD.sum(4, S)
                        - PD.sum(5, S)
                        - PD.sum(6, S);
                S += DigitsPerSum;
            }
            sum = 16 * (sum - Math.floor(sum));
            PD.agregar(i, (byte)sum);
        }
	}	
}





package Application;

import java.util.Arrays;

import Util.Matrix;

public class Program {

	public static void main(String[] args) {
		
		Matrix matrix = new Matrix(2, 5);
	    
		
		matrix.setValue(1, 2, 3);
		
	    matrix.setValuesPerLine(0, Arrays.asList(1,2,3,4,5));
	    matrix.setValuesPerLine(1, Arrays.asList(3,4));
	    
	    matrix.getValuesToInt();

	}

}

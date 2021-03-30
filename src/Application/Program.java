package Application;

import java.util.Arrays;

import Util.Matrix;

public class Program {

	public static void main(String[] args) {
		
		Matrix matrix = new Matrix(3, 2);
		Matrix matrix2 = new Matrix(2,3);
		
		matrix.setValuesInMultipleLines(Arrays.asList(3,2), Arrays.asList(3,3), Arrays.asList(1,2));
		matrix2.setValuesInMultipleLines(Arrays.asList(3,2,6), Arrays.asList(1,2,5));
		
		Matrix result = Matrix.product(matrix, matrix2);
		
		
		matrix.getValuesToInt();
		System.out.println();
		matrix2.getValuesToInt();
		
		System.out.println();
		result.getValuesToInt();
		//result.getValuesToInt();
		
		
		//System.out.println(Matrix.verifyIfProductIsPossible(matrix, matrix2));
		
		//matrix.setValue(1, 2, 3);
		
	    /*matrix.setValuesPerLine(0, Arrays.asList(1,2,3,4,5));
	    matrix.setValuesPerLine(1, Arrays.asList(3,4));
	    */
		
	    //matrix.setValuesInMultipleLines();
	    
	    //matrix.getValuesToInt();

	}

}

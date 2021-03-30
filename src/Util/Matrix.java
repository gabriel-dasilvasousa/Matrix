package Util;

import java.util.List;

public class Matrix{

	  private int[][] matrix;
	  private int lines;
	  private int columns;

	  public Matrix(int lines, int columns){
	    this.lines = lines;
	    this.columns = columns;
	    matrix = new int[lines][columns];     
	  }

	  public static boolean verifyProduct(Matrix m1, Matrix m2){
	    if(m1.columns != m2.lines){
	      return false;
	    }
	    else return true;
	  }

	  public int getLines(){
	    return lines;
	  }

	  public int getColumns(){
	    return columns;
	  }

	  public void setValue(int line, int column, int value){
	    matrix[line][column] = value;
	  }
	  
	  public void setValuesPerLine(int linha, List<Integer> elementos) {	
		  if(elementos.size()>columns) {
			  throw new IllegalArgumentException();
		  }
		  for(int i=0; i<elementos.size(); i++) {
			  matrix[linha][i] = elementos.get(i);
		  }
	  }
	  
	  public void getValuesToInt(){
	    for(int i=0; i<lines; i++){
	      for(int j=0; j<columns; j++){
	        System.out.print(matrix[i][j]+" ");
	      }
	      System.out.println();
	    }
	  }
	}
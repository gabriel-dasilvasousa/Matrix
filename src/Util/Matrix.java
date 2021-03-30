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

	  public static boolean verifyIfProductIsPossible(Matrix m1, Matrix m2){
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
	  
	  public int getValue(int line, int column) {
		  return matrix[line][column];
	  }
	  
	  public int[] getLine(int line) {
		  if(line>getLines()) throw new IllegalArgumentException();
		  int[] lineValues = new int[this.columns];
		  for(int i=0; i<this.columns; i++) {
			  lineValues[i] = matrix[line][i];
		  }
		  return lineValues;
	  }
	  
	  public int[] getColumn(int column) {
		  if(column>getColumns()) throw new IllegalArgumentException();
		  int[] columnValues = new int[this.lines];
		  for(int i=0; i<this.lines; i++) {
			  columnValues[i] = matrix[i][column];
		  }
		  return columnValues;
	  }
	  
	  public void setValue(int line, int column, int value){
	    matrix[line][column] = value;
	  }
	  
	  public void setValuesPerLine(int linha, List<Integer> elementos) {	
		  if(elementos.size()>columns) throw new IllegalArgumentException();
		  for(int i=0; i<elementos.size(); i++) {
			  matrix[linha][i] = elementos.get(i);
		  }
	  }
	  
	  public void setValuesInMultipleLines(List<Integer>... lines) {
		  if(lines.length > this.lines) throw new IllegalArgumentException();
		  for(int i=0; i<lines.length;i++) {
			  setValuesPerLine(i, lines[i]);
		  }
	  }
	  
	  public static Matrix product(Matrix m1, Matrix m2) {
		  if(!verifyIfProductIsPossible(m1, m2)) throw new IllegalArgumentException("Number of lines and columns incompatibles");
		  
		  Matrix matrixResult = new Matrix(m1.getLines(),m2.getColumns());
		  
		  for(int i=0; i<m1.getLines(); i++) {
			  int value = 0;
			  for(int j=0; j<m2.getColumns(); j++) {
				  int valueInLine[] = m1.getLine(i);
				  for(int k=0; k<m2.getLines(); k++) {
					  int valInLine = valueInLine[k];
					  int valueInColumn = m2.getColumn(j)[k];  
					  value += valInLine*valueInColumn;
				  }
				  matrixResult.setValue(i, j, value);
				  value=0;
			  }
		  }
		  return matrixResult;
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
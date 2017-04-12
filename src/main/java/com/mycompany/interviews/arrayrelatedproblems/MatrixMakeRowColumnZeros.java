package com.mycompany.interviews.arrayrelatedproblems;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author abhikbanerjee12
 */
public class MatrixMakeRowColumnZeros {
  public static int[][] matr = new int[3][4];
  
  public static void main(String args[]){
    createRandomMatrix();
    printMatrix();
    System.out.println();
    makeMatrRowColZero(matr);    
    printMatrix();
  }
  public static void makeMatrRowColZero(int[][] matrix){
    
    List<Integer> row  = new ArrayList<Integer>();
    List<Integer> col = new ArrayList<Integer>();
    
    //check and store the rows and columns which have 0 in them
    int nrow = matr.length;
    int ncol = matr[0].length;
    for(int i=0;i<nrow;i++){
      for(int j=0;j<ncol;j++){
        if(matr[i][j]==0){
          row.add(i);
          col.add(j);
        }
      }
    }
    
    //Now set the matrix to 0 wherever the row is 0
    for(Integer rnum : row){
      for(int j=0;j<ncol;j++){
        matr[rnum][j] = 0;
      }
    }
    
    //Now set the matrix to 0 wherever the Column is 0
    for(Integer cnum : col){
      for(int i=0;i<nrow;i++){
        matr[i][cnum] = 0;
      }
    }
    
    
  }
  
  public static void createRandomMatrix()
  {
    
    int nrow = matr.length;
    int ncol = matr[0].length;
    for(int i=0;i<nrow;i++){
      for(int j=0;j<ncol;j++){
        matr[i][j] = (int)(Math.random()*5);
      }
    }
    
  }
  
  public static void printMatrix()
  {
    
    int nrow = matr.length;
    int ncol = matr[0].length;
    for(int i=0;i<nrow;i++){
      for(int j=0;j<ncol;j++){
        System.out.print(matr[i][j]+" ");
      }
      System.out.println();
    }
    
  }
  
}

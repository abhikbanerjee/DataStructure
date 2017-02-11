package com.mycompany.ArrayMiscProblems;

/**
 *
 * @author abhikbanerjee12
 */
public class SpiralMatrix {
  public static void main(String args[]){
    int i = 6;
    int j = 4;
    int[][] matr = new int[i][j];
    int count =1;
    for(int k =0;k<i;k++){
      for(int l = 0;l<j;l++){
        matr[k][l]= count++;
      }
    }
    printMatrix(matr);
    readMatrixSpirally(matr);
    
  }
  public static void readMatrixSpirally(int[][] matr){
    
    //Gets the number of rows and columns for the matrix
    int k =0;
    int l = matr[0].length-1;
    int m = 0;
    int n = matr.length-1;
    while(k < l && m < n){
      
      //going from left to right
      for(int i=k;i<=l;i++){
        System.out.print(matr[m][i]+"  ");
      }
        
      //going from top to bottom
      for(int j=m+1;j<=n;j++){
        System.out.print(matr[j][l]+"  ");
      }
      
      //going from right to left
      for(int i=l-1;i>=k;i--){
        System.out.print(matr[n][i]+"  ");
      }
      
      //going from botom to top
      for(int i=n-1;i>=m+1;i--){
        System.out.print(matr[i][k]+"  ");
      }
      
      l--;n--;k++;m++;
      
    }
    System.out.println();
  }
  public static void printMatrix(int[][] matr){
    int i = matr.length;
    int j = matr[0].length;
    for(int k = 0;k<i;k++){
      for(int l = 0;l<j;l++){
        System.out.print(matr[k][l]+"   ");
      }
      System.out.println();
    }
  }
}

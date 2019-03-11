package edu.cnm.deepdive;


import java.util.Arrays;

public class Matrices {

  public static void main(String[] args) {
    int[][] testMat = {{2,4,6}, {8,10,12},{14,16,18}};
    //int[][] testMat = {{-1}};

    System.out.println(Arrays.deepToString(rotate(testMat)));
  }

  public static int[][] rotate(int[][] data) {

    int[][] returnData = new int[data.length][data.length];

    for (int c = 0; c < data.length; c++) {
      for (int r = data.length-1; r >=0; r--) {
        returnData[r][c]= data[data.length -1-c][r];

      }
    }

    return returnData ;
  }}


package com.company;

public class Main {

    public static void main(String[] args)
    {	// write your code here

        int num_of_rows = 6;
        int num_of_cols = 7;

        int[][] grid = new int[num_of_rows][num_of_cols];

      for(int j=0;j<6;j++)
      {
          for(int i = 0; i < 7; i++) {
              grid[j][i] = 0;

          }
          System.out.println();
      }

    }

}

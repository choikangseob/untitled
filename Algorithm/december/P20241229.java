package Algorithm.december;

import java.util.Scanner;

public class P20241229 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int [][] board = new int[n+2][n+2];
    int [][] putBoard = new int[n][n];
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        putBoard[i][j] = sc.nextInt();
      }
    }
    for (int i = 0; i < n+2; i++) {
      if(i==0||i==n+1){
        for (int j = 0; j < n+2; j++) {
          board[i][j] = 0;
        }
      }else{
        for (int j = 0; j < n+2; j++) {
          if(j==0||j==n+1){
            board[i][j] = 0;
          }else{
            board[i][j] = putBoard[i-1][j-1];
          }
        }
      }
    }
/*    for (int i = 0; i < n+2; i++) {
      for (int j = 0; j < n+2; j++) {
        System.out.print(board[i][j]);
      }
      System.out.println("");
    }*/
    int count = 0;
    for (int i = 1; i < n+1; i++) {
      for (int j = 1; j < n+1; j++) {
        if(board[i][j]>board[i-1][j]&&board[i][j]>board[i][j-1]&&
          board[i][j]>board[i+1][j]&&board[i][j]>board[i][j+1]){
          count++;
        }
      }
    }
    System.out.println(count);
    System.out.println("Clear");
  }
}

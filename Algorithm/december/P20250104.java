package Algorithm.december;

import java.util.Scanner;

public class P20250104 {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int n = 7;

    int[][] arr = new int[n][n];

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        arr[i][j] = sc.nextInt();
      }
    }
    int count = 0;
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
          if(j+4 >=n ){
            break;
          }
          if(arr[i][j] == arr[i][j+4]&& arr[i][j+1] == arr[i][j+3]){
            count++;
          }
          if (arr[j][i] == arr[j + 4][i] && arr[j + 1][i] == arr[j+3][i]) {
            count++;
          }


      }
    }
    System.out.println("길이 5짜리 회문수는"+count+"개 입니다.");
    System.out.println("Clear");
  }
}

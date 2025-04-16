package Algorithm.december;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class P20250110 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int[][] arr = new int[n][2];

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < 2; j++) {
        arr[i][j] = sc.nextInt();
      }
    }

    Arrays.sort(arr, new Comparator<int[]>() {
      @Override
      public int compare(int[] a, int[] b) {
        return Integer.compare(a[0], b[0]);
      }
    });

    int count = 1;
    int max = arr[4][1];
    for (int i = n-2 ;i>= 0;i-- ){
      if(arr[i][1]>max){
        count++;
        max = arr[i][1];
      }
    }
    System.out.println(count);
    System.out.println("Clear");
  }
}

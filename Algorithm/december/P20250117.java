package Algorithm.december;

import java.util.Scanner;

public class P20250117 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();

    int[] arr = new int[n];
    int[] arr2 = new int[n];

    for (int i = 0; i < n; i++) {
      arr2[i] = sc.nextInt();
    }
    for(int i = 0 ; i < n ; i++){
      int m =arr2[i];
      int count = 0;
      for(int j = 0 ; j <= m+count ; j++ ) {
        if(arr[j]!=0){
          count++;
        }
      }
      if(count <= 0){
      arr[m] = i+1;
    }else{
      arr[m+count] = i+1;
      }
    }
    for(int i = 0 ; i < n ; i++){
      System.out.print(arr[i] + " ");
    }
    System.out.println("Clear");
  }
}

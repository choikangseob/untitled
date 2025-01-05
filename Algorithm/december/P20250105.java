package Algorithm.december;

import java.util.ArrayList;
import java.util.Scanner;

public class P20250105 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

   int n = sc.nextInt();
   int[] arr = new int[n];

   for (int i = 0; i < n; i++) {
     arr[i] = sc.nextInt();
   }
    System.out.println("입력 시킨수중 찾아볼 수 m를 입력하시오");
   int m = sc.nextInt();


   int changeNum = 0;
   int changeNum2 = 0;
   for (int i = 0; i < n; i++) {
     int min = arr[i];
     for (int j = i + 1; j < n; j++) {
       if(min>arr[j]){
         changeNum = min;
         min = arr[j];
         arr[i] = min;
         arr[j] = changeNum;
       }
     }
     if(i+1>=n){
       break;
     }
     if(arr[i]>arr[i+1]){
       changeNum2 = arr[i];
       arr[i] = arr[i+1];
       arr[i+1] = changeNum2;
     }
   }
   for (int i = 0; i < n; i++) {
     System.out.println(arr[i]);
     if(m==arr[i]){
       System.out.println(m+"은"+(i+1)+"번째에 위치합니다");
       break;
     }
   }
  }
}

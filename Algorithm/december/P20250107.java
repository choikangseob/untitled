package Algorithm.december;

import java.util.ArrayList;
import java.util.Scanner;

public class P20250107 {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int[] arr = new int[n];
    System.out.println("몇개로 나눌건지 m을 입력하시오");
    int m = sc.nextInt();

    int lt = 1;
    int rt = 0 ;
    int max = arr[0];
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
      rt += arr[i];
      if (arr[i] > max) {
        max = arr[i];
      }
      lt = max;
    }

    int result = rt;
    while(lt <= rt){
      int mid = (lt + rt) /2;


      if(func(arr,n,m,mid)){
        result = mid;
        rt = mid - 1;
      }else{
        lt = mid + 1;
      }
    }
    System.out.println(result);
    System.out.println("Clear");



  }
  public static boolean func(int[] arr,int n, int m ,int limit){
      int count = 1;
      int currentSum = 0;
      for (int i = 0; i < n; i++) {
        if(currentSum+arr[i] > limit){
          count++;
          currentSum = arr[i];
          if(count>m){
            return false;
          }
        }else{
          currentSum += arr[i];
        }
      }
      return true;
  }
}

package Algorithm.december;

import java.util.Scanner;

public class P20250108 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("마구간의 개수를 입력하시오");
    int n = sc.nextInt();
    System.out.println("말의 개수를 입력하시오");
    int c = sc.nextInt();
    System.out.println("마구간 개수"+n+"개의 좌표를 입력하시오");
    int [] arr = new int[n];

    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }
    int max = arr[0];
    for (int i = 1; i < n; i++) {
      if (arr[i] > max) {
        arr[i-1] = max;
        max = arr[i];
      }else{
        arr[i-1] = arr[i];
      }
    }

    int lt = arr[0];
    int rt = max;
    int result = 0;
    while(lt<=rt){
      int mid = (lt+rt)/2;



      if(func(arr,c,mid)){
        result = mid;
        lt = mid+1;
      }else{
        rt = mid-1;
      }
    }
    System.out.println(result);
  }

  public static boolean func(int[] arr, int c, int limit) {

    int count = 1;
    int ep = arr[0];
    for (int i = 1; i < arr.length; i++) {
      if(arr[i]-ep>=limit){
        count++;
        ep = arr[i];
        if(count>=c){
          return true;
        }
      }

    }
    return false;
  }
}

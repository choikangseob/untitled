package Algorithm.february;

import java.util.Scanner;

public class P20250226 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int m = sc.nextInt();
    int n = sc.nextInt();

    int [] arr = new int[n+1];
    int [] arr2 = new int[n+1];
    int [] arr3 = new int[n+1];
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }
    DFS(m,n,0,arr,arr2,arr3);
    sum(m,n,arr3);

  }

  public static void DFS(int m,int n , int v, int[] arr,int[] arr2,int[] arr3){
    int k = 0;

    if(v==n){
      for(int i=0;i<n;i++) {
        if (arr2[i] == 1) {
          k += arr[i];
          arr3[i] = k;
        }
      }
    }else{
      arr2[v] = 1;
      DFS(m,n, v+1 , arr , arr2,arr3);
      arr2[v] = 0;
      DFS(m,n, v+1 , arr , arr2,arr3 );
    }
  }

  public static int sum(int m ,int n , int [] arr3){
    int distance = 0;
    if(m-arr3[0]>0) {
      distance = m - arr3[0];
    }
    int num = 0 ;
    for(int i=0;i<n;i++){
      if(arr3[i]<m){
        if(m-arr3[i]<distance){
          distance = m-arr3[i];
          num = i;
        }
      }
    }
    System.out.println(arr3[num]);
    return arr3[num];
  }
}

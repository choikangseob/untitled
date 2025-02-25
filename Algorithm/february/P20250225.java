package Algorithm.february;

import java.util.Scanner;

public class P20250225 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int[] arr = new int[n+1];
    int[] arr2 = new int[n+1];
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }
    DFS(n,0,arr2,arr);
  }

  public static void DFS(int n ,int v,int[] arr2,int[] arr){
    int m = 0;
    int k = 0;
    if(v==n){
      for(int i=0;i<n;i++) {
        if (arr2[i] == 1) {
          m += arr[i];
        }
        if(arr2[i]==0){
          k += arr[i];
        }
      }
      if(m==k) {
        System.out.println("YES");
      }
    }else{
      arr2[v] = 1;
      DFS(n,v+1,arr2,arr);
      arr2[v] = 0;
      DFS(n,v+1,arr2,arr);
    }
  }
}

package Algorithm.february;

import java.util.ArrayList;
import java.util.Scanner;

public class P20250226 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    ArrayList<Integer> list = new ArrayList<>();
    int m = sc.nextInt();
    int n = sc.nextInt();

    int [] arr = new int[n+1];
    int [] arr2 = new int[n+1];
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }
    DFS(m,n,0,arr,arr2,list);
    sum(m,n,list);

  }

  public static void DFS(int m,int n , int v, int[] arr,int[] arr2,ArrayList<Integer> list){
    int k = 0;

    if(v==n){
      for(int i=0;i<n;i++) {
        if (arr2[i] == 1) {
          k += arr[i];
          list.add(k);
        }
      }
    }else{
      arr2[v] = 1;
      DFS(m,n, v+1 , arr , arr2,list);
      arr2[v] = 0;
      DFS(m,n, v+1 , arr , arr2,list );
    }
  }

  public static int sum(int m ,int n , ArrayList<Integer> list){
    int distance = 0;
    if(m-list.get(0)>0) {
      distance = m - list.get(0);
    }
    int num = 0 ;
    for(int i=0;i<list.size();i++){
      if(list.get(i)<m){
        if(m-list.get(i)<distance){
          distance = m-list.get(i);
          num = i;
        }
      }
    }
    System.out.println(list.get(num));
    System.out.println("YES");
    return list.get(num);
  }
}

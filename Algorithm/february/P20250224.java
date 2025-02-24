package Algorithm.february;

import java.util.Scanner;

public class P20250224 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int[] ch = new int[n+1];
    DFS(n,ch,1);
  }

  public static void DFS(int n,int[] ch,int v){
    if(v==n+1){
      for(int i=1;i<=n;i++){
        if(ch[i]==1){
          System.out.print(i+" ");
        }
      }
      System.out.println();
    }else{
      ch[v] = 1;
      DFS(n,ch,v+1);
      ch[v] = 0;
      DFS(n,ch,v+1);

    }
  }
}

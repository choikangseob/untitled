package Algorithm.february;

public class P20250222 {
  public static void main(String[] args) {
  int n = 1;
  DFS(n);
    System.out.println("Clear");
  }

  public static void DFS(int n){
    if(n>7){
      return;
    }else{
      System.out.println(n);
      DFS(n*2);
      DFS(n*2+1);

    }
  }
}

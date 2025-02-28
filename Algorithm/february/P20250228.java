package Algorithm.february;

import java.util.Scanner;

public class P20250228 {
  static int N, M;
  static int[] arr;
  static int count = 0;

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    N = sc.nextInt();
    M = sc.nextInt();

    arr = new int[M];
    DFS(0);
    System.out.println(count);
  }

  public static void DFS(int depth) {
    if (depth == M) {
      for (int i = 0; i < M; i++) {
        System.out.print(arr[i] + " ");
      }
      System.out.println();
      count++;
      return;
    }
    for (int i = 1; i <= N; i++) {
      arr[depth] = i;
      DFS(depth + 1);
    }
  }
}

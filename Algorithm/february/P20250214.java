package Algorithm.february;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class P20250214 {
  public static void main(String[] args) {


    Queue<Integer> q = new LinkedList<>();
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    int k = 0;

    for (int i = 0; i < n; i++) {
      q.add(sc.nextInt());
    }
    while(!q.isEmpty()){
    int max = q.peek();
    int number = 0;
    for (int i = 0; i <q.size(); i++) {

      q.add(q.poll());
      if(i==m){
        number = q.peek();
      }
      if (max < q.peek()) {
        max = q.peek();
      }
      }

      for (int j = 0; j <q.size(); j++) {
        int current = q.poll();

        if (current == max) {
          k++;
          if (m == 0) {
            System.out.println(k + "번째 진료를 봅니다");
            return;
          }
          m--;
        } else {
          q.add(current);
        }
      }
    }
  }
}

package Algorithm.february;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class P20250213 {

  public static void main(String[] args) {

    Queue<Integer> q = new LinkedList<>();

    for (int i = 1; i < 9; i++) {
      q.add(i);
    }
    while (q.size() > 1) {
      for(int i =0;i<2;i++){
        q.add(q.poll());
      }
      q.poll();
    }
    System.out.println(q.peek());
    System.out.println("Clear");
    }
}

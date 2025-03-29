package Algorithm.february;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class P20250215 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    Queue<String> q = new LinkedList<>();


    int n = sc.nextInt();

    while(true){
      String s = sc.next();
      if(s.equals("0")){
        break;
      }
      q.add(s);
    }

    for (int i = 0; i <= n; i++) {
      String comparison = "";
        comparison += sc.nextLine();

        for (int j = 0; j < comparison.length(); j++) {
          char ch = comparison.charAt(j);
          String ch1 ="";
          ch1 += String.valueOf(ch);
          if(q.peek() != null && q.peek().equals(ch1)) {
            q.poll();
          }

        }

      if(q.isEmpty()){
        System.out.println("YES");
      }else{
        System.out.println("NO");
      }
      }
    System.out.println("Clear");
    }
}

package Algorithm.february;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class P20250220 {
  public static void main(String[] args) {

    HashMap<Integer, Integer> map = new HashMap<>();

    Scanner sc = new Scanner(System.in);

    boolean flag = true;
    while(flag){
      int n = sc.nextInt();
      int max = 0;

      if(n != 0 && n > 0){
        int key = sc.nextInt();
        map.put(key,n);
      } else if (n == 0 && !map.isEmpty()) {
        int maxKey = -1;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
          if (entry.getValue() > max) {
            max = entry.getValue();
            maxKey = entry.getKey();
          }
        }

        if (maxKey != -1) {
          map.remove(maxKey);
        }

        System.out.println(max);

      } else{
        flag = false;
      }


    }
    System.out.println("Clear");
  }
}

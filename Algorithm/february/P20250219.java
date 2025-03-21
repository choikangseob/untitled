package Algorithm.february;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class P20250219 {

  public static void main(String[] args) {

    HashMap<Integer, Integer> map = new HashMap<>();

    Scanner sc = new Scanner(System.in);

    boolean flag = true;
    while(flag){
      int n = sc.nextInt();
      int min = 100000000;

if(n != 0 && n > 0){
  int key = sc.nextInt();
  map.put(key,n);
} else if (n == 0 && !map.isEmpty()) {
  int minKey = -1;
  for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
    if (entry.getValue() < min) {
      min = entry.getValue();
      minKey = entry.getKey();
    }
  }

  if (minKey != -1) {
    map.remove(minKey);
  }

  System.out.println(min);

      } else{
        flag = false;
      }


    }
    System.out.println("Clear");
  }
}

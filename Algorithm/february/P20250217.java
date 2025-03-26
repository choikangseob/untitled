package Algorithm.february;

import java.util.HashMap;
import java.util.Scanner;

public class P20250217 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    HashMap<String, Integer> map = new HashMap<>();

    int n = sc.nextInt();

    for (int i = 0; i < n; i++) {
      map.put(sc.next(), sc.nextInt());
    }

    for (int i = 0; i < n-1; i++) {
      String key = sc.next();
      if(map.containsKey(key)){
        map.remove(key);
      }
    }
    System.out.println(map);
    System.out.println("Clear");
  }
}

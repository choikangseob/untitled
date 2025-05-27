package Algorithm.december;

import java.util.ArrayList;
import java.util.Scanner;

public class P20241219 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    ArrayList<String> String = new ArrayList<>();

    String reversed = "";
    System.out.println("입력할 단어수 n개를 입력하시오");
    int n = sc.nextInt();

    for (int i = 0; i < n; i++) {
      String.add(sc.next());
    }
    for (int i = 0; i < n; i++) {
      reversed = new StringBuilder(String.get(i)).reverse().toString();
      if (reversed.equalsIgnoreCase(String.get(i))) {
        System.out.println("#"+(i+1)+"YES");
      }else{
        System.out.println("#"+(i+1)+"NO");
      }
    }
    System.out.println("Clear");
  }
}

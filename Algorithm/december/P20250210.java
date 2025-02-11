package Algorithm.december;

import java.util.ArrayList;
import java.util.Scanner;

public class P20250210 {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    ArrayList<String> list = new ArrayList<>();

    while(true) {
      String input = sc.nextLine();

      if(input.equals("x")) {
        break;
      }else{
        list.add(input);
      }
    }
    int stack = 0;
    int sum = 0;

    for (int i = 0; i < list.size(); i++) {


      if (list.get(i).equals("(")) {
        stack++;
      } else if (list.get(i).equals(")")) {
        stack--;

        if (list.get(i - 1).equals("(")) {
          sum += stack;
        }

        if(list.get(i - 1).equals(")")){
          sum ++;
        }
      }
    }

    System.out.println(sum);
  }
}

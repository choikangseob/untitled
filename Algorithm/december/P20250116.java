package Algorithm.december;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class P20250116 {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    ArrayList<Integer> list = new ArrayList<Integer>();

    for (int i = 0; i < n; i++) {
      list.add(sc.nextInt());
    }
    int count = 0;
    String str  ="";
    int beforeNumber = 0;

    while (list.size() > 0) {
      int k = 0;
      if (list.size() == 1) {
        if (beforeNumber < list.get(0)) {
          str += "L";
          count++;
        }
        break;
      } else if (list.size() == 2) {
        if (list.get(0) < list.get(1) && beforeNumber < list.get(0)) {
          str += "L";
          beforeNumber = list.get(0);
          list.remove(0);
          count++;
        } else if (list.get(0) > list.get(1) && beforeNumber < list.get(1)) {
          str += "R";
          beforeNumber = list.get(1);
          list.remove(1);
          count++;
        } else if (list.get(0) < list.get(1) && beforeNumber > list.get(0)) {
          str += "R";
          beforeNumber = list.get(1);
          list.remove(1);
          count++;
        } else if (list.get(0) > list.get(1) && beforeNumber > list.get(1)) {
          str += "L";
          beforeNumber = list.get(0);
          list.remove(0);
          count++;
        }
        break;
      } else {
        if (list.get(0) < list.get(list.size() - 1) && beforeNumber < list.get(0) && beforeNumber < list.get(list.size() - 1)) {
          k = 0;
          str += "L";
          beforeNumber = list.get(0);
          pop(list, k);
          count++;
        } else if (list.get(list.size() - 1) < list.get(0) && beforeNumber < list.get(list.size() - 1) && beforeNumber < list.get(0)) {
          k = list.size() - 1;
          str += "R";
          beforeNumber = list.get(k);
          pop(list, k);
          count++;
        } else if (list.get(0) < list.get(list.size() - 1) && beforeNumber > list.get(0) && beforeNumber < list.get(list.size() - 1)) {
          k = list.size() - 1;
          str += "R";
          beforeNumber = list.get(k);
          pop(list, k);
          count++;
        } else if (list.get(0) > list.get(list.size() - 1) && beforeNumber > list.get(list.size() - 1) && beforeNumber < list.get(0)) {
          k = 0;
          str += "L";
          beforeNumber = list.get(0);
          pop(list, k);
          count++;
        } else {
          break;
        }
      }
    }

    System.out.println(count);
    System.out.println(str);
  }

  public static ArrayList<Integer> pop(ArrayList<Integer> list, int k) {
    if (k == 0) {
      list.remove(0);
    } else if (k == list.size() - 1) {
      list.remove(list.size() - 1);
    }
    return list;
  }
}

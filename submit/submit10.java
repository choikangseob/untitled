package submit;

import java.util.ArrayList;
import java.util.Scanner;

public class submit10 {
  public static void main(String[] args) {
      ArrayList<Integer> list = new ArrayList<Integer>();
      Scanner sc = new Scanner(System.in);

    System.out.println("배열의 크기를 입력하시오");
    int n = sc.nextInt();
    System.out.println(n+"크기의 배열의 값을 입력하시오");
    for (int i = 0; i < n; i++) {
      list.add(sc.nextInt());
    }
    System.out.println("배열의 값들중 같은수가 몇개인지 체크하겠습니다");
    int count = 0;
    int checkNum = list.get(0);
    for (int i = 0; i < list.size(); i++) {
      if (checkNum == list.get(i)) {
        count++;
      }
    }
    System.out.println(count+"개의 같은수가있습니다");
  }
}

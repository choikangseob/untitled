package submit;

import java.util.ArrayList;
import java.util.Scanner;

public class submit6 {

  public static void main(String[] args) {

    ArrayList<Integer> number = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    int sum=0;
    number.add(0);
    number.add(1);
    if(number.size()>=2){
      for (int i = 2; i <=30; i++) {
        sum += number.get(i-2)+number.get(i-1);
        number.add(sum);
        sum = 0;
      }
    }
    int n =sc.nextInt();
    if(n>=2) {
      int m = number.get(n);
      System.out.println(m);
    }

  }
}


package submit;

import java.util.ArrayList;
import java.util.Scanner;

public class submit11 {
  public static void main(String[] args) {

    ArrayList<Integer> maxMin = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    System.out.println("배열의 크기 n을 입력하시오");
    int n = sc.nextInt();
    for (int i = 0; i < n; i++) {
      System.out.println((i+1)+"번째 수를 입력하세요 "+n+"개까지입력해야합니다");
      maxMin.add(sc.nextInt());

    }
    int min = maxMin.get(0);
    int max = maxMin.get(0);
    for (int i = 1; i < n; i++) {
      if (min > maxMin.get(i)) {
        min=maxMin.get(i);
      }else if(max < maxMin.get(i)){
        max=maxMin.get(i);
      }else{
        if(min==maxMin.get(i)){
          min=maxMin.get(i);
        }else{
          max=maxMin.get(i);
        }
      }
    }

    System.out.println("최대값은" + max + "입니다");
    System.out.println("최소값은" + min + "입니다");
  }
}

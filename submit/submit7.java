package submit;

import java.util.ArrayList;
import java.util.Scanner;

public class submit7 {

  public static void main(String[] args) {

    ArrayList<Integer> arr = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    System.out.print("배열의 크기를 입력하시오");
    int n = sc.nextInt();

    if(n>=1 && n<=100){
      for(int i =0 ; i<n ; i++){
        System.out.print((i+1)+"번째 배열의 값을 입력하시오 -1000~1000사이의 값만 가능합니다");
        arr.add(sc.nextInt());
      }
    }
    int max = arr.get(0);
    int min = arr.get(0);
    for(int i=1 ; i<n ; i++){
      if(arr.get(i)>max){
        max = arr.get(i);
      }
      if(arr.get(i)<min){
        min = arr.get(i);
      }
    }
    System.out.println("최대값은"+max+"입니다");
    System.out.println("최솟값은"+min+"입니다");
  }
}

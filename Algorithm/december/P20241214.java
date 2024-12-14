package Algorithm.december;

import java.util.ArrayList;
import java.util.Scanner;

public class P20241214 {

  //첫 줄에 자연수의 개수 N(3<=N<=100)이 주어지고, 그 다음 줄에 N개의 자연수가 주어진다.
  //각 자연수의 크기는 10,000,000를 넘지 않는다.
  //▣ 출력설명
  //자릿수의 합이 최대인 자연수를 출력한다. 자릿수의 합이 같을 경우 입력순으로 먼저인 숫자
  //를 출력합니다.
  //▣ 입력예제 1
  //3
  //125 15232 97
  //▣ 출력예제 1
  //97

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    ArrayList<Integer> list = new ArrayList<>();
    ArrayList<Integer> list1 = new ArrayList<>();
    System.out.println("자연수의 개수 N을 입력하시요 3<=N<=100");
    int n = sc.nextInt();
    int number = 0;
    int sum = 0;
    int min = -2100000000;
    int target= 0;
    System.out.println("N개의 자연수를 입력하시오 각 자연수의 크기는 10,000,000를 넘으면 안됩니다");
    for (int i = 0; i < n; i++) {
      list.add(sc.nextInt());
    }

    for(int j = 0; j < list.size(); j++) {
      number = list.get(j);
      while(number>0){
        sum +=number%10;
          number = number/10;
      }
      list1.add(sum);
      sum = 0;
    }
    for (int t = 0; t < list1.size(); t++) {
      if(list1.get(t)>min){
        min = list1.get(t);
        target = t;
      }
    }
    System.out.println("정답은"+list.get(target)+"입니다");
  }
}

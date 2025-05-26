package Algorithm.december;

import java.util.ArrayList;
import java.util.Scanner;

public class P20241220 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    ArrayList<Integer> list = new ArrayList<>();

    System.out.println("문자와 숫자가 섞인 문장을 쓰시오");
    String text = sc.next();
    int len = text.length();
    int number = 0;

    int combinationNumber = 0;
    for (int i = 0; i < len; i++) {
/*      if(text.substring(i, i + 1).equals("0")||text.substring(i, i + 1).equals("1")||text.substring(i, i + 1).equals("2")||text.substring(i, i + 1).equals("3")||
        text.substring(i, i + 1).equals("4")||text.substring(i, i + 1).equals("5")||text.substring(i, i + 1).equals("6")||text.substring(i, i + 1).equals("7")||
        text.substring(i, i + 1).equals("8")||text.substring(i, i + 1).equals("9")){
        list.add(Integer.parseInt(text.substring(i, i + 1)));
      }*/
      if ('0' <= text.charAt(i) && text.charAt(i) <= '9') {
        combinationNumber = combinationNumber * 10 + text.charAt(i) - '0';
      }
    }
/*
    for(int i = 0; i < list.size(); i++) {
      combinationNumber = (combinationNumber*10) + list.get(i);
    }*/

    int count = 0;
    for (int i = 1; i <= combinationNumber; i++) {
      if(combinationNumber % i == 0){
        count++;
      }
    }

    System.out.println("추출된 자연수는"+combinationNumber+"이고"+combinationNumber+"의 약수의 개수는"+count+"개입니다");
    System.out.println("Clear");
  }
}

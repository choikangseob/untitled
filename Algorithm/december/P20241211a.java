package Algorithm.december;

import java.util.ArrayList;
import java.util.Scanner;

public class P20241211a {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    ArrayList<Integer> list = new ArrayList<>();

    System.out.println("n명의 학생수를 정하세요");
    int n = sc.nextInt();
    System.out.println(n+"명 학생의 수학점수를 입력하세요");

    int sum = 0;
    for (int i = 0; i < n; i++) {
      list.add(sc.nextInt());

      sum += list.get(i);
    }
    double avg = (double) sum / n;

    double roundNumber =  Math.round(avg);

    int closetStudentIndex = 0;
    double mindiff = Math.abs(roundNumber - list.get(0));
    for (int i = 1; i < n; i++) {

      double diff = Math.abs(roundNumber- list.get(i));

    if(diff<mindiff ||
      (diff==mindiff && list.get(i)>list.get(closetStudentIndex))||
      (diff==mindiff && list.get(i)== list.get(closetStudentIndex)&& closetStudentIndex>i)) {
      mindiff = diff;
      closetStudentIndex = i;
    }
    }
    System.out.println("첫줄의 평균은"+roundNumber);
    System.out.println("평균에 가장 가까운 학생은"+(closetStudentIndex+1));
  }
}

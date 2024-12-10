package Algorithm;

import java.util.ArrayList;
import java.util.Scanner;

public class P20241210a {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.println("5<=n<=500사이의 입력값 n개를 입력하시오");
    int n = sc.nextInt();

    ArrayList<Integer> list = new ArrayList<Integer>();
    ArrayList<Integer> list2 = new ArrayList<Integer>();

    for(int i = 0 ; i < n ; i++){
      System.out.println((i+1)+"번째 숫자를 입력하시오");
      list.add(sc.nextInt());
      if(i==n){
        System.out.println(n+"개를 다 입력했습니다");
      }
    }
    System.out.println("입력한 수중 S번쨰부터 E번째까지의 수를 오름 차순 정렬 할건데 S,E를 입력하시오 S<E<=n입니다");
    System.out.println("S를 입력하시오");
    int s = sc.nextInt();
    System.out.println("E를 입력하시오");
    int e = sc.nextInt();
    int save = 0;
    for(int a = s; a <e ;a++){
      if(list.get(a-1)<list.get(a)){
        list2.add(list.get(a-1));
        if(a+1==e){
          list2.add(list.get(a));
          break;
        }
      }else if(list.get(a-1)>list.get(a)){
        save= list.get(a-1);
        list.set(a-1,list.get(a));
        list2.add(list.get(a));
        list.set(a,save);
      }

    }
    System.out.println("오름차순 정렬시킨"+(e-s+1)+"개중 k번째의 숫자를 보여드립니다 k를 입력하세요");
    int k = sc.nextInt();

    System.out.println(list2.get(k-1));
  }
}

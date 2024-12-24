package Algorithm.december;

import java.util.ArrayList;
import java.util.Scanner;

public class P20241223 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    ArrayList<Integer> list = new ArrayList<>();
    ArrayList<Integer> list1 = new ArrayList<>();
    ArrayList<Integer> list2 = new ArrayList<>();

    System.out.println("첫번째 리스트의 크기N를 입력하시오");
    int n = sc.nextInt();
    System.out.println("N개의 원소를 입력하시오");
    for (int i = 0; i < n; i++) {
      list.add(sc.nextInt());
    //  list2.add(list.get(i));
    }
    System.out.println("두번째 리스트의 크기M를 입력하시오");
    int m = sc.nextInt();
    System.out.println("N개의 원소를 입력하시오");
    for (int i = 0; i < m; i++) {
      list1.add(sc.nextInt());

     // list2.add(list1.get(i));
    }
    int i = 0;
    int j = 0;
    int a = 0;
    int b = 0;
    int c = 0;
    if(list.size()<=list1.size()){
      a= list.size(); b=list1.size();
    }else{
      a= list1.size(); b=list.size();
    }
    while(true) {
      if (list.get(i) <= list1.get(j)) {
        list2.add(list.get(i));
        i++;
      } else {
        list2.add(list1.get(j));
        j++;
      }
      if(i>=a||j>=a) break;
    }
    if(i<j){
      c=i;
    }else if(j<i){
      c=j;
    }else{
      c=i-1;
    }
    for(c=c;c<b;c++) {
      if (list.size() < list1.size()) {
        list2.add(list1.get(c));
      } else if (list.size() > list1.size()) {
        list2.add(list.get(c));
      }else{
        if(list.get(c)>=list1.get(c)){
          list2.add(list.get(c));
        }else{
          list2.add(list1.get(c));
        }
      }
    }
    for(i=0;i<list2.size();i++){
      System.out.println(list2.get(i));
    }







/*    int min = list2.get(0);
    int saveMinNumber = 0;
    int saveNumber = 0;
    for (int i = 0; i < list2.size(); i++) {
      for (int j = 1; j < list2.size(); j++) {
        if (list2.get(j - 1) > list2.get(j)) {

          saveNumber = list2.get(j-1);
          list2.set(j - 1, list2.get(j));
          list2.set(j, saveNumber);
        }
      }
      if(min>list2.get(i)){
        saveMinNumber = min;
        list2.set(i-1,list2.get(i));
        list2.set(i,saveMinNumber);
      }
    }
    for (int i = 0; i < list2.size(); i++) {
      System.out.println(list2.get(i));
    }*/
  }
}

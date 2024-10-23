import java.util.ArrayList;
import java.util.Scanner;

public class submit8 {
  public static void main(String[] args) {

    ArrayList<String> str = new ArrayList<>();
    ArrayList<String> str1 = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    System.out.println("문자를 입력하세요 입력한뒤에 거꾸로 출력됩니다");
    str.add(sc.nextLine());

    String a = str.get(0);

    for(int i = 0; i<a.length();i++){
      str1.add(a.substring(i, i+1));
    }
    for(int i =str1.size()-1; i>=0;i--){
      System.out.print(str1.get(i));
    }

  }
}

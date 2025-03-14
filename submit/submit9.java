package submit;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class submit9 {

  public static void main(String[] args) {
    ArrayList<Integer> numbers = new ArrayList<>();
    HashSet<Integer> uniqueNums = new HashSet<>();
    HashSet<Integer> duplicates = new HashSet<>();

    Scanner sc = new Scanner(System.in);
    System.out.println("입력할 숫자의 개수를 정하세요:");
    int n = sc.nextInt();


    for (int i = 0; i < n; i++) {
      System.out.print((i + 1) + "번째 수를 입력하세요: ");
      int num = sc.nextInt();


      if (!uniqueNums.add(num)) {
        duplicates.add(num);
      }
    }


    int sum = 0;
    for (int num : uniqueNums) {
      if (!duplicates.contains(num)) { 
        sum += num;
      }
    }

    System.out.println("중복되지 않은 수들의 합: " + sum);
  }
}

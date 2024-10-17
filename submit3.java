import java.util.Scanner;

public class submit3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int A = sc.nextInt();
    int B = sc.nextInt();
    int C = sc.nextInt();
    if(2<=A && 2<=B && 2<=C && A<=10000 && B<=10000 && C<=10000) {
      int answer = (A+B) % C;
      int answer2 = (A%C + B%C)%C;
      int answer3 = (A*B)%C;
      int answer4 = ((A%C)*(B%C))%C;
      System.out.println(answer);
      System.out.println(answer2);
      System.out.println(answer3);
      System.out.println(answer4);
    }


  }
}

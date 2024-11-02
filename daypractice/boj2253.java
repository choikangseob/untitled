package daypractice;

public class boj2253 {

  public static void main(String[] args) {
    System.out.println("2부터 1000까지의 수 중 소수만 찍어낼 것입니다");

    for (int i = 2; i <= 1000; i++) {
      for(int j = 1; j <= i; j++) {
        if(i == 2){
          System.out.println(i+"는 소수입니다");
          break;
        }

        if(i%j==0 && i!=2 && j!=1 ){
          if(i!=j){
            break;
          }else{
            System.out.println(i+"는 소수입니다");
          }

        }
      }
    }
  }
}

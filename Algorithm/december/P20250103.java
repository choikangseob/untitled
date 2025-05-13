package Algorithm.december;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class P20250103 {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int n = 9;
    int[][] arr = new int[n][n];

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        arr[i][j] = sc.nextInt();
      }
    }

    int count1 = 0; int count2 = 0; int count3 = 0; int count4 = 0;
    int count5 = 0; int count6 = 0; int count7 = 0; int count8 = 0; int count9 = 0;
    int cnt1 =0; int cnt2 = 0; int cnt3 = 0; int cnt4 = 0; int cnt5 = 0;
    int cnt6 = 0; int cnt7 = 0; int cnt8 = 0; int cnt9 = 0;
    int cont1 =0; int cont2=0; int cont3=0; int cont4=0; int cont5=0;
    int cont6=0; int cont7=0; int cont8=0; int cont9=0;
    int row=0; int col =0; int nn = 0;
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        if (arr[i][j] == 1) {
          count1++;
        }else if (arr[i][j] == 2) {
          count2++;
        }else if (arr[i][j] == 3) {
          count3++;
        }else if (arr[i][j] == 4) {
          count4++;
        }else if (arr[i][j] == 5) {
          count5++;
        }else if (arr[i][j] == 6) {
          count6++;
        }else if (arr[i][j] == 7) {
          count7++;
        }else if (arr[i][j] == 8) {
          count8++;
        }else{
          count9++;
        }

        if(arr[j][i] == 1 ){
          cnt1++;
        }else if(arr[j][i] == 2 ){
          cnt2++;
        }else if(arr[j][i] == 3 ){
          cnt3++;
        }else if(arr[j][i] == 4 ){
          cnt4++;
        }else if(arr[j][i] == 5 ){
          cnt5++;
        }else if(arr[j][i] == 6 ){
          cnt6++;
        }else if(arr[j][i] == 7 ){
          cnt7++;
        }else if(arr[j][i] == 8 ){
          cnt8++;
        }else if(arr[j][i] == 9 ){
          cnt9++;
        }
      }
      if (count1 == 1 && count2 == 1 && count3 == 1 && count4 == 1 &&
        count5 == 1 && count6 == 1 && count7 == 1 && count8 == 1 && count9 == 1) {
        row++;
      }
      if (cnt1 == 1 && cnt2 == 1 && cnt3 == 1 && cnt4 == 1 && cnt5 == 1 &&
        cnt6 == 1 && cnt7 == 1 && cnt8 == 1 && cnt9 == 1) {
        col++;
      }
      count1 = 0;count2 = 0;count3 = 0;count4 = 0;count5 = 0;count6 = 0;count7 = 0;
      count8 = 0;count9 = 0;
      cnt1 =0; cnt2 = 0; cnt3 = 0; cnt4 = 0; cnt5 = 0;cnt6 = 0;cnt7 = 0;cnt8 = 0;
      cnt9 = 0;
    }
    for (int rw = 0; rw < 9; rw += 3) {
      for (int cl = 0; cl < 9; cl += 3){

        for(int i = 0;i < 3; i++){
          for(int j = 0;j < 3; j++){
            if(arr[rw+i][cl+j]==1){
              cont1++;
            }else if (arr[rw+i][cl+j]==2){
              cont2++;
            }else if (arr[rw+i][cl+j]==3){
              cont3++;
            }else if (arr[rw+i][cl+j]==4){
              cont4++;
            }else if (arr[rw+i][cl+j]==5) {
              cont5++;
            }else if (arr[rw+i][cl+j]==6) {
              cont6++;
            }else if (arr[rw+i][cl+j]==7) {
              cont7++;
            }else if (arr[rw+i][cl+j]==8) {
              cont8++;
            }else{
              cont9++;
            }
          }
        }
        if (cont1 == 1 && cont2 == 1 && cont3 == 1 && cont4 == 1 && cont5 == 1 &&
          cont6 == 1 && cont7 == 1 && cont8 == 1 && cont9 == 1) {
          nn++;
        }
        cont1 = 0;cont2 = 0;cont3 = 0;cont4 = 0;cont5 = 0;cont6 = 0;cont7 = 0;
        cont8 = 0;cont9 = 0;
      }

    }
    if(row == 9 && col == 9 && nn==9){
      System.out.println("yes");
    }else{
      System.out.println("no");
    }
    System.out.println("Clear");
  }

}

package day0308;

import java.util.Scanner;

public class StarPrinter03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("3번문제");
        System.out.println("출력할 줄 수를 입력해주세요.");
        int userNumber = scanner.nextInt();

        for (int i = 1; i <= userNumber; i++) {
            String stars = new String();
            
            // 공백을 담당하는 j for 문
            for (int j = 1; j <= userNumber - i; j++) {
                
                stars += " ";
            }

            // 별을 담당하는 j for 문
            for (int j = 1; j <= i; j++) {
                stars += "*";
            }
            
//          for (int k = userNumber - 1; k >= i - 1; k--) {
            
//          for (int j = 1; j <= userNumber; j++) {
//          stars += "*";

            System.out.println(stars);

            
//          for(int j=userNumber;j>0;j--) {
//          if(i<j) {
//              System.out.println(" ");
//          }else {
//              System.out.println("*");
//          }
//      }
        }

        scanner.close();

    }

}

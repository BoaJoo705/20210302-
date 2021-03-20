package day0308;

import java.util.Scanner;

public class StarPrinter05 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("별찍기 5번문제");
        System.out.println("출력할 줄 수를 입력하시오");
        int userNumber = scanner.nextInt();

        for (int i = 1; i <= userNumber; i++) {
            String stars = new String();

            // 공백을 담당하는 j for 문
            for (int j = 1; j <= userNumber - i; j++) {

                stars += " ";// stars = stars+" ";
                // userNumber가 5, i 가 1일 경우
                // for(j = 1; j <= 5-1; j++)
                // stars -> "";
                // j:1 -> stars = ""+" "; -> stars = " ";
                // j:2 -> stars = " "+" ";-> stars = "  ";
                // j:3 -> stars = "  "+" " -> stars = "   ";
                // j:4 -> stars = "   "+" " -> stars = "    ";
            }

            // 별을 담당하는 j for 문
            for (int j =1; j<=2*i-1; j++) {
                stars+="*";
            }

            System.out.println(stars);

        }

        scanner.close();
    }
}

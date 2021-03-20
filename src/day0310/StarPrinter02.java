package day0310;

import java.util.Scanner;

public class StarPrinter02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("2번문제");
        System.out.println("출력할 줄 수를 입력해주세요");
        System.out.print("> ");
        int userNumber = scanner.nextInt();

        char[][] stars = new char[userNumber][userNumber];

        for (int i = 0; i < stars.length; i++) {

            for (int j = 0; j >= i; j++) {

                stars[i][j] = '*';

            }

        }
        for (int i = 0; i < stars.length; i++) {
            for (int j = 0; j+2 <= stars[i].length ; j++) {
                System.out.print(stars[i][j]);
                
            }
            System.out.println();

        }

        scanner.close();
    }
}

package day0311;

import java.util.Scanner;

// 별찍기 3번
public class StarPrinter03_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("별찍기 3번");
        System.out.print("> ");
        int userNumber = scanner.nextInt();

        char[][] stars = new char[userNumber][userNumber];

        for (int i = 0; i < stars.length; i++) {
            // 공백을 담당하는 j for문

            for (int j = 0; j < userNumber - (i + 1); j++) {
                stars[i][j] = ' ';
            }
            // 별을 담당하는 j for문
            for (int j = userNumber - (i + 1); j < userNumber; j++) {
                stars[i][j] = '*';
            }

        }
        for (int i = 0; i < stars.length; i++) {
            for (int j = 0; j < stars[i].length; j++) {
                System.out.print(stars[i][j]);

            }
            System.out.println();
            scanner.close();
        }
    }
}
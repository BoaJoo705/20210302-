package day0311;

import java.util.Scanner;

// 별찍기 3번
public class StarPrinter03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("별찍기 3번");
        System.out.print("> ");
        int userNumber = scanner.nextInt();

        char[][] stars = new char[userNumber][userNumber];

        for (int i = 0; i < stars.length; i++) {
            for (int j = 0; j < stars[i].length; j++) {

                // 공백을 담당하는 if
                if (j < userNumber - (i + 1)) {
                    stars[i][j] = ' ';
                } else {
                    // 별을 담당하는 else
                    stars[i][j] = '*';
                    
                }

            }

        }

        scanner.close();
    }
}

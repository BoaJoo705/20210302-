package day0308;
// 별찍기 
import java.util.Scanner;
public class StarPrinter02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("출력할 줄 수를 입력해 주세요");
        System.out.print("> ");
        int userNumber = scanner.nextInt();
        // 출력할 내용을 저장할 char[][]을 만들어보자
        // 사용자가 5라고 입력하면?
        // char가 5개 들어가는 배열이 5개 모인 2차원 배열이 된다.
        char[][] stars = new char[userNumber][userNumber];
        for (int i = 0; i < stars.length; i++) {
            for (int j = 0; j <stars.length-i; j++) {
                stars[i][j] = '*';
            }
        }
        for (int i = 0; i < stars.length; i++) {
            for (int j = 0; j < stars[i].length; j++) {
                System.out.print(stars[i][j]);
            }
            System.out.println();
        }
        scanner.close();
    }
}

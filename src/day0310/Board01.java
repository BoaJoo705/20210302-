package day0310;
// 게시판 프로그램

// 게시글에는 제목, 작성자, 내용이 있다.
// 이 프로그램은 총 6개의 게시글을 관리할 수 있다.
// 단, 중복된 제목의 글은 작성할 수 없다.
// 또한 입력과 출력은 분리되어있다.

import java.util.Scanner;

public class Board01 {
    static final int CONTENTS_SIZE = 3;
    static final int BOARD_SIZE = 6;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] titlesArray = new String[BOARD_SIZE];
        String[] writtersArray = new String[BOARD_SIZE];
        String[] contentsArray = new String[BOARD_SIZE];

        int idx = 0;

        while (true) {
            System.out.println();
            System.out.println("1. 입력  2. 출력  3. 종료");
            System.out.print("> ");
            int userChoice = scanner.nextInt();

            if (userChoice == 1) {
                if (idx < BOARD_SIZE) {
                    scanner.nextLine();
                    System.out.println("제목");
                    System.out.print("> ");
                    titlesArray[idx] = new String(scanner.nextLine());
                    
//                    while() {
//                        System.out.println("중복된 제목입니다");
//                        System.out.println("제목");
//                        System.out.print("> ");
//                        titlesArray[idx] = new String(scanner.nextLine());
//
//                    }
//                    
                    System.out.println("작성자");
                    System.out.print("> ");
                    writtersArray[idx] = new String(scanner.nextLine());

                    System.out.println("내용");
                    System.out.print("> ");
                    contentsArray[idx] = new String(scanner.nextLine());

                    idx++;
                }

            } else if (userChoice == 2) {

                if (idx > 0) {
                    for (int i = 0; i < idx; i++) {
                        System.out.println();
                        System.out.printf("제목: %s \n", titlesArray[i]);
                        System.out.printf("작성자:%s \n ", writtersArray[i]);
                        System.out.printf("내용:%s \n ", contentsArray[i]);
                        System.out.println("==============================");
                        System.out.println();

                    }

                } else {
                    System.out.println();
                    System.out.println("아직 입력된 게시글이 존재하지 않습니다");
                    System.out.println();
                }

            } else if (userChoice == 3) {
                System.out.println("사용해주셔서 감사합니다");
                break;

            }

        }

        scanner.close();
    }
}

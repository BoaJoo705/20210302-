package day0312;
// 입력과 출력을 메소드로 분리해서

// 6명의 학생을 관리하는 프로그램을 작성하시오

import java.util.Scanner;

import util.ScannerUtil;

public class GreadeBook02 {

    static final int STUDENT_SIZE = 6;
    static final int SUBJECT_SIZE = 3;
    static final int SCORE_MIN = 0;
    static final int SCORE_MAX = 100;
    static final int INDEX_KOREAN = 0;
    static final int INDEX_ENGLISH = 1;
    static final int INDEX_MATH = 2;

    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // 번호를 담당하는 배열
            int[] idArray = new int[STUDENT_SIZE];

            // 이름을 담당하는 배열
            String[] nameArray = new String[STUDENT_SIZE];
            // 점수를 담당하는 2차원 배열
            // 각 배열안의 배열이 실제 점수를 저장하는 용도가 된다.
            int[][] scoreArray = new int[STUDENT_SIZE][SUBJECT_SIZE];

            int index = 0;

            while (true) {
                System.out.println();
                System.out.println("1. 입력  2. 출력  3. 종료");
                System.out.print("> ");
                int userChoice = scanner.nextInt();
                System.out.println();


                if (userChoice == 1) {
                    if (index < STUDENT_SIZE) {
                        insert(scanner,index,idArray,nameArray,scoreArray);

                        
                         index++;

                    } else {
                        System.out.println("더 이상 입력하실 수 없습니다.");
                    }
                } else if (userChoice == 2) {
                    if (index > 0) {
                        // 정보 출력하기
                        print(index,idArray,nameArray,scoreArray);
                        
                    } else {
                        System.out.println("아직 입력한 학생이 없습니다");
                    }

                } else if (userChoice == 3) {
                    System.out.println("사용해주셔서 감사합니다");
                    break;
                }
            }scanner.close();

    }

    public static void insert(Scanner scanner, int index, int[] idArray, String[] nameArray, int[][] scoreArray) {
        // 번호 입력
        idArray[index] = ScannerUtil.nextInt(scanner, "번호를 입력해주세요");
        // 이름 입력
        nameArray[index] = ScannerUtil.nextLine(scanner, "이름을 입력해주세요");
        // 국어 입력
        scoreArray[index][INDEX_KOREAN] = ScannerUtil.nextInt(scanner, "국어점수를 입력해주세요", SCORE_MIN, SCORE_MAX);
        // 영어 입력
        scoreArray[index][INDEX_ENGLISH] = ScannerUtil.nextInt(scanner, "영어점수를 입력해주세요", SCORE_MIN, SCORE_MAX);
        // 수학 입력
        scoreArray[index][INDEX_MATH] = ScannerUtil.nextInt(scanner, "수학점수를 입력해주세요", SCORE_MIN, SCORE_MAX);

    }

    public static void print(int index, int[] idArray, String[] nameArray, int[][] scoreArray) {
        for (int i = 0; i < index; i++) {
            System.out.printf("번호: %03d번 이름: %s\n", idArray[i], nameArray[i]);
            System.out.printf("국어: %03d점 영어: %03d점 수학: %03d점\n", scoreArray[i][INDEX_KOREAN],
                    scoreArray[i][INDEX_ENGLISH], scoreArray[i][INDEX_MATH]);
            int sum = scoreArray[i][INDEX_KOREAN] + scoreArray[i][INDEX_ENGLISH] + scoreArray[i][INDEX_MATH];
            double average = (double) sum / SUBJECT_SIZE;
            System.out.printf("총점: %03d점 평균: %06.2f점\n", sum, average);
        }

    }
}
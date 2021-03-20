package day0310;
// 사용자가 입력한 로또 번호와

// 컴퓨터가 만들어낸 로또 번호를 비교하여 
// 사용자 숫자: [##, ##, ##, ##, ##, ##]
// 컴퓨터 숫자: [##, ##, ##, ##, ##, ##]
// 총 맞춘 숫자: ##개
// 등수: #등
// 이 출력되는 프로그램을 작성하시오

import java.util.Random;
import java.util.Scanner;

// 등수기준
// 6개 -1등
// 5개 -2등
// 4개 -3등
// 3개 -4등
// 2개 -5등

public class LottoGame05 {
    static final int SIZE = 6;
    static final int NUMBER_MIN = 1;
    static final int NUMBER_MAX = 45;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int[] lottoNumbers = new int[SIZE];
        int[] randomNumber=new int[SIZE];
        int idx = 0;

        // 사용자 입력
        while (idx < lottoNumbers.length) {
            System.out.printf("%d번 숫자\n", idx + 1);
            System.out.print("> ");
            int userNumber = scanner.nextInt();
            
            while (!(userNumber >= NUMBER_MIN && userNumber <= NUMBER_MAX)) {
                System.out.println("잘못입력하셨습니다");
                System.out.printf("%d번 숫자\n", idx + 1);
                System.out.print("> ");
                userNumber = scanner.nextInt();

            }
            
            boolean numberChecker = true;

            for (int i = 0; i < lottoNumbers.length; i++) {

                if (userNumber == lottoNumbers[i]) {

                    numberChecker = false;
                    break;

                }

            }
        
            if (numberChecker) {
                lottoNumbers[idx] = userNumber;
                idx++;

            } else {
                System.out.println("중복된 번호입니다.");

            }
            
        }
        
        
        // 컴퓨터 숫자 출력
        while (idx < lottoNumbers.length) {
//            randomNumber[i] = random.nextInt(NUMBER_MAX) + 1;
//            boolean numberChecker = true;
//            for (int i = 0; i < lottoNumbers.length; i++) {
//                if (randomNumber[i] == lottoNumbers[i]) {
//                    numberChecker = false; // 중복인 수
//                    break;// for문도 종료시킨다
//                }
//            }
//            if (numberChecker) {
//                lottoNumbers[idx] = randomNumber[i];
//                idx++;
//
//            }

        

        // 사용자 숫자 컴퓨터 숫자 비교
            int sum=0;
        for(int i =0; i<lottoNumbers.length;i++) {
            if(lottoNumbers[i] == randomNumber[i]) {
                sum++;
            }
        }
     // 맞춘 숫자 출력 및 등수 출력
        
        //맞춘숫자
        
        
        
        // 등수출력
        switch(sum) {
        case 6:
            System.out.println("1등입니다");
            break;
        case 5:
            System.out.println("2등입니다");
        case 4:
            System.out.println("3등입니다");
        case 3:
            System.out.println("2등입니다");
        case 2:
            System.out.println("1등입니다");
        
        }
        
        
        
        }
        
        
        
        
        scanner.close();

    }
}

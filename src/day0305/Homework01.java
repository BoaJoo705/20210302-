package day0305;
// bmi checker를

// 입력과 출력을 나눈 메뉴 버젼으로 고치시오

import java.util.Scanner;

public class Homework01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 키 ,몸무게, 입력스위치 변수 선언 및 초기화

        double height = 0;
        double weight = 0;

        boolean inputSwitch = false;

        while (true) {

            System.out.println(" 1. 키 몸무게 입력 ");
            System.out.println(" 2. 결과 확인 ");
            System.out.println(" 3. 종료 ");
            System.out.print("> ");
            int userChoice = scanner.nextInt();

            if (userChoice == 1) {
                // 키 몸무게 입력 코드 구현

                // 1. 키 입력
                System.out.println("키를 m단위로 입력해주세요");
                System.out.print("> ");
                height = scanner.nextDouble();

                // 2. 키 검증
                while (!(height > 0 && height <= 2.82)) { // (height <=0 || height>2.82)
                    System.out.println("잘못입력하였습니다");
                    System.out.println("키를 m단위로 입력해주세요");
                    System.out.print("> ");
                    height = scanner.nextDouble();
                }

                // 3. 몸무게 입력
                System.out.println("몸무게를 kg단위로 입력해주세요");
                System.out.print("> ");
                weight = scanner.nextDouble();

                // 4. 몸무게 검증
                while (!(weight > 0 && weight <= 635)) {
                    System.out.println("잘못입력하였습니다");
                    System.out.println("몸무게를 kg단위로 입력해주세요");
                    System.out.print("> ");
                    weight = scanner.nextDouble();
                }

                // 5. 입력스위치 true로 변경
                inputSwitch = true;

            } else if (userChoice == 2) {
                // 출력 코드 구현

                if (inputSwitch) {
                    double bmi = weight / height / height;

                    System.out.printf("bmi: %.2f\n", bmi);

                    if (bmi < 18.5) {
                        System.out.println("저체중");
                    } else if (bmi < 23) {
                        System.out.println("정상체중");
                    } else if (bmi < 25) {
                        System.out.println("과체중");
                    } else {
                        System.out.println("비만");
                    }

                } else {
                    System.out.println("아직 키와 몸무게를 입력하지 않았습니다");
                }

            } else if (userChoice == 3) {
                // 메시지 출력 후 종료
                System.out.println("사용해주셔서 감사합니다.");
                break;
            }

        }
        scanner.close();
    }
}

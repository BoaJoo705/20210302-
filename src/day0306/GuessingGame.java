package day0306;

import java.util.Random;
import java.util.Scanner;

// 숫자 맞추기 게임

// 1. 플레이 기능
//      플레이 기능에서는 컴퓨터가 1~100 사이의 랜덤한 숫자를 하나 뽑고
//      사용자가 그 숫자를 맞추는 기능이 구현되어 있다.
//      사용자가 컴퓨터가 뽑은 숫자를 맞출 때까지 계속 입력을 하되 
//      사용자의 숫자가 더 클 경우에는 DOWN 이라는 메시지가 출력이 되고 
//      사용자의 숫자가 더 작을 경우에는 UP 이라는 메시지가 출력이 된다.
//      사용자가 입력하는 숫자는 1~100을 벗어날 수 없다.
//      또한, 사용자가 입력 할때마다 점수가 1씩 추가 되서
//      결국 몇번만에 맞췄는지 점수가 나오고 
//      해당 점수가 최고기록보다 작으면, 그 점수가 새로운 최고 기록이 된다.
// 2. 최고기록 보기 기능
//      현재까지 플레이한 기록 중 가장 최고 기록을 보여준다.
//      단, 사용자가 플레이 했던 기록이 없을 경우, "아직 플레이 기록이 없습니다" 라는 간단한 메시지만 출력해 준다.

// 3. 종료 기능
//      프로그램을 종료시킨다.

public class GuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();


        // 변수 선언 및 초기화
        int number = 0;
        int score = 0;

        boolean inputSwitch = false;

        while (true) {

            System.out.println(" 1. 플레이 ");
            System.out.println(" 2. 최고기록 보기 ");
            System.out.println(" 3. 종료 ");
            System.out.print("> ");
            int userChoice = scanner.nextInt();

            if (userChoice == 1) {
                
                System.out.println(random.nextInt(101));

                // 플레이 기능 코드 구현
                // 1. 숫자입력
                System.out.println("숫자를 넣으세요");
                System.out.print("> ");
                number = scanner.nextInt();

                if (!(random.nextInt() == number)) {

                    while (number < random.nextInt()) {
                        System.out.println("UP");
                        System.out.println("score:" + score++);
                        number = scanner.nextInt();
                    }

                    while (number > random.nextInt()) {
                        System.out.println("DOWN");
                        System.out.println("score:" + score++);
                        number = scanner.nextInt();
                    }
                    
                    while(!(number >=1 && number <= 100)) {
                        System.out.println("1~100까지의 숫자를 넣어주세요");
                        number = scanner.nextInt();
                    }

                } else {
                    System.out.println("본인의 점수:" + score);
                }
                inputSwitch = true;

            } else if (userChoice == 2) {

                if (inputSwitch) {
                    System.out.println("최고기록: ");

                } else {
                    System.out.println("아직 플레이 기록이 없습니다");
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

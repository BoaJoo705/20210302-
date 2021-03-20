package day0311;

import java.util.Random;
import java.util.Scanner;

// 로또 게임 최종판

// 사용자로부터 몇번을 할건지 입력을 받고
// 그리고 각 게임을 수동으로 할지 자동으로 할지 입력 받아서 
// 최종적으로 컴퓨터의 숫자와 대비하여 각 게임의 맞춘 갯수 등수를 출력하게 만드시오

// 예시
// 몇번 플레이하시겠습니까? 5번
// 1번 게임을 수동/자동 중 어떤걸로 하시겠습니까?(1: 수동 2: 자동)
// 2 
// 2번 게임을 수동/자동 중 어떤걸로 하시겠습니까?(1: 수동 2: 자동)
// 1
// 첫번째 숫자를 입력해주세요: 33
//              ....
// 5번 게임을 수동/자동 중 어떤걸로 하시겠습니까?(1: 수동 2: 자동)
// 2
// 컴퓨터의 숫자: [##, ##, ##, ##, ##, ##]
// 사용자의 숫자
// 1번 게임: [##, ##, ##, ##, ##, ##] - 4개 3등
// 1번 게임: [##, ##, ##, ##, ##, ##] - 5개 2등
// 1번 게임: [##, ##, ##, ##, ##, ##] - 6개 1등
// 1번 게임: [##, ##, ##, ##, ##, ##] - 3개 4등
// 1번 게임: [##, ##, ##, ##, ##, ##] - 0개 등수없음

public class LottoGame {
    static final int NUMBER_SIZE = 6;
    static final int NUMBER_MIN = 1;
    static final int NUMBER_MAX = 45;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        
        // 컴퓨터 숫자 추첨
        // 컴퓨터의 숫자를 저장할 int[] computerArray 만들기
        int[] computerArray = new int[NUMBER_SIZE];
        
        // 현재 computerArray의 몇번 인덱스에 값을 저장할지를 할당한 int 변수 index
        int index =0;
        
        // index 변수의 할당된 값이 SIZE 보다 작은 동안,
        // while을 이용하여 computerArray의 index번 인덱스에 random이 생성한 숫자를 
        // 기존 배열에 없을 때에만 추가하고 index의 값을 1증가시킨다.
        
        
        // 사용자가 총 몇게임 할지 입력 받는다.
        
        // 사용자가 입력한 게임 숫자에 따라서 수동 혹은 자동을 선택하게 하고
        // 그거에 맞춰서 숫자를 배분한다.
        
        // 컴퓨터의 숫자와
        // 사용자의 게임내역을 비교해서
        // 맞춘갯수 + 등수 까지, 보여준다.
        
        int[] userArray = new int[NUMBER_SIZE];
        
     // index 변수의 할당된 값이 SIZE 보다 작은 동안,
        // while을 이용하여 computerArray의 index번 인덱스에 random이 생성한 숫자를 
        // 기존 배열에 없을 때에만 추가하고 index의 값을 1증가시킨다.
        
        System.out.println("몇번 플레이하시겠습니까?");
        int playNumber = scanner.nextInt();

        System.out.println("1번 게임을 수동/자동 중 어떤걸로 하시겠습니까?(1: 수동  2: 자동)?");
        int manualAuto = scanner.nextInt();

        for (int i = 0; i < playNumber; i++) {

            if (manualAuto == 1) {
                for (int j = 0; j < playNumber; j++) {

                    System.out.println((j + 1) + "번째 숫자를 입력해주세요");
                    int userNumber = scanner.nextInt();

                    boolean inputChecker = true;

                    while (!(userNumber >= NUMBER_MIN && userNumber <= NUMBER_MAX)) {
                        System.out.println("잘못된 값입니다.");
                        System.out.println((j + 1) + "번째 숫자");
                        System.out.println("> ");
                        userNumber = scanner.nextInt();

                        for (int k = 0; k < userArray.length; k++) {
                            if (userNumber == userArray[k]) {
                                inputChecker = false;
                                break;
                            }
                        }
                    }

                }
            } else if (manualAuto == 2) {

                while (index < NUMBER_SIZE) {
                    int randomUserNumber = random.nextInt(6) + 1;

                    boolean numberChecker = true;

                    for (int k = 0; k < computerArray.length; k++) {
                        if (randomUserNumber == computerArray[k]) {
                            numberChecker = false;
                            break;
                        }
                    }

                    if (numberChecker) {
                        computerArray[index] = randomUserNumber;
                        index++;

                    }

                }
            }

        }

        scanner.close();
    }

}

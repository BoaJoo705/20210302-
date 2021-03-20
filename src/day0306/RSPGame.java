package day0306;

import java.util.Random;
import java.util.Scanner;

// 가위바위보 게임
// 사용자가 1은 가위, 2는 바위, 3은 보 로 해서 
// 컴퓨터와 가위바위보 게임을 한다. 

// 1. 플레이
//      사용자가 1~3 사이의 숫자를 고르고
//      컴퓨터가 1~3 사이의 숫자를 고르고 나서 
//      결과를 확인해서
//      승리, 무승부, 패배 3가지 중 하나를 정해서 
//      기록한다.

// 2. 출력
//      출력은 플레이 기록이 존재할 경우
//      ###전 ###승 ###무 ###패(승률: ##.###%)
//      printf 에서는 %를 "출력"해줄때 즉, %문자가 아니라 글자 %를 출력할 때에는 %%라고 적어주면 된다! 

// 3. 종료

// 이 세가지 기능을 가지고 있는 가위바위보 게임을 만들어보세요

public class RSPGame {
    static final int NUMBER_MIN = 1;
    static final int NUMBER_MAX = 3;
        public static void main(String []args) {
        Scanner scanner= new Scanner(System.in);
        Random random= new Random();
        
        // 1은 가위, 2는 바위, 3은 보
        int 가위 =1;
        int 바위=2;
        int 보=3;
        
        
        while(true) {
            System.out.println();
            System.out.println("1. 플레이");
            System.out.println("2. 출력");
            System.out.println("3. 종료");
            System.out.println();
            System.out.print("> ");
            int userChoice =scanner.nextInt();
            
            if(userChoice==1) {
             // 플레이 코드 구현
             // 1. 사용자의 입력
                System.out.println();
                System.out.println("1.가위 2.바위 3.보 1~3중 하나를 입력해주세요");
                System.out.print("> ");
                int userNumber=scanner.nextInt();
                
                // 2. 컴퓨터 결정 
                int computerNumber= random.nextInt(NUMBER_MAX)+1;
                
                while (!(userNumber >= NUMBER_MIN && userNumber <= NUMBER_MAX)) {
                    System.out.println("잘못 입력하셨습니다");
                    System.out.println("1~3까지의 숫자를 입력해주세요");
                    userNumber = scanner.nextInt();
                }
                
                while(computerNumber == userNumber) {
                    System.out.println("무승부");
                    userNumber=scanner.nextInt();
                }
                
                while(computerNumber != userNumber) {
                    if((computerNumber==3 && userNumber==1)||(computerNumber==2 && userNumber==3)||(computerNumber==1 && userNumber==2)) {
                        System.out.println("승리");
                        //31승
                        //32패
                        //21패
                        //13패
                        //23승
                        //12승
                    }else if((computerNumber==3 && userNumber==2)||(computerNumber==2 && userNumber==1)||(computerNumber==1 && userNumber==3)) {
                        System.out.println("패배");
                    }

                }
                
                
                
            }else if (userChoice==2) {
                
            }else if(userChoice==3) {
                System.out.println("플레이 해주셔서 감사합니다!");
                break;
                
            }
            
        }
        
        
        
        
        scanner.close();
        
        }
}

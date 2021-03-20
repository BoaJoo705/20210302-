package day0305;
// 사용자로부터 성별, 나이, 신체등급순으로 입력받아서 

// 남성이고 19세 이상일시
// 1~3: 현역
// 4: 공익
// 그외: 면제가 출력되는 프로그램을 작성하시오
// 단 성별을 입력받을 때에는 숫자값으로 입력을 받아서 1이면 남자 2면 여자로 판정하도록 하겠습니다.

import java.util.Scanner;

// 단, 여성일 시에는 추가적인 정보 입력 없이
// "여성에게는 국방의 의무가 부여되지 않습니다" 라는 메세지만 출력되게 하세요

// 남자이지만 미성년자일 경우
// "아직 신체등급이 부여되지 않았습니다." 라는 메세지만 출력되게 하세요(20분)

public class Ex02CategoryCheck {
    public static void main(String []args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("성별입력");
        System.out.print("> ");
        int gender =scanner.nextInt();
        
        
        if (gender==1 ) {
            System.out.println("남자");
            System.out.println("나이입력");
            System.out.print("> ");
            int age = scanner.nextInt();
            
            if(age>=19) {
                System.out.println("신체등급 입력");
                System.out.print("> ");
                int number= scanner.nextInt();
                
                
                if (number<=3) {
                System.out.println("현역");
                }else if(number<=4) {
                System.out.println("공익");
                }else if (number>4) {
                System.out.println("면제");
                }
            }else {
            System.out.println("아직 신체등급이 부여되지 않았습니다.");
            }
            
          }else {
               System.out.println("여성에게는 국방의 의무가 부여되지 않습니다.");
          }
        scanner.close();
}
}

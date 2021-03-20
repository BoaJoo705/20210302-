package day0306;

import java.util.Scanner;

// 1. 1~10까지 차례대로 출력하시오
// 2. 15~3까지 차례대로 출력하시오
// 3. 1~20까지 짝수만 출력하시오
// 4. 사용자로부터 숫자를 입력 받아서 1부터 그수까지 출력하시오
// 5. 사용자로부터 2개의 숫자를 입력받아서 더 작은 숫자부터 더 큰 숫자까지를 차례대로 출력하시오
// 6. 사용자로부터 숫자를 입력 받아서 1부터 그 수까지의 합을 출력하시오
// 7. 사용자로부터 숫자를 입력 받아서 1부터 그 수까지의 곱을 출력하시오
public class Ex02ForLoop02 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println();
        System.out.println("1번문제");
        System.out.println();
        
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        System.out.println("2번문제");
        for (int i = 15; i <= 3; i--) {
            System.out.println(i);
        }
        
       
        System.out.println("3번문제");
        for (int i = 2; i <= 20; i += 2)
            
        System.out.println(i);

        System.out.println("4번문제");
        int start =1;
        int number =scanner.nextInt();

        for (int i =start; i<=number; i++) {
            System.out.println(i);
        }
        
        System.out.println("5번문제");
        int first=scanner.nextInt();
        int second=scanner.nextInt();
         for(int i=first; i<=second; i++) {
             System.out.println(i);
         }
         
         System.out.println("6번문제");
         int usernumber=scanner.nextInt();
         for (int i=1; i<=usernumber;i++) {
             System.out.println(i+usernumber);
         }
        
         System.out.println("7번문제");
         int j =scanner.nextInt();
         for (int i=1; i<=usernumber;i++) {
             System.out.println(i*j);
         }
        
        
        
    }
}

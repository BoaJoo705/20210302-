package day0309;
// 로또 게임

// 사용자로부터 숫자 6개를 입력 받아서

// 정렬하여 출력하시오

// 단, 사용자가 잘못된 숫자 혹은 중복된 숫자를 입력하면
// 올바른 숫자를 입력할 때 까지 다시 입력을 받도록 하세요.
import java.util.Scanner;

public class LottoGame04 {
    static final int SIZE = 6;
    static final int NUMBER_MAX = 45;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 배열생성
        int[] lottoNumbers = new int[SIZE];

        // 입력 받기
        for (int i = 0; i < lottoNumbers.length; i++) {
            System.out.println("숫자를 입력하세요(6개)");

            lottoNumbers[i] = scanner.nextInt();

            while (!(lottoNumbers[i] > 0 && lottoNumbers[i] <= NUMBER_MAX)) {

                System.out.println("1~45 숫자를 입력해주세요");
                lottoNumbers[i] = scanner.nextInt();

            }

        }

        // lottoNumber의 숫자를 정렬
        for (int i = 0; i < lottoNumbers.length - 1; i++) {

            if (lottoNumbers[i] > lottoNumbers[i + 1]) {

                int temp = lottoNumbers[i];

                lottoNumbers[i] = lottoNumbers[i + 1];

                lottoNumbers[i + 1] = temp;

                i = -1;

            }

        }
        // 입력받은거 출력
        for (int i = 0; i < lottoNumbers.length; i++) {
            System.out.printf("lottoNumbers[%d]: [%2d]\n", i, lottoNumbers[i]);
        }

        scanner.close();

    }

}

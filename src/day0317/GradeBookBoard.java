package day0317;
// 내가 한것
import java.util.ArrayList;
import java.util.Scanner;
import day0317.Board;
import util.ScannerUtil;
import day0317.Board;

public class GradeBookBoard {

    // 제목을 저장할 ArrayList 객체 list
    private static ArrayList<Board> list = new ArrayList<>();
    // 입력을 처리해줄 Scanner 객체 scanner
    private static Scanner scanner = new Scanner(System.in);

    // 메인메소드
    public static void main(String[] args) {
        showMenu();
    }

    // 메뉴 메소드
    private static void showMenu() {
        while (true) {
            System.out.println("============================");
            System.out.println("            게시글            ");
            System.out.println("============================");
            String message = new String("1. 입력  2. 게시글 보기  3. 종료 ");
            int userChoice = ScannerUtil.nextInt(scanner, message, 1, 3);

            if (userChoice == 1) {
                // 게시글 입력 메소드
                insert();
            } else if (userChoice == 2) {
                // 게시글 보기 메소드
                printAll();
            } else if (userChoice == 3) {
                // 종료
                System.out.println();
                System.out.println("사용해주셔서 감사합니다");
                break;
            }
        }
    }

    // 입력 메소드
    public static void insert() {
        // 리스트에 추가할 Board 객체 생성
        Board b = new Board();

        // 객체에 정보 입력
        String message = new String("제목을 입력해주세요");
        b.setTitle(ScannerUtil.nextLine(scanner, message));
        message = new String("작성자를 입력해주세요");
        b.setWriter(ScannerUtil.nextLine(scanner, message));
        message = new String("내용을 입력해주세요");
        b.setContent(ScannerUtil.nextLine(scanner, message));

        // 정보가 입력된 객체를 list에 추가
        list.add(b);

    }

    // 출력 메소드
    private static void printAll() {
        while (true) {
            if (list.size() == 0) {
                System.out.println();
                System.out.println("아직 입력된 게시글이 없습니다.");
                System.out.println();
                break;
            }
            System.out.println();
            for (int i = 0; i < list.size(); i++) {
                System.out.printf("%d. %s\n %s\n %s\n", i + 1, list.get(i).getTitle());
            }
            String message = new String("개별 보기할 게시글 번호를 선택해주세요. 뒤로가기는 0을 입력해주세요");
            int userChoice = ScannerUtil.nextInt(scanner, message, 0, list.size()) - 1;

            if (userChoice == -1) {
                System.out.println();
                System.out.println("메뉴로 돌아갑니다");
                System.out.println();
                break;
            } else {

                // 개별보기 메소드
                printOne(userChoice);

            }

        }
    }

    // 개별 보기 메소드
    private static void printOne(int index) {
        // list.get(index).showInfo();

    }

//    public void showInfo() {
//        System.out.printf("게시글 제목: %s \n  작성자: %s  \n    내용: %s   \n", list.get(0), writer, content);
//    }

}

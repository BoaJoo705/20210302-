package day0319;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;
import util.ScannerUtil;

public class StudentProgram {

    private final static ArrayList<Student> studentList = new ArrayList<>();

    private final static ArrayList<Teacher> teacherList = new ArrayList<>();

    private final static ArrayList<Evaluation> evaluationList = new ArrayList<>();

    private final static Scanner scanner = new Scanner(System.in);

    private static int studentId = 1;

    private static int teacherId = 1;

    private static int evaluationId = 1;

    private static Student LogIn1 = null;

    private static Teacher LogIn2 = null;

    public static void main(String[] args) {

    }

    // 메소드

    // index() 메소드
    private static void index() {
        while (true) {
            System.out.println("==========================");
            System.out.println("       학생 관리 프로그램      ");
            System.out.println("==========================");
            String message = new String("1. 로그인   2. 회원가입  3.종료");
            int userChoice = ScannerUtil.nextInt(scanner, message);
            if (userChoice == 1) {
                if (studentList.isEmpty() || teacherList.isEmpty()) {
                    System.out.println();
                    System.out.println("아직 등록된 회원이 없습니다.");
                    System.out.println();

                } else {
                    // 로그인 메소드

                }
            } else if (userChoice == 2) {
                // 회원가입 메소드
            } else if (userChoice == 3) {
                System.out.println("이용해주셔서 감사합니다.");
                System.out.println();
            }
        }
    }

    // 로그인 메소드 실행
    private static void logIn() {
        System.out.println();
        System.out.println("학생인지 선생님인지 선택해주세요.");
        String message = new String("1. 학생  2. 선생님");
        int userChoice = ScannerUtil.nextInt(scanner, message, 1, 2);
        if (userChoice == 1) {
            Student s = new Student();
            message = new String("학생번호를 입력해주세요");
            s.setStudentId(ScannerUtil.nextInt(scanner, message));

            message = new String("비밀번호를 입력해주세요.");
            s.setPassword(ScannerUtil.nextLine(scanner, message));

            LogIn1 = auth(s);

        } else if (userChoice == 2) {
            Teacher t = new Teacher();
            message = new String("선생님번호를 입력해주세요");
            t.setTeacherId(ScannerUtil.nextInt(scanner, message));

            message = new String("비밀번호를 입력해주세요.");
            t.setPassword(ScannerUtil.nextLine(scanner, message));
            LogIn2 = auth(t);

        }

    }

    private static Teacher auth(Teacher t) {
        for (int i = 0; i < teacherList.size(); i++) {
            if (t.logIn(teacherList.get(i))) {
                return teacherList.get(i);
            }
        }
        return null;
    }

    private static Student auth(Student s) {
        for (int i = 0; i < studentList.size(); i++) {
            if (s.logIn(studentList.get(i))) {
                return studentList.get(i);
            }
        }
        return null;
    }

}

package day0319;

import board.User;

public class Student {
    // 필드
    private int studentId;
    
    private String StudentName;
    
    private String password;
    
    private int teamnumber;
    
    private boolean scoreInput;
    
    private int korean;
    
    private int english;
    
    private int math;
    
    // 메소드

    
    
    public int getStudentId() {
        return studentId;
    }
    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }
    

    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
  
    
    
    

    public String getStudentName() {
        return StudentName;
    }
    public void setStudentName(String studentName) {
        StudentName = studentName;
    }
    public int getTeamnumber() {
        return teamnumber;
    }

    public void setTeamnumber(int teamnumber) {
        this.teamnumber = teamnumber;
    }

    public boolean isScoreInput() {
        return scoreInput;
    }

    public void setScoreInput(boolean scoreInput) {
        this.scoreInput = scoreInput;
    }

    public int getKorean() {
        return korean;
    }

    public void setKorean(int korean) {
        this.korean = korean;
    }

    public int getEnglish() {
        return english;
    }

    public void setEnglish(int english) {
        this.english = english;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }
    
    public boolean equals(Object o) {
        if(o instanceof Student) {
            Student s =(Student)o;
            if(studentId==s.studentId) {
                return true;
            }
        }
        return false;
    }
    
    public boolean logIn(Student s) {
        if(StudentName.equals(s.StudentName)&& password.equals(s.password)) {
            return true;
        }
        return false;
    }

    
    
    
}

package day0319;

import board.User;

public class Teacher {
    
    // 필드
    private int teacherId;
    
    private String password;
    
    private String teacherName;
    
    private int teamnumber;

    // 메소드
    
    
    
    
    public int getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }
    
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    
    

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public int getTeamnumber() {
        return teamnumber;
    }

    public void setTeamnumber(int teamnumber) {
        this.teamnumber = teamnumber;
    }

    public boolean logIn(Teacher t) {
        
        if(teacherName.equals(t.teacherName)&& password.equals(t.password)) {
            return true;
        }
        return false;
    }

    public boolean equals(Object o) {
        if(o instanceof Teacher) {
            Teacher u =(Teacher)o;
            if(teacherId==u.teacherId) {
                return true;
            }
        }
        return false;
    }
    

    
    
    
    
}

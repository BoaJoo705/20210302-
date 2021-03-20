package day0319;

import java.util.Calendar;

public class Evaluation {
    // 필드
    private static int evaluationId;
    
    private static int teacherId;
    
    private static int studentId;
    
    private static String content;
    
    private static Calendar writtenDate;
    
    // 메소드

    public static int getEvalNumber() {
        return evaluationId;
    }

    public static void setEvalNumber(int evaluationId) {
        Evaluation.evaluationId = evaluationId;
    }

    public static int getTeacherId() {
        return teacherId;
    }

    public static void setTeacherId(int teacherId) {
        Evaluation.teacherId = teacherId;
    }

    public static int getStudentId() {
        return studentId;
    }

    public static void setStudentId(int studentId) {
        Evaluation.studentId = studentId;
    }

    public static String getContent() {
        return content;
    }

    public static void setContent(String content) {
        Evaluation.content = content;
    }

    public static Calendar getWrittenDate() {
        return writtenDate;
    }

    public static void setWrittenDate(Calendar writtenDate) {
        Evaluation.writtenDate = writtenDate;
    }
    
    
    
    
}

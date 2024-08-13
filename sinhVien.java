package BTNC;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class sinhVien {
    private Map<String,  List<String>> diemMap = new HashMap<>();
    private String xepLoai(int diem ){
        if(diem>=86&&diem<=100){
            return "A";
        }else if (diem>=76&&diem<=85) {
            return "B";
        }else if (diem>=66&&diem<=75){
            return "C";
        }else if (diem>= 51&&diem<=65 ){
            return "D";
        }else{
            return "F";
        }
    }
    public void addStudent(String name , int score){
        String grade = xepLoai(score);
        diemMap.computeIfAbsent(grade, k -> new ArrayList<>()).add(name);
    }
    public void getStudentsByGrade(String grade){
        System.out.println(diemMap.get(grade));
    }
    public void displayAllGrades() {
        for (Map.Entry<String, List<String>> entry : diemMap.entrySet()){
            System.out.println("xep loai "+ entry.getKey() + " co cac sinh vien " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        sinhVien sinhVien = new sinhVien();
        sinhVien.addStudent("ha",80);
        sinhVien.addStudent("huy",75);
        sinhVien.addStudent("nam",40);
        sinhVien.addStudent("duy",90);
        sinhVien.addStudent("hoa",66);
        sinhVien.getStudentsByGrade("A");
        sinhVien.getStudentsByGrade("C");
        sinhVien.displayAllGrades();
    }




}

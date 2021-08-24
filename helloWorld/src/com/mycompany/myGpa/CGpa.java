package com.mycompany.myGpa;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.codename1.ui.Form;
import com.codename1.ui.layouts.BorderLayout;
import java.util.ArrayList;

/**
 *
 * @author Hidee
 */
public class CGpa {
    ArrayList<Integer> unit = new ArrayList<Integer>(1);
    ArrayList<String> courseCode = new ArrayList<String>(1);
    ArrayList<String> grade = new ArrayList<String>(1);
    
    public float cgpaCompiler(ArrayList<String>... gp){
        float cgpa=0;
        for(ArrayList<String> grades: gp){
            cgpa+=gpCompiler(grades);
        }  
        return cgpa;
    }
    
    public void addit(int x){
        unit.add(0);
        courseCode.add(""+x);
        grade.add("");
    }
    
    public void setUnit(ArrayList<Integer> unit){
        this.unit=unit;
    }
    
    public void setGrade(ArrayList<String> grade){
        this.grade=grade;
    }
    
    public void setCourse(ArrayList<String> course){
        this.courseCode=course;
    }
    
    public int gradePoint(String grade){
        int point = 0;
        switch(grade){
            case "A":
                point = 5;
                break;
            case "B":
                point = 4;
                break;
            case "C":
                point = 3;
                break;
            case "D":
                point = 2;
                break;
            case "E":
                point = 1;
                break;
            case "F":
                point = 0;
                break;
            default:
                throw new IllegalArgumentException("grade can only be A/B/C/D/E/F");
        }
        return point;
    }
    
//    public void setGrade(int score){
//        if(score>=0&&score<=100){
//            getG_Array().add(score);
//        }
//        else throw new IllegalArgumentException ("Score should be btw 0-100");
//    }
    
    public void addGrade(String score){
        switch(score){
            case "A":case "B":case "C":case "D":case "E":case "F":
                grade.add(score);
                break;
            default:
                throw new IllegalArgumentException("grade can only be A/B/C/D/E/F");
        }
    }
    
    public void addUnit(int unit){
        if(unit<7&&unit>=0)
            this.unit.add(unit);
        else
            throw new IllegalArgumentException("Max of 6unit and min of 0unit");
    }
    
    
    
    public void addCourse(String course){
            if(course.length()<1080)
           this.courseCode.add(course);
        else
            throw new IllegalArgumentException("CourseCode too long");
    }
    
    public ArrayList<String> getG_Array(){
        return grade;
    }
    
    public void removeGrade(int no){
        grade.remove(no);
    }
    
    public int point_unit(String score,int unit){
        int point = gradePoint(score);
        return (point*unit);
    }
    
    public int totalUnit(){
        int tot=0;
        for(int i:unit)
        {
            if(i<0||i>6)
                throw new IllegalArgumentException("Unit must be between 0 and 6");
            tot+=i;
        }return tot;
    }
    
    public float gpCompiler(ArrayList<String> grade){
        float total=0;
        for(int i=0;i<this.grade.size()&&i<this.unit.size();i++){
            total+=point_unit(grade.get(i),unit.get(i));
//                total+=gradePoint(grade.get(i));
        }
        total/=totalUnit();
        return total;
    }
    public String[][] toTable(){
        String cgpa[][] = new String[grade.size()][3];
        for(int i=0;i<grade.size();i++){
                cgpa[i][0]=courseCode.get(i);
                cgpa[i][1]=unit.get(i).toString();
                cgpa[i][2]=grade.get(i);
        }
        return cgpa;
    }

    String getLevel(float gp) {
        if(gp>=4.5)
            return "FIRST CLASS";
        else if(gp>=3.5)
            return "SECOND CLASS UPPER";
        else if(gp>=2.5)
            return "SECOND CLASS LOWER";
        else if(gp>=2.5)
            return "THIRD CLASS";
        else
            return "PASS";
    }
    
}

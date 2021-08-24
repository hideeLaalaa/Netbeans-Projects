/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;

/**
 *
 * @author Hidee
 */
public class CGpa {
//    Form hi = new Form("Table", new BorderLayout());
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
    
    public int gradePoint(String grade){
        int point = 0;
        switch(grade){
            case "A":
                point = 5;
            case "B":
                point = 4;
            case "C":
                point = 3;   
            case "D":
                point = 2;
            case "E":
                point = 1;
            case "F":
                point = 0;
            default:
                throw new IllegalArgumentException("grade can only be A/B/C/D/E/F");
        }
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
    
    public float gpCompiler(ArrayList<String> grade){
        float total=0;
        for(int i=0;i<this.grade.size()&&i<this.unit.size();i++){
            total+=point_unit(grade.get(i),unit.get(i));
        }
        total/=grade.size();
        return total;
    }
    
    public String toString(){
        return "";
    }
    
}

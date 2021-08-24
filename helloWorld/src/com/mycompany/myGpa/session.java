package com.mycompany.myGpa;


import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hidee
 */
public class session {
    int level;
    ArrayList<CGpa> semester = new ArrayList<CGpa>(1); 
    
    public session(int level){
        setLevel(level);
    }
    
    public int getlevel(){
        return this.level;
    }
    
    public void addSemester(){
        this.semester.add(addResult());
    }
    
    public CGpa addResult(){
        if(this.semester.size()<3)
            return new CGpa(); 
        else throw new IllegalArgumentException("Max of 3 semesters in a session");
    }
    
    public void setLevel(int level)
    {
        if(level%100==0&&level<800)
            this.level=level;
        else{
            throw new IllegalArgumentException("Level not recognized");
        }
    }
}

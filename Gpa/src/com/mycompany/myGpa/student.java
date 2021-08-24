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
public class student {
    String name;
    int level;
    ArrayList<session> year = new ArrayList<session>(1); 
    
    public student(){
        
    }
   
    public student(String name){
        this.name=name;
    }
    
    public int getlevel(){
        return this.year.size();
    }
    
    public void addSession(){
        year.add(new session(getlevel()+1));
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

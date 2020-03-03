/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ConditionalsAndLoops.ConditionalStatements;

/**
 *
 * @author shourya.bansal
 */
public class Student {
    private String name;
    
    public Student(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    
    public int getGrade() {
        return getGrade(this);
    }
    
    public static int getGrade( Student s ) {
        String upperName1 = s.getName().toUpperCase();
        String upperName;
        try {
            upperName = upperName1.substring(0, upperName1.indexOf(" "));

        }
        catch (Exception e) {
            upperName = upperName1;
        }
        
        switch(upperName) {
            case "ETHAN":
            case "JOHN":
            case "LEO":
                return 100;
                
            case "ARYAN":
            case "KEVIN":
            case "KRISH":
                return 93;
                
            case "RYAN":
            case "MICHAEL":
            case "JACK":
                return 90;
            
            case "AADI":
                return 87;
                
            case "MARC":
            case "NICHOLAS":
                return 83;
                
            case "ANDREW":
                return 80;
                
            case "JOE":
                return 77;
                
            case "SHOURYA":
                return 0;
                
            default:
                return 0;
        } 
    }
}

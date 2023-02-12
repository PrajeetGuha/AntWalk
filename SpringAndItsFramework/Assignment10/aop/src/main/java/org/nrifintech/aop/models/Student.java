package org.nrifintech.aop.models;

import org.springframework.stereotype.Component;

@Component("student")
public class Student {
    
    private String name;
    private int engMarks;
    private int hinMarks;
    private int matMarks;
    private int avg;

    public Student() {
    }
    public Student(String name, int engMarks, int hinMarks, int matMarks) {
        this.name = name;
        this.engMarks = engMarks;
        this.hinMarks = hinMarks;
        this.matMarks = matMarks;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getEngMarks() {
        return engMarks;
    }
    public void setEngMarks(int engMarks) {
        this.engMarks = engMarks;
    }
    public int getHinMarks() {
        return hinMarks;
    }
    public void setHinMarks(int hinMarks) {
        this.hinMarks = hinMarks;
    }
    public int getMatMarks() {
        return matMarks;
    }
    public void setMatMarks(int matMarks) {
        this.matMarks = matMarks;
    }

    public boolean avgMarks(){
        avg = (engMarks + hinMarks + matMarks) / 3;
        System.out.println("Average is calculated");
        System.out.println();
        return true;
    }

    public boolean showMarks(){
        System.out.println("Name: "+name);
        System.out.println("English Marks: "+engMarks);
        System.out.println("Hindi Marks: "+hinMarks);
        System.out.println("Math Marks: "+matMarks);
        System.out.println("Average Marks: "+avg);
        return true;
    }
}

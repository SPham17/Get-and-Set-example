package com.company;

public class mathmatics {

    private int ageup;
    private int agedown;
    private String name;



    public void setAgeup(int ageup1, int age) {
        int b = ageup1 + age;
        System.out.println("Your dog is now " + b + "years old.");
    }
    public int getAgeup() {
        return ageup;
    }


    public void setAgedown(int agedown1, int age){
        agedown1 = age - agedown1;
        this.agedown = agedown1;
    }
    public int getAgedown(){
        return agedown;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName() {
        return name;
    }

}

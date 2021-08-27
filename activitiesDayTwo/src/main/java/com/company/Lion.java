package com.company;

public class Lion {

    // state properties
    private String name;
    private int age;
    private  int weight;


    // constructor
    public Lion(String nameIn, int ageIn, int weightIn) {

        this.name = nameIn;
        this.age = ageIn;
        this.weight = weightIn;
    }










    // behavior methods






    // getters and setters

    // a method to retrieve name
    public String getName() {
        return name;

    }

    // a method to retrieve age
    public int getAge(){
        return age;
    }


    // a method to set age
    public void setAge(int age){

        this.age = age;
    }

    // a method to get weight
    public int getWeight(){
        return weight;

    }


    // a method to set weight
    public void setWeight(int weight){
        this.weight =weight;
    }



}

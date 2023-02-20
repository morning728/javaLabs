package org.example.exercise2;

import java.time.LocalDate;


public class Human {
    private int age;
    private String firstName;
    private String lastName;
    private LocalDate birthDate;
    private int weight;
    public Human(int a, String f, String l, LocalDate b, int w){
        age = a;
        firstName = f;
        lastName = l;
        birthDate = b;
        weight = w;
    }
    public LocalDate getBirthDate(){
        return birthDate;
    }
    public int getWeight(){
        return weight;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}

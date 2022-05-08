/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.firstjavaproject;

import java.time.LocalDate;
import java.time.Period;

/**
 *
 * @author Gustavo
 */
public class Person {
    private String name;
    private int age;
    private LocalDate birthdayDate;

    public Person(String name, LocalDate bithdayDate) {
        this.name = name;
        this.birthdayDate = bithdayDate;
    }    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public LocalDate getBithdayDate() {
        return birthdayDate;
    }

    public void setBithdayDate(LocalDate bithdayDate) {
        this.birthdayDate = bithdayDate;
    }
    
    public void CalculateAge(){
        age = Period.between(birthdayDate, LocalDate.now()).getYears();
    }
}

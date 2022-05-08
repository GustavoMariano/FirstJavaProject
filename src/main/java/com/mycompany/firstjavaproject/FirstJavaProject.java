/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.firstjavaproject;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

/**
 *
 * @author Gustavo
 */
public class FirstJavaProject {

    public static void main(String[] args) throws ParseException {
        
        String name;
        LocalDate birthday;
        
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Insert your name");
            name = scan.nextLine();
            System.out.println("Insert your birthday (yyyy-mm-dd)");
            birthday = LocalDate.parse(scan.nextLine());
        }
        
        Person person = new Person(name, birthday);
        
        person.CalculateAge();
        
        System.out.println("Hello World!");
        System.out.println("My name is " + name + ", I'm " + person.getAge() + " years old.");
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classesandobjectsexercises;

/**
 *
 * @author user
 */
public class Car {
    String make;
    String model; 
    int numWheels; 
    String colour;
    
    public void drive(double direction) {
        System.out.println(String.format("The %s %s is driving  at %f degree" , colour, direction));
        System.out.printf("The %s %s is driving  at %f degree" , colour, direction);
    }
    public void drive(String direction) {
        System.out.println ("The" + colour + " " + make + " is driving " + direction);
    }
    
}

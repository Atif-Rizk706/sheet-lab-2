/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2.ass1;

/**
 *
 * @author Atif
 */
public class student extends person{
    student(String n) {
    super(n);
    }

    enum Status {
                 freshman, 
                 sophomore,
                 junior,
                 senior
    }

    Status classStatus;

    @Override
    public String toString() {
    return "Student " + name;
    
    }
    
}

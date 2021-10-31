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
public class Lab2Ass1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       person person =new person((" atif rizk ")),
    student  =new student(" atif rizk "),
    empolyee  =new employee((" atif rizk ")),
    facutly  = new facutly("computer and information "),
    staff  =new staff("computer science"),
    people[] = { person, student, empolyee, facutly, staff };
    for (person p : people)
    System.out.println(p);
    }
    
}

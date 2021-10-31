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
public class facutly extends employee{
      facutly(String n) {
    super(n);
    }
    String officeHours, rank;

    @Override
    public String toString() {
    return "Faculty " + name;
    }
    
}

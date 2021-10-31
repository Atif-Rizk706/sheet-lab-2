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
public class person {
      public String name;
    public String address;
    public int phone;
    public String email;
    
    
    public person(String n) {
    name = n;
    }
    @Override
    public String toString() {
    return "Person " + name;
    }
    
}

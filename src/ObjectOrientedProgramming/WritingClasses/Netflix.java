/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ObjectOrientedProgramming.WritingClasses;

public class Netflix {
    public static void main(String[] args) {
        Movie a = new Movie("The Incredibles", 155);
        Movie b = new Movie("Cars 2", "PG-13", 175, false);
        Movie c = new Movie ("Joker");
        
        System.out.println("The name should be The Incredibles. Actual:" + a.getName());
        System.out.println("The name should be Cars 2. Actual: " + b.getName());
        System.out.println("The name is Joker. Actual:" + c.getName());
        
        System.out.println(a);
    }
}

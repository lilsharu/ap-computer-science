/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ConditionalsAndLoops.ConditionalStatements;

import java.util.*;

public class LargestOfThree {
    public static int largestOfThree(int a, int b, int c) {
        if (a > b) {
            if (a > c) return a;
            else return c;
        }
        else {
            return largestOfThree(b, c, a);
        }
    }
    
    public static void main(String[] args) {
        System.out.println(largestOfThree(1, 2, 3));
    }
}

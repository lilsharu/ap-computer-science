/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ObjectOrientedProgramming.UsingObjects;

/**
 *
 * @author shourya.bansal
 */
public class StringPractice {
    public static void main(String[] args) {
        String vocabAndrew = "Ching Chang Chong";
        int len = vocabAndrew.length();
        System.out.println(len);
        System.out.println(vocabAndrew.substring(0, 1)+vocabAndrew.substring(0));
        System.out.println(vocabAndrew.substring(0, 9).compareTo(vocabAndrew));
        System.out.println(vocabAndrew.compareTo(vocabAndrew.substring(8, 9)));
        System.out.println(vocabAndrew.charAt(4));
    }
    
}
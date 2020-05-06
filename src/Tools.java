/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import java.util.*;
import java.io.*;
import java.math.*;

/**
 *
 * @author shourya.bansal
 */
public class Tools {
    public Tools tool = new Tools();
    private Scanner input = new Scanner(System.in);
    
    public static int random(int min, int max) {
        double random = Math.random();
        int randomNumber = ((int)(random *(max - min + 1)) + min);
        return randomNumber;
    }
    
    public static String[] cutInHalf(String word) {
        int len = word.length();
        int halfLength = len/2;
        String firstHalf = word.substring(0, halfLength);
        String secondHalf = word.substring(halfLength, len);
        return new String[]{firstHalf, secondHalf};
    }
    
    public String firstChars(int numberOfChars, String word) {
        int length = word.length();
        String firstLetters;
        if (numberOfChars > length){
            firstLetters = null;
        }
        else {
            firstLetters = word.substring(0, numberOfChars);
        }
        return firstLetters;
    }
    
    public String randomLicensePlate () {
        String randomLicensePlateNumber1 = "";
        String randomLicensePlateNumber2 = "";
        
        String randomLicensePlate = "";
        
        int range = (int)('Z'-'A');
        int A = (int)'A';
        int Z = (int)'Z';
        for (int i = 0; i < 3; i++) {
            int random = tool.random(A, Z);
            char character = (char)random;
            randomLicensePlateNumber1+=character;
        }
        char randLetter = (char)tool.random(A, Z);
        int randomInt1 = tool.random(0, 9);
        int randomInt2 = tool.random(0, 9);
        randomLicensePlateNumber2 += randLetter;
        randomLicensePlateNumber2 += randomInt1;
        randomLicensePlateNumber2 += randomInt2;
        
        int type = tool.random(1, 2);
        if (type == 1) {
            randomLicensePlate = randomLicensePlateNumber1 + randomLicensePlateNumber2;
        }
        else {
            randomLicensePlate = randomLicensePlateNumber2 + randomLicensePlateNumber1;
        }
        return randomLicensePlate;
    }
    
    public double areaOfCircle(double radius){
        double area = Math.PI*Math.pow(radius, 2);
        return area;
    }
    
    public double areaOfRectangle(double length, double width) {
        double area = length*width;
        return area;
    }
    
    public double volumeOfSphere(double radius) {
        double area = ((double)(4)/(3))*Math.PI*Math.pow(radius, 3);
        return area;
    }
    
    public double round(double toRound, int places) {
        double stepOne = toRound * Math.pow(10, places);
        int stepTwo = (int)(stepOne);
        double stepThree = stepTwo / Math.pow(10, places);
        return stepThree;
    }
    
    public double round(BigDecimal toRound, int places) {
        BigDecimal multiplyBy = BigDecimal.valueOf((int)Math.pow(10, places));
        BigDecimal neededPlaces = toRound.multiply(multiplyBy);
        int stepTwo = neededPlaces.intValue();
        double stepThree = stepTwo / Math.pow(10, places);
        return stepThree;
    }
    
    public BigDecimal costAfterTax(double price, double tax) {
        BigDecimal decPrice = new BigDecimal(tool.round(price, 2));
        if (tax > 0) {
            tax /= 100;
        }
        BigDecimal trueTax = new BigDecimal (1 + tax);
        BigDecimal withTax = decPrice.multiply(trueTax);
        double doubleWithTax = withTax.doubleValue();
        BigDecimal output = new BigDecimal(tool.round(doubleWithTax, 2));
        return output;
    }
    
    public static String shuffle(String s) {
        int length = s.length();
        int indexOfRandom = Tools.random(0, length-1);
        String partOne = s.substring(0, indexOfRandom);
        String partTwo = s.substring(indexOfRandom);
        String output = partTwo + partOne;
        return output;
    }
    
    public static String replaceWithX(String word, char letter) {
        int index = word.indexOf(letter);
        return word.substring(0, index) + 'x' + word.substring(index+1);        
    }
}


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ObjectOrientedProgramming.WritingClasses;

public class Point {
    private double x;
    private double y;
    private String label;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Point(double x, double y, String label) {
        this.x = x;
        this.y = y;
        this.label = label;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public String getLabel() {
        return label;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }
    
    public void setCenter(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void setLabel(String label) {
        this.label = label;
    }
    
    public void setVals(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    public void translate(double x, double y){
       this.x += x;
       this.y += y;
       
    }
    
    public double distanceTo(double x2, double y2){
       double dist = Math.pow(Math.pow((x2 - x), 2) - Math.pow(y2 - y, 2), 0.5);
       return dist;
    }
    
    public Point midpoint(double x2, double y2){
       double distx = (x+x2)/2.0;
       double disty = (y+y2)/2.0;
       return new Point(distx, disty);
    }
    
    public double findSlope(double x2, double y2){
       double slope = (y2 - y)/(x2 - x);
       return slope;
    }
    
    public String findEq(double slope){
       double b = y - slope*x;
       String eq = "y = " + slope + "x + " + b;
       return eq;
    }
    
    public void reflectAcrossX(){
       y *= -1;
    }
    
    public void reflectAcrossY(){
       x *= -1;
    }
    
    public double distanceTo(Point P){
       double pX = P.getX();
       double pY = P.getY();
       return distanceTo(pX, pY);
    }   
    
}

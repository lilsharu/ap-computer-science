/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ObjectOrientedProgramming.WritingClasses;

public class Circle {
    private double radius;
    private String label;
    private Point center;
    private static char count = (char)0;
    
    public Circle(double radius, Point center, String label){
        this.radius = radius;
        this.center = center;
        this.label = label;
    }
    
    public Circle(double radius, Point center) {
        this(radius, center, "" + count);
        count++;
    }
    
    public Circle(double radius) {
        this(radius, new Point (0, 0), "" + count);
    }
    
    public Circle(Point center) {
        this(1, center, "" + count);
    }
    
    public Circle(String label) {
        this(1, label);
    }
    
    public Circle(double radius, String label) {
        this(radius, new Point (0, 0), label);
    }
    
    public Circle(double radius, double x, double y) {
        this(radius, new Point(x, y));
    }
    
    public void setCenter(double x, double y) {
        this.center.setCenter(x, y);
    }

    public double getRadius() {
        return radius;
    }

    public String getLabel() {
        return label;
    }

    public Point getCenter() {
        return center;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public void setCenter(Point center) {
        this.center = center;
    }
    
    public double getDiameter(){
        return radius * 2;
    }
    
    public double getCircumference() {
        return 2 * Math.PI * radius;
    }
    
    public double getArea() {
        return Math.PI * radius * radius;
    }
    
    public void translate(double x, double y) {
        center.translate(x, y);
    }
    
    public double distanceToCenter(Circle a) {
        return center.distanceTo(a.center);
    }
    
    public double distanceToEdge(Circle a) {
        return this.distanceToCenter(a) - a.radius;
    }
    
    public double distanceFromEdgetoEdge(Circle a) {
        return this.distanceToCenter(a) - this.radius - a.radius;
    }
    
    public double distanceToPoint(Point a) {
        return a.distanceTo(this.center);
    }
    
    public double distanceToPointFromEdge(Point a) {
        return distanceToPoint(a) - this.radius;
    }
    
    public void scale(double scaleFactor) {
        this.radius *= scaleFactor;
    }
    
    public String getEquation() {
        return "(x - " + center.getX() + ")" + (char)178 + " + (y - " + center.getY() + ")" + (char)178;
    }
    
    @Override
    public String toString() {
        return label + ": " + this.getEquation();
    }
    
    public double getRatio(double radians) {
        while (radians > 2 * Math.PI) radians = 2 * Math.PI - radians;
        double ratio = radians / Math.PI;
        return ratio;
    }
    
    public double getSectorAreaRadians(double radians) {
        double ratio = getRatio(radians);
        return ratio * this.getArea();
    }
    
    public double getSectorAreaDegrees(double degrees) {
        return this.getSectorAreaRadians(Math.toRadians(degrees));
    }
    
    public double getArcLengthRadians(double radians) {
        return getRatio(radians) * getCircumference();
    }
    
    public double getArcLengthDegrees(double degrees) {
        return getArcLengthRadians(Math.toRadians(degrees));
    }
    
    
}

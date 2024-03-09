/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LAPTOP
 */
public class menghitungluaspersegipanjang {
    public class RectangleArea {
    private double length;
    private double width;

    // constructor
    public RectangleArea(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // method to calculate area
    public double calculateArea() {
        return length * width;
    }

    // getters and setters for length and width
    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
    
    }
}
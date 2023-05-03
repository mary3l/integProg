/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package it2344practice01;

/**
 *
 * @author jbcan
 */
public class IT2344Practice01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Square square = new Square(10);
        System.out.printf("Area of square is %.2f\n", square.getArea());
        
        Triangle triangle = new Triangle(5,6);
        System.out.printf("Area of triangle is %.2f\n", triangle.getArea());
        
        Circle circle = new Circle(25);
        System.out.printf("Area of cicle is %.2f\n", circle.getArea());
        
    }
    
}

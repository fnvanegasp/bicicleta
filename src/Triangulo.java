/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Estudiante
 */
public class Triangulo extends Figura{
    
    private int lado;

    public Triangulo(int lado, String color) {
        super(color);
        this.lado = lado;
    }
    
    public double calcularArea(){
        return(0.25*(Math.sqrt(3))*Math.pow(lado, 2));
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Estudiante
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Circulo llanta1 = new Circulo(10,"Negro");
        Circulo llanta2 = new Circulo(10,"Negro");
        Circulo plato = new Circulo(2,"Negro");
        
        Triangulo marco1 = new Triangulo(5,"Rojo");
        Triangulo marco2 = new Triangulo(5,"Rojo");
        Triangulo marco3 = new Triangulo(5,"Rojo");
        
        Bicicleta b = new Bicicleta();
        b.agregarFigura(plato);
        b.agregarFigura(llanta1);
        b.agregarFigura(llanta2);
        b.agregarFigura(marco1);
        b.agregarFigura(marco2);
        b.agregarFigura(marco3);
        
        double areaTotal = b.calcularAreatotal();
        System.out.println(areaTotal);
    }
    
}

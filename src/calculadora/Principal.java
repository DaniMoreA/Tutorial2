/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

/**
 *
 * @author Daniel Moreno
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Calculadora Casio = new Calculadora(20, 4);
        
        
        System.out.println("La suma de " + Casio.getNumero1() + " y " + Casio.getNumero2() + " es " + Casio.suma());
        System.out.println("Probando el metodo suma con los valores 20 y 4 " + Casio.getNumero1() + " y " + Casio.getNumero2() + " es " + Casio.suma());
        double resEsperado = 24;
        if (Casio.suma() == resEsperado) { //Sirve para comprobar si el metodo pasa el test
            System.out.println("La prueba es correcta... el metodo suma pasa el test");
        } else {
            System.out.println("La prueba no es correcta... el metodo suma no pasa el test");
        }
        
        if (Math.abs(resEsperado - Casio.suma()) <=1) { //Sirve para dejar un margen de error de 1 
            System.out.println("La prueba es correcta... el metodo suma pasa el test");
        } else {
            System.out.println("La prueba no es correcta... el metodo suma no pasa el test");
        }
        
        System.out.println("La resta de " + Casio.getNumero1() + " y " + Casio.getNumero2() + " es " + Casio.resta());
        System.out.println("Probando el metodo resta con los valores 20 y 4 " + Casio.getNumero1() + " y " + Casio.getNumero2() + " es " + Casio.resta());
        double resEsperado2 = 16;
        if (Casio.resta() == resEsperado2) {
            System.out.println("La prueba es correcta... el metodo resta pasa el test");
        } else {
            System.out.println("La prueba no es correcta... el metodo resta no pasa el test");
        }
        
        System.out.println("La multiplicacion de " + Casio.getNumero1() + " y " + Casio.getNumero2() + " es " + Casio.multiplicacion());
        System.out.println("Probando el metodo multiplicar con los valores 20 y 4 " + Casio.getNumero1() + " y " + Casio.getNumero2() + " es " + Casio.multiplicacion());
        double resEsperado3 = 80;
        if (Casio.multiplicacion()== resEsperado3) {
            System.out.println("La prueba es correcta... el metodo multiplicar pasa el test");
        } else {
            System.out.println("La prueba no es correcta... el metodo multiplicar no pasa el test");
        }
    
    }

}

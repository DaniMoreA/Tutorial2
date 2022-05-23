/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadoraTest;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import calculadora.Calculadora;

/**
 *
 * @author Daniel Moreno
 */
public class TestSuma {
    
    Calculadora objeto = new Calculadora (20, 4);
    
    
    public TestSuma() {
        
    }
    
    @BeforeClass
    public static void setUpClass() {
        System.out.println("Comenzando el test....");
        
    }
    
    @AfterClass
    public static void tearDownClass() {
        System.out.println("Finalizando el test....");
    }
    
    @Before
    public void setUp() {
        
    }
    
    @After
    public void tearDown() {
        
    }

    
    @Test
    
    public void TestSuma(){
        System.out.println("Test metodo suma()");
        double resEsperado = 23;
        double suma = objeto.suma();
        
        assertEquals(resEsperado, suma, 1.0); //1.0 esto es toleracia, el fallo que puede tener
    }
    
    @Test
    
    public void TestResta(){
        System.out.println("Test metodo resta()");
        double resEsperado = 16;
        double resta = objeto.resta();
        
        assertEquals(resEsperado, resta, 1.0); //1.0 esto es toleracia, el fallo que puede tener
    }
    
    @Test
    
     public void TestMultiplicar(){ //otro metodo de realizarlo
        System.out.println("Test metodo multiplicar()");
        double resEsperado = 80;
        double margenError = 1;
        
        assertEquals(resEsperado, objeto.multiplicacion(), margenError);
    }

}
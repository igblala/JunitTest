/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quincena11;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author nacho
 */
public class MiscelaneaTest {
    
    public MiscelaneaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of suma method, of class Miscelanea.
     */
    @Test
    public void testSuma() {
        System.out.println("suma");
        int num1 = 46;
        int num2 = 30;
        Miscelanea instance = new Miscelanea();
        int expResult = 76;
        int result = instance.suma(num1, num2);
        assertEquals(expResult, result);        
    }

    /**
     * Test of generaAleatorioEntre method, of class Miscelanea.
     */
    @Test
    public void testGeneraAleatorioEntre() {
        System.out.println("generaAleatorioEntre");
        int num1 = 0;
        int num2 = 0;
        int expResult = 0;
        int result = Miscelanea.generaAleatorioEntre(num1, num2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of concatena method, of class Miscelanea.
     */
    @Test
    public void testConcatena() {
        System.out.println("concatena");
        String cad1 = "";
        String cad2 = "";
        Miscelanea instance = new Miscelanea();
        String expResult = "";
        String result = instance.concatena(cad1, cad2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMayor method, of class Miscelanea.
     */
    @Test
    public void testGetMayor() {
        System.out.println("getMayor");
        int num1 = 0;
        int num2 = 0;
        Miscelanea instance = new Miscelanea();
        int expResult = 0;
        int result = instance.getMayor(num1, num2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMaximo method, of class Miscelanea.
     */
    @Test
    public void testGetMaximo() {
        System.out.println("getMaximo");
        int[] vector = null;
        Miscelanea instance = new Miscelanea();
        int expResult = 0;
        int result = instance.getMaximo(vector);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getElemento method, of class Miscelanea.
     */
    @Test(expected = OutOfMemoryError.class)
    public void testGetElemento() {
        System.out.println("getElemento");
        int[] vector = {8,9,1,10,3,13};
        int pos = 7;
        Miscelanea instance = new Miscelanea();
        int expResult = 0;
        int result = instance.getElemento(vector, pos);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of factorial method, of class Miscelanea.
     */
    @Test
    public void testFactorial() {
        System.out.println("factorial");
        int num = 0;
        int expResult = 0;
        int result = Miscelanea.factorial(num);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of esPrimo method, of class Miscelanea.
     */
    @Test
    public void testEsPrimo() {
        System.out.println("esPrimo");
        int numero = 0;
        boolean expResult = false;
        boolean result = Miscelanea.esPrimo(numero);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of areaCirculo method, of class Miscelanea.
     */
    @Test
    public void testAreaCirculo() {
        System.out.println("areaCirculo");
        int radio = 0;
        double expResult = 0.0;
        double result = Miscelanea.areaCirculo(radio);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of areaTriangulo method, of class Miscelanea.
     */
    @Test
    public void testAreaTriangulo() {
        System.out.println("areaTriangulo");
        int base = 0;
        int altura = 0;
        double expResult = 0.0;
        double result = Miscelanea.areaTriangulo(base, altura);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of areaCuadrado method, of class Miscelanea.
     */
    @Test
    public void testAreaCuadrado() {
        System.out.println("areaCuadrado");
        int lado = 0;
        double expResult = 0.0;
        double result = Miscelanea.areaCuadrado(lado);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of decimalABinario method, of class Miscelanea.
     */
    @Test
    public void testDecimalABinario() {
        System.out.println("decimalABinario");
        int num = 0;
        String expResult = "";
        String result = Miscelanea.decimalABinario(num);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

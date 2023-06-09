package desafio;

//@author Allan Toledo

import static org.junit.Assert.assertEquals;
import desafio.Modelo;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import junit.framework.Test;

public class TestModelo extends TestCase {
    
    public TestModelo(String name){
        super(name);
    }
    
    public static Test suite() {
        TestSuite suite = new TestSuite(TestModelo.class);
        return suite;
    }
    
    public void testModulo() {
        Modelo model = new Modelo();
        assertEquals(5, model.modulo(-5));
    }
    
    
    public void testCalcular(){
        Modelo model = new Modelo();
        assertEquals(4, model.calculo(2));
    }
}

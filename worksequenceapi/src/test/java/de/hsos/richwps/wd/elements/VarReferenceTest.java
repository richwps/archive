/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.hsos.richwps.wd.elements;

import de.hsos.richwps.wsd.elements.VarReference;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 *
 * @author dalcacer
 */
public class VarReferenceTest extends TestCase {

    public VarReferenceTest(String testName) {
        super(testName);
    }

    public static Test suite() {
        TestSuite suite = new TestSuite(VarReferenceTest.class);
        return suite;
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }

    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    /**
     * Test of equals method, of class InReference.
     */
    public void testEquals() {
        System.out.println("equals");
        Object obj = null;
        VarReference inreferencea = new VarReference("test");
        VarReference inreferenceb = new VarReference("test");
        boolean expResult = true;
        boolean result = inreferencea.equals(inreferenceb);
        assertEquals(expResult, result);
    }
}

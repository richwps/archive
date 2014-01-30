/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.hsos.richwps.wd.elements;

import de.hsos.richwps.dsl.elements.InReference;
import de.hsos.richwps.dsl.elements.Reference;
import de.hsos.richwps.dsl.elements.VarReference;
import de.hsos.richwps.dsl.elements.Assignment;
import java.util.logging.Level;
import java.util.logging.Logger;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 *
 * @author dalcacer
 */
public class AssignmentTest extends TestCase {

    public AssignmentTest(String testName) {
        super(testName);
    }

    public static Test suite() {
        TestSuite suite = new TestSuite(AssignmentTest.class);
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
     * Test of getLefthand method, of class Assignment.
     */
    public void testGetLefthand() {
        System.out.println("getLefthand");
        Reference areference = new VarReference("test");
        Reference breference = new VarReference("test2");
        Assignment instance = null;
        try {
            instance = new Assignment(areference, breference);
        } catch (Exception ex) {
            fail();
        }
        Reference result = instance.getLefthand();
        assertEquals(areference, result);
    }

    /**
     * Test of getLefthand method, of class Assignment.
     */
    public void testGetRighthand() {
        System.out.println("testGetRighthand");
        Reference areference = new VarReference("test");
        Reference breference = new VarReference("test2");
        Assignment instance = null;
        try {
            instance = new Assignment(areference, breference);
        } catch (Exception ex) {
            fail();
        }
        Reference result = instance.getRighthand();
        assertEquals(breference, result);
    }

    /**
     * Test of testException method, of class Assignment.
     */
    public void testException() {
        System.out.println("testException");
        InReference areference = new InReference("test");
        Reference breference = new VarReference("test2");
        Assignment instance = null;

        try {
            instance = new Assignment(areference, breference);
            fail("No exception reported.");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    /**
     * Test of testException method, of class Assignment.
     */
    public void testException2() {
        System.out.println("testException");
        Reference areference = new InReference("test");
        Reference breference = new VarReference("test2");
        Assignment instance = null;

        try {
            instance = new Assignment(areference, breference);
            fail("No exception reported.");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    /**
     * Test of testEquals method, of class Assignment.
     */
    public void testEquals() {
        System.out.println("testEquals");
        Reference areference = new VarReference("test");
        Reference breference = new VarReference("test2");

        try {
            Assignment instance = new Assignment(areference, breference);
            Assignment instance2 = new Assignment(areference, breference);
            assertEquals(instance, instance);
        } catch (Exception ex) {
            fail();
        }

    }

}

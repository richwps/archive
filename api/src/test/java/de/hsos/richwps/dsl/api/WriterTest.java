package de.hsos.richwps.dsl.api;

import de.hsos.richwps.dsl.api.elements.Worksequence;
import junit.framework.TestCase;

/**
 *
 * @author dalcacer
 * @version draft
 */
public class WriterTest extends TestCase {
    
    String tempdir = System.getProperty("java.io.tmpdir");
    String filesep = System.getProperty("file.separator");
    String ext = ".dsl";

    
    public WriterTest(String testName) {
        super(testName);
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
     * Test of create method, of class Writer.
     */
    public void testCreate() throws Exception {
        System.out.println("create");
        String path = tempdir+filesep+"aabb"+ext;
        Worksequence ws = null;
        Writer instance = new Writer();
        instance.create(path, ws);
    }
}

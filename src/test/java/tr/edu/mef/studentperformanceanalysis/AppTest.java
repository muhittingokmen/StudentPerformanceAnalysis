/*
 * StudentPerformancAnalysis 1.0
 * http://www.github.com/muhittingokmen/StudentPerformanceAnalysis
 *
 * Copyright 2016 Muhittin Gökmen
 * Released under the MIT license
 */

package tr.edu.mef.studentperformanceanalysis;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
}

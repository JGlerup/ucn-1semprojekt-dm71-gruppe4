/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Ctr;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author Erik M. Gravesen
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({Ctr.CustomerCtrTest.class,Ctr.ItemCtrTest.class})
public class CtrSuite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

}
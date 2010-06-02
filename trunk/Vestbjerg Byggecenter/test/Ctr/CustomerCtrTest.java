/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Ctr;

import Model.Account;
import Model.Customer;
import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Erik M. Gravesen
 */
public class CustomerCtrTest {

    public CustomerCtrTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of createCustomer method, of class CustomerCtr.
     */
    @Test
    public void testCreateCustomer() {
        System.out.println("createCustomer");
        String name = "Gert Hansen";
        String address = "Grønnegade 12";
        String phone = "98352010";
        CustomerCtr instance = new CustomerCtr();
        int customerID = instance.createCustomer(name, address, phone);
        Customer result = instance.getCustomer(customerID);
        assertEquals("Gert Hansen", result.getName());
        assertEquals("Grønnegade 12", result.getAddress());
        assertEquals("98352010", result.getPhone());
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteCustomer method, of class CustomerCtr.
     */
    @Test
    public void testDeleteCustomer() {
        System.out.println("deleteCustomer");
        String name = "Gert Hansen";
        String address = "Grønnegade 12";
        String phone = "98352010";
        CustomerCtr instance = new CustomerCtr();
        int customerID = instance.createCustomer(name, address, phone);
        instance.deleteCustomer(customerID);
        Customer result = instance.getCustomer(customerID);
        assertNull(result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of giveAccount method, of class CustomerCtr.
     */
    @Test
    public void testGiveAccount() {
        System.out.println("giveAccount");
        String name = "Gert Hansen";
        String address = "Grønnegade 12";
        String phone = "98352010";
        CustomerCtr instance = new CustomerCtr();
        int customerID = instance.createCustomer(name, address, phone);
        String type = "Visa";
        int regNo = 39292492;
        int cardNo = 457153253;
        instance.giveAccount(customerID, type, regNo, cardNo);
        Account result = instance.getCustomer(customerID).getAccount();
        assertNotNull(result);
        assertEquals("Visa", result.getType());
        assertEquals(39292492, result.getRegNr());
        assertEquals(457153253, result.getCardNr());
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of getCustomer method, of class CustomerCtr.
     */
    @Test
    public void testGetCustomer() {
        System.out.println("getCustomer");
        int customerID = 1;
        CustomerCtr instance = new CustomerCtr();
        instance.createCustomer("Gert Hansen", "Grønnegade 12", "98352010");
        Customer result = instance.getCustomer(customerID);
//        Customer expResult = null;
//        Customer result = instance.getCustomer(customerID);
        assertNotNull(result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of updateName method, of class CustomerCtr.
     */
    @Test
    public void testUpdateName() {
        System.out.println("updateName");
        String name = "Gert Madsen";
        CustomerCtr instance = new CustomerCtr();
        int customerID = instance.createCustomer("Gert Hansen", "Grønnegade 12", "98352010");
        instance.updateName(customerID, name);
        assertEquals("Gert Madsen", instance.getCustomer(customerID).getName());
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of updateAddress method, of class CustomerCtr.
     */
    @Test
    public void testUpdateAddress() {
        System.out.println("updateAddress");
        String address = "Sortegade 10";
        CustomerCtr instance = new CustomerCtr();
        int customerID = instance.createCustomer("Gert Hansen", "Grønnegade 12", "98352010");
        instance.updateAddress(customerID, address);
        assertEquals("Sortegade 10", instance.getCustomer(customerID).getAddress());
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of updatePhone method, of class CustomerCtr.
     */
    @Test
    public void testUpdatePhone() {
        System.out.println("updatePhone");
        String phone = "85352010";
        CustomerCtr instance = new CustomerCtr();
        int customerID = instance.createCustomer("Gert Hansen", "Grønnegade 12", "85352010");
        instance.updatePhone(customerID, phone);
        assertEquals("85352010", instance.getCustomer(customerID).getPhone());
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of getCustomerList method, of class CustomerCtr.
     */
    @Test
    public void testGetCustomerList() {
        System.out.println("getCustomerList");
        CustomerCtr instance = new CustomerCtr();
//        instance.createCustomer("Gert Hansen", "Grønnegade 12", "85352010");
        ArrayList<Customer> result = instance.getCustomerList();
        assertNotNull(result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

}
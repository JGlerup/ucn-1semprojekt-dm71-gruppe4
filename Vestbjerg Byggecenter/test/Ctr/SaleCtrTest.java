/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Ctr;

import Model.Employee;
import Model.Item;
import Model.Sale;
import Model.SalesLineItem;
import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Erik
 */
public class SaleCtrTest {

    public SaleCtrTest() {
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
     * Test of createSale method, of class SaleCtr.
     */
    @Test
    public void testCreateSale() {
        System.out.println("createSale");
        EmployeeCtr employeeCtr = new EmployeeCtr();
        String name = "Gert Hansen";
        String address = "Grønnegade 12";
        String phone = "98302010";
        int employeeID = employeeCtr.createEmployee(name, address, phone);
        ItemCtr itemCtr = new ItemCtr();
                String itemName = "Test1";
        double itemPrice = 500.50;
        String description = "Test2";
        int maxInStock = 50;
        int minInStock = 10;
        int itemsInStock = 30;
        String brand = "Test3";
        String place = "Test4";
        boolean containUnits = true;
        int itemID = itemCtr.createItem(itemName, itemPrice, description,
                maxInStock, minInStock, itemsInStock, brand, place,
                containUnits);
        SaleCtr saleCtr = new SaleCtr();
        String saleDate = "12. juni 2010";
        int itemQuantity = 10;
        int saleID = saleCtr.createSale(employeeID, itemID, saleDate,
                itemQuantity);
        Sale s = saleCtr.getSale(saleID);
        Employee e = s.getEmployee();
        SalesLineItem sLI = s.getSalesLineItem(saleID);
        Item i = sLI.getItem();
        assertNotNull(s);
        assertNotNull(e);
        assertNotNull(sLI);
        assertNotNull(i);
        assertEquals(saleDate, s.getDate());
        assertEquals(itemQuantity, sLI.getQuantity());
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
//
//    /**
//     * Test of setSaleTotalPrice method, of class SaleCtr.
//     */
//    @Test
//    public void testSetSaleTotalPrice() {
//        System.out.println("setSaleTotalPrice");
//        int saleID = 0;
//        SaleCtr instance = new SaleCtr();
//        instance.setSaleTotalPrice(saleID);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getSale method, of class SaleCtr.
//     */
//    @Test
//    public void testGetSale() {
//        System.out.println("getSale");
//        int saleID = 0;
//        SaleCtr instance = new SaleCtr();
//        Sale expResult = null;
//        Sale result = instance.getSale(saleID);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of deleteSale method, of class SaleCtr.
//     */
//    @Test
//    public void testDeleteSale() {
//        System.out.println("deleteSale");
//        int saleID = 0;
//        SaleCtr instance = new SaleCtr();
//        instance.deleteSale(saleID);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of addSalesLineItem method, of class SaleCtr.
//     */
//    @Test
//    public void testAddSalesLineItem() {
//        System.out.println("addSalesLineItem");
//        int saleID = 0;
//        int itemID = 0;
//        int itemQuantity = 0;
//        SaleCtr instance = new SaleCtr();
//        instance.addSalesLineItem(saleID, itemID, itemQuantity);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of removeSalesLineItem method, of class SaleCtr.
//     */
//    @Test
//    public void testRemoveSalesLineItem() {
//        System.out.println("removeSalesLineItem");
//        int saleID = 0;
//        int sLIID = 0;
//        SaleCtr instance = new SaleCtr();
//        instance.removeSalesLineItem(saleID, sLIID);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getSLIList method, of class SaleCtr.
//     */
//    @Test
//    public void testGetSLIList() {
//        System.out.println("getSLIList");
//        int saleID = 0;
//        SaleCtr instance = new SaleCtr();
//        ArrayList expResult = null;
//        ArrayList result = instance.getSLIList(saleID);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of addCustomerToSale method, of class SaleCtr.
//     */
//    @Test
//    public void testAddCustomerToSale() {
//        System.out.println("addCustomerToSale");
//        int saleID = 0;
//        int customerID = 0;
//        SaleCtr instance = new SaleCtr();
//        instance.addCustomerToSale(saleID, customerID);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of removeCustomerFromSale method, of class SaleCtr.
//     */
//    @Test
//    public void testRemoveCustomerFromSale() {
//        System.out.println("removeCustomerFromSale");
//        int saleID = 0;
//        SaleCtr instance = new SaleCtr();
//        instance.removeCustomerFromSale(saleID);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of cancelSale method, of class SaleCtr.
//     */
//    @Test
//    public void testCancelSale() {
//        System.out.println("cancelSale");
//        int saleID = 0;
//        SaleCtr instance = new SaleCtr();
//        instance.cancelSale(saleID);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getQuntityDiscount method, of class SaleCtr.
//     */
//    @Test
//    public void testGetQuntityDiscount() {
//        System.out.println("getQuntityDiscount");
//        SaleCtr instance = new SaleCtr();
//        double expResult = 0.0;
//        double result = instance.getQuntityDiscount();
//        assertEquals(expResult, result, 0.0);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setQuntityDiscount method, of class SaleCtr.
//     */
//    @Test
//    public void testSetQuntityDiscount() {
//        System.out.println("setQuntityDiscount");
//        double newDiscount = 0.0;
//        SaleCtr instance = new SaleCtr();
//        instance.setQuntityDiscount(newDiscount);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getPickupDiscount method, of class SaleCtr.
//     */
//    @Test
//    public void testGetPickupDiscount() {
//        System.out.println("getPickupDiscount");
//        SaleCtr instance = new SaleCtr();
//        double expResult = 0.0;
//        double result = instance.getPickupDiscount();
//        assertEquals(expResult, result, 0.0);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setPickupDiscount method, of class SaleCtr.
//     */
//    @Test
//    public void testSetPickupDiscount() {
//        System.out.println("setPickupDiscount");
//        double newDiscount = 0.0;
//        SaleCtr instance = new SaleCtr();
//        instance.setPickupDiscount(newDiscount);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

}
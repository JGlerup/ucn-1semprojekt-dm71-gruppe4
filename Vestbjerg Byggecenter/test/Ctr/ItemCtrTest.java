/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Ctr;

import Model.Item;
import Model.Unit;
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
public class ItemCtrTest {

    public ItemCtrTest() {
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
     * Test of getItem method, of class ItemCtr.
     */
    @Test
    public void testGetItem() {
        System.out.println("getItem");
        String itemName = "Test1";
        double itemPrice = 500.50;
        String description = "Test2";
        int maxInStock = 50;
        int minInStock = 10;
        int itemsInStock = 30;
        String brand = "Test3";
        String place = "Test4";
        boolean containUnits = true;
        ItemCtr instance = new ItemCtr();
        int itemID = instance.createItem(itemName, itemPrice, description,
                maxInStock, minInStock, itemsInStock, brand, place,
                containUnits);
        Item result = instance.getItem(itemID);
        assertEquals(itemName, result.getItemName());
        assertEquals(itemPrice, result.getItemPrice(), 1);
        assertEquals(description, result.getDescription());
        assertEquals(maxInStock, result.getMaxInStock());
        assertEquals(minInStock, result.getMinInStock());
        assertEquals(itemsInStock, result.getItemsInStock());
        assertEquals(brand, result.getBrand());
        assertEquals(place, result.getPlace());
        assertEquals(containUnits, result.getContainUnits());
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of createItem method, of class ItemCtr.
     */
    @Test
    public void testCreateItem() {
        System.out.println("createItem");
        String itemName = "Test1";
        double itemPrice = 500.50;
        String description = "Test2";
        int maxInStock = 50;
        int minInStock = 10;
        int itemsInStock = 30;
        String brand = "Test3";
        String place = "Test4";
        boolean containUnits = true;
        ItemCtr instance = new ItemCtr();
        int itemID = instance.createItem(itemName, itemPrice, description,
                maxInStock, minInStock, itemsInStock, brand, place,
                containUnits);
        Item result = instance.getItem(itemID);
        assertNotNull(result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteItem method, of class ItemCtr.
     */
    @Test
    public void testDeleteItem() {
        System.out.println("deleteItem");
        String itemName = "Test1";
        double itemPrice = 500.50;
        String description = "Test2";
        int maxInStock = 50;
        int minInStock = 10;
        int itemsInStock = 30;
        String brand = "Test3";
        String place = "Test4";
        boolean containUnits = true;
        ItemCtr instance = new ItemCtr();
        int itemID = instance.createItem(itemName, itemPrice, description,
                maxInStock, minInStock, itemsInStock, brand, place,
                containUnits);
        instance.deleteItem(itemID);
        Item result = instance.getItem(itemID);
        assertNull(result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of getItemList method, of class ItemCtr.
     */
    @Test
    public void testGetItemList() {
        System.out.println("getItemList");
        ItemCtr instance = new ItemCtr();
        ArrayList result = instance.getItemList();
        assertNotNull(result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of assignNewUnits method, of class ItemCtr.
     */
    @Test
    public void testAssignNewUnits() {
        System.out.println("assignNewUnits");
        String itemName = "Test1";
        double itemPrice = 500.50;
        String description = "Test2";
        int maxInStock = 50;
        int minInStock = 10;
        int itemsInStock = 30;
        String brand = "Test3";
        String place = "Test4";
        boolean containUnits = true;
        int itemQuantity = 10;
        ItemCtr instance = new ItemCtr();
        int itemID = instance.createItem(itemName, itemPrice, description,
                maxInStock, minInStock, itemsInStock, brand, place,
                containUnits);
        instance.assignNewUnits(itemID, itemQuantity);
        int expResult = itemsInStock + itemQuantity;
        int result = instance.getItem(itemID).getUnitList().size();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of assignStartUnits method, of class ItemCtr.
     */
    @Test
    public void testAssignStartUnits() {
        System.out.println("assignStartUnits");
        String itemName = "Test1";
        double itemPrice = 500.50;
        String description = "Test2";
        int maxInStock = 50;
        int minInStock = 10;
        int itemsInStock = 30;
        String brand = "Test3";
        String place = "Test4";
        boolean containUnits = true;
        ItemCtr instance = new ItemCtr();
        int itemID = instance.createItem(itemName, itemPrice, description,
                maxInStock, minInStock, itemsInStock, brand, place,
                containUnits);
        int expResult = itemsInStock;
        int result = instance.getItem(itemID).getUnitList().size();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of removeAlotOfUnits method, of class ItemCtr.
     */
    @Test
    public void testRemoveAlotOfUnits() {
        System.out.println("removeAlotOfUnits");
        String itemName = "Test1";
        double itemPrice = 500.50;
        String description = "Test2";
        int maxInStock = 50;
        int minInStock = 10;
        int itemsInStock = 30;
        String brand = "Test3";
        String place = "Test4";
        boolean containUnits = true;
        ItemCtr instance = new ItemCtr();
        int itemID = instance.createItem(itemName, itemPrice, description,
                maxInStock, minInStock, itemsInStock, brand, place,
                containUnits);
        int itemQuantity = 20;
        instance.removeAlotOfUnits(itemID, itemQuantity);
        int expResult = itemsInStock - itemQuantity;
        int result = instance.getItem(itemID).getUnitList().size();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of generateSerialNo method, of class ItemCtr.
     */
    @Test
    public void testGenerateSerialNo() {
        System.out.println("generateSerialNo");
        String itemName = "Test1";
        double itemPrice = 500.50;
        String description = "Test2";
        int maxInStock = 50;
        int minInStock = 10;
        int itemsInStock = 30;
        String brand = "Test3";
        String place = "Test4";
        boolean containUnits = true;
        ItemCtr instance = new ItemCtr();
        instance.createItem(itemName, itemPrice, description,
                maxInStock, minInStock, itemsInStock, brand, place,
                containUnits);
        int expResult = 31;
        int result = instance.generateSerialNo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of updateItemName method, of class ItemCtr.
     */
    @Test
    public void testUpdateItemName() {
        System.out.println("updateItemName");
        String itemName = "Test1";
        double itemPrice = 500.50;
        String description = "Test2";
        int maxInStock = 50;
        int minInStock = 10;
        int itemsInStock = 30;
        String brand = "Test3";
        String place = "Test4";
        boolean containUnits = true;
        String newItemName = "Test10";
        ItemCtr instance = new ItemCtr();
        int itemID = instance.createItem(itemName, itemPrice, description,
                maxInStock, minInStock, itemsInStock, brand, place,
                containUnits);
        instance.updateItemName(itemID, newItemName);
        String result = instance.getItem(itemID).getItemName();
        String expResult = newItemName;
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of updateItemPrice method, of class ItemCtr.
     */
    @Test
    public void testUpdateItemPrice() {
        System.out.println("updateItemPrice");
        String itemName = "Test1";
        double itemPrice = 500.50;
        String description = "Test2";
        int maxInStock = 50;
        int minInStock = 10;
        int itemsInStock = 30;
        String brand = "Test3";
        String place = "Test4";
        boolean containUnits = true;
        double newItemPrice = 1000;
        ItemCtr instance = new ItemCtr();
        int itemID = instance.createItem(itemName, itemPrice, description,
                maxInStock, minInStock, itemsInStock, brand, place,
                containUnits);
        instance.updateItemPrice(itemID, newItemPrice);
        double result = instance.getItem(itemID).getItemPrice();
        double expResult = newItemPrice;
        assertEquals(expResult, result, 1);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of updateDescription method, of class ItemCtr.
     */
    @Test
    public void testUpdateDescription() {
        System.out.println("updateDescription");
        String itemName = "Test1";
        double itemPrice = 500.50;
        String description = "Test2";
        int maxInStock = 50;
        int minInStock = 10;
        int itemsInStock = 30;
        String brand = "Test3";
        String place = "Test4";
        boolean containUnits = true;
        String newDescription = "Test10";
        ItemCtr instance = new ItemCtr();
        int itemID = instance.createItem(itemName, itemPrice, description,
                maxInStock, minInStock, itemsInStock, brand, place,
                containUnits);
        instance.updateDescription(itemID, newDescription);
        String result = instance.getItem(itemID).getDescription();
        String expResult = newDescription;
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of updateMaxInStock method, of class ItemCtr.
     */
    @Test
    public void testUpdateMaxInStock() {
        System.out.println("updateMaxInStock");
        String itemName = "Test1";
        double itemPrice = 500.50;
        String description = "Test2";
        int maxInStock = 50;
        int minInStock = 10;
        int itemsInStock = 30;
        String brand = "Test3";
        String place = "Test4";
        boolean containUnits = true;
        int newMaxInStock = 60;
        ItemCtr instance = new ItemCtr();
        int itemID = instance.createItem(itemName, itemPrice, description,
                maxInStock, minInStock, itemsInStock, brand, place,
                containUnits);
        instance.updateMaxInStock(itemID, newMaxInStock);
        int result = instance.getItem(itemID).getMaxInStock();
        int expResult = newMaxInStock;
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of updateMinInStock method, of class ItemCtr.
     */
    @Test
    public void testUpdateMinInStock() {
        System.out.println("updateMinInStock");
        String itemName = "Test1";
        double itemPrice = 500.50;
        String description = "Test2";
        int maxInStock = 50;
        int minInStock = 10;
        int itemsInStock = 30;
        String brand = "Test3";
        String place = "Test4";
        boolean containUnits = true;
        int newMinInStock = 5;
        ItemCtr instance = new ItemCtr();
        int itemID = instance.createItem(itemName, itemPrice, description,
                maxInStock, minInStock, itemsInStock, brand, place,
                containUnits);
        instance.updateMinInStock(itemID, newMinInStock);
        int result = instance.getItem(itemID).getMinInStock();
        int expResult = newMinInStock;
        assertEquals(expResult, result);
        instance.updateMinInStock(itemID, minInStock);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of updateItemsInStock method, of class ItemCtr.
     */
    @Test
    public void testUpdateItemsInStock() {
        System.out.println("updateItemsInStock");
        String itemName = "Test1";
        double itemPrice = 500.50;
        String description = "Test2";
        int maxInStock = 50;
        int minInStock = 10;
        int itemsInStock = 30;
        String brand = "Test3";
        String place = "Test4";
        boolean containUnits = true;
        int itemQuantity = 10; //antal unit-objekter, som skal tilføjes
        int newItemsInStock = 40;
        ItemCtr instance = new ItemCtr();
        int itemID = instance.createItem(itemName, itemPrice, description,
                maxInStock, minInStock, itemsInStock, brand, place,
                containUnits);
        instance.updateItemsInStock(itemID, newItemsInStock, itemQuantity);
        int result = instance.getItem(itemID).getItemsInStock();
        int expResult = newItemsInStock;
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of updateBrand method, of class ItemCtr.
     */
    @Test
    public void testUpdateBrand() {
        System.out.println("updateBrand");
        String itemName = "Test1";
        double itemPrice = 500.50;
        String description = "Test2";
        int maxInStock = 50;
        int minInStock = 10;
        int itemsInStock = 30;
        String brand = "Test3";
        String place = "Test4";
        boolean containUnits = true;
        String newBrand = "Test10";
        ItemCtr instance = new ItemCtr();
        int itemID = instance.createItem(itemName, itemPrice, description,
                maxInStock, minInStock, itemsInStock, brand, place,
                containUnits);
        instance.updateBrand(itemID, newBrand);
        String result = instance.getItem(itemID).getBrand();
        String expResult = newBrand;
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of updatePlace method, of class ItemCtr.
     */
    @Test
    public void testUpdatePlace() {
        System.out.println("updatePlace");
        String itemName = "Test1";
        double itemPrice = 500.50;
        String description = "Test2";
        int maxInStock = 50;
        int minInStock = 10;
        int itemsInStock = 30;
        String brand = "Test3";
        String place = "Test4";
        boolean containUnits = true;
        String newPlace = "Test10";
        ItemCtr instance = new ItemCtr();
        int itemID = instance.createItem(itemName, itemPrice, description,
                maxInStock, minInStock, itemsInStock, brand, place,
                containUnits);
        instance.updatePlace(itemID, newPlace);
        String result = instance.getItem(itemID).getPlace();
        String expResult = newPlace;
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

//    /**
//     * Test of getFirstUnit method, of class ItemCtr.
//     */
//    @Test
//    public void testGetFirstUnit() {
//        System.out.println("getFirstUnit");
//        int itemID = 0;
//        ItemCtr instance = new ItemCtr();
//        Unit expResult = null;
//        Unit result = instance.getFirstUnit(itemID);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
}

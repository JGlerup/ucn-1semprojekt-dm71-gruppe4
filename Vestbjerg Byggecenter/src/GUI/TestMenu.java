/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * testMenu.java
 *
 * Created on 13-06-2010, 19:13:16
 */
package GUI;

import Ctr.CustomerCtr;
import Ctr.EmployeeCtr;
import Ctr.ItemCtr;

/**
 *
 * @author Erik M. Gravesen
 */
public class TestMenu extends javax.swing.JPanel {

    private ItemCtr itemCtr;
    private EmployeeCtr employeeCtr;
    private CustomerCtr customerCtr;
    private Lagerstyring lagerstyring;
//    private Kundehaandtering kundehaandtering;

    /** Creates new form testMenu */
    public TestMenu() {
        initComponents();
        itemCtr = new ItemCtr();
        employeeCtr = new EmployeeCtr();
        customerCtr = new CustomerCtr();
        lagerstyring = new Lagerstyring();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();

        jButton1.setText("Opret testobjekter");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addContainerGap(376, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jButton1)
                .addContainerGap(377, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void createItems() {
        String itemName = "Bosch Køleskab";
        double itemPrice = 4499;
        String description = "Test2";
        int maxInStock = 500;
        int minInStock = 10;
        int itemsInStock = 30;
        String brand = "Test3";
        String place = "Test4";
        boolean containUnits = true;

        itemCtr.createItem(itemName, itemPrice, description,
                maxInStock, minInStock, itemsInStock, brand, place,
                containUnits);

        itemName = "Solarlampe";
        itemPrice = 9.95;
        description = "Børste stål, H.38 cm, 1 LED";
        maxInStock = 500;
        minInStock = 10;
        itemsInStock = 100;
        brand = "Test3";
        place = "Test4";
        containUnits = true;

        itemCtr.createItem(itemName, itemPrice, description,
                maxInStock, minInStock, itemsInStock, brand, place,
                containUnits);

        itemName = "Cylinder krukke";
        itemPrice = 99.95;
        description = "Sort eller hvid. Glaseret. 27 x 28 cm";
        maxInStock = 500;
        minInStock = 10;
        itemsInStock = 60;
        brand = "Test3";
        place = "Test4";
        containUnits = true;

        itemCtr.createItem(itemName, itemPrice, description,
                maxInStock, minInStock, itemsInStock, brand, place,
                containUnits);

        itemName = "Hammer";
        itemPrice = 10;
        description = "Tja";
        maxInStock = 500;
        minInStock = 10;
        itemsInStock = 300;
        brand = "Test3";
        place = "Test4";
        containUnits = false;

        itemCtr.createItem(itemName, itemPrice, description,
                maxInStock, minInStock, itemsInStock, brand, place,
                containUnits);
    }

    private void createEmployees() {
        String name = "Gert Hansen";
        String address = "Grønnegade 12";
        String phone = "98352010";
        employeeCtr.createEmployee(name, address, phone);

        name = "Benny Hill";
        address = "Yellow street 12";
        phone = "98352017";
        employeeCtr.createEmployee(name, address, phone);

        name = "Kaj Hjorth";
        address = "Hobrovej 14";
        phone = "98352012";
        employeeCtr.createEmployee(name, address, phone);
    }

    private void createCustomer() {
        String name = "Jens Jensen";
        String address = "Grønnegade 12";
        String phone = "98352010";
        customerCtr.createCustomer(name, address, phone);

        name = "Børge Hansen";
        address = "Yellow street 12";
        phone = "98352017";
        customerCtr.createCustomer(name, address, phone);

        name = "Bent Hedegaard";
        address = "Hobrovej 14";
        phone = "98352012";
        customerCtr.createCustomer(name, address, phone);
    }


    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        createItems();
        createEmployees();
        createCustomer();
    }//GEN-LAST:event_jButton1ActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    // End of variables declaration//GEN-END:variables
}

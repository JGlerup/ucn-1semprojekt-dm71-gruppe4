/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Udlejning.java
 *
 * Created on 14-06-2010, 19:56:01
 */
package GUI;

import Ctr.CustomerCtr;
import Ctr.RentCtr;
import Ctr.RentableItemCtr;
import Model.Rent;
import Model.RentableItem;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Erik M. Gravesen
 */
public class Udlejning extends javax.swing.JPanel {

    private RentableItemCtr rentableItemCtr;
    private RentCtr rentCtr;
    private CustomerCtr customerCtr;
    private TableRentableItem tblRentableItem;
    private TableRent tblRent;

    /** Creates new form Udlejning */
    public Udlejning() {
        initComponents();
        rentableItemCtr = new RentableItemCtr();
        rentCtr = new RentCtr();
        customerCtr = new CustomerCtr();
        tblRentableItem = new TableRentableItem();
        tblRent = new TableRent();
    }

    public void updateRentableItemList() {
        ArrayList<RentableItem> rentableItemList = rentableItemCtr.getRentableItemList();
        tblRentableItem.setData(rentableItemList);
        tblRentableItemList.setModel(tblRentableItem);
        this.setVisible(true);
    }

    public void updateRentList() {
        ArrayList<Rent> rentList = rentCtr.getRentContainer();
        tblRent.setData(rentList);
        tblRentList.setModel(tblRent);
        this.setVisible(true);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pRentableItemList = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblRentableItemList = new javax.swing.JTable();
        btnRentableItemSearch = new javax.swing.JButton();
        txtRentableItemSearch = new javax.swing.JTextField();
        pCreateRentableItem = new javax.swing.JPanel();
        lblpCreateRentableItemName = new javax.swing.JLabel();
        btnOpretUdlejningsvare = new javax.swing.JButton();
        txtOpretUdlejningsvareNavn = new javax.swing.JTextField();
        pDeliverRentableItem = new javax.swing.JPanel();
        lblDeliverRentableItemID = new javax.swing.JLabel();
        txtDeliverRentableItemID = new javax.swing.JTextField();
        btnDeliverRentableItem = new javax.swing.JButton();
        pRentRentableItem = new javax.swing.JPanel();
        lblRentRentableItemID = new javax.swing.JLabel();
        txtRentRentableItemID = new javax.swing.JTextField();
        btnRentRentableItem = new javax.swing.JButton();
        lblRentRentableItemCustomerID = new javax.swing.JLabel();
        txtRentRentableItemCustomerID = new javax.swing.JTextField();
        lblRentRentableItemDate = new javax.swing.JLabel();
        txtRentRentableItemDate = new javax.swing.JTextField();
        lblRentRentableItemStatus = new javax.swing.JLabel();
        txtRentRentableItemStatus = new javax.swing.JTextField();
        pRemoveRentableItem = new javax.swing.JPanel();
        lblRemoveRentableItemID = new javax.swing.JLabel();
        txtRemoveRentableItemID = new javax.swing.JTextField();
        btnRemoveRentableItem = new javax.swing.JButton();
        pRentList = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblRentList = new javax.swing.JTable();
        btnRentSearch = new javax.swing.JButton();
        txtRentSearch = new javax.swing.JTextField();

        pRentableItemList.setBorder(javax.swing.BorderFactory.createTitledBorder("Udljeningsvarer"));

        tblRentableItemList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Udlejningsvare-ID", "Navn", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblRentableItemList);

        btnRentableItemSearch.setText("Søg");
        btnRentableItemSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRentableItemSearchActionPerformed(evt);
            }
        });

        txtRentableItemSearch.setText("Indtast udlejningsvare-ID");
        txtRentableItemSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRentableItemSearchActionPerformed(evt);
            }
        });
        txtRentableItemSearch.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtRentableItemSearchFocusGained(evt);
            }
        });

        javax.swing.GroupLayout pRentableItemListLayout = new javax.swing.GroupLayout(pRentableItemList);
        pRentableItemList.setLayout(pRentableItemListLayout);
        pRentableItemListLayout.setHorizontalGroup(
            pRentableItemListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pRentableItemListLayout.createSequentialGroup()
                .addComponent(btnRentableItemSearch)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtRentableItemSearch, javax.swing.GroupLayout.DEFAULT_SIZE, 465, Short.MAX_VALUE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 522, Short.MAX_VALUE)
        );
        pRentableItemListLayout.setVerticalGroup(
            pRentableItemListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pRentableItemListLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pRentableItemListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRentableItemSearch)
                    .addComponent(txtRentableItemSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pCreateRentableItem.setBorder(javax.swing.BorderFactory.createTitledBorder("Opret udlejningsvare"));
        pCreateRentableItem.setPreferredSize(new java.awt.Dimension(190, 88));

        lblpCreateRentableItemName.setText("Navn");

        btnOpretUdlejningsvare.setText("Opret");
        btnOpretUdlejningsvare.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOpretUdlejningsvareActionPerformed(evt);
            }
        });

        txtOpretUdlejningsvareNavn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOpretUdlejningsvareNavnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pCreateRentableItemLayout = new javax.swing.GroupLayout(pCreateRentableItem);
        pCreateRentableItem.setLayout(pCreateRentableItemLayout);
        pCreateRentableItemLayout.setHorizontalGroup(
            pCreateRentableItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pCreateRentableItemLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pCreateRentableItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pCreateRentableItemLayout.createSequentialGroup()
                        .addComponent(lblpCreateRentableItemName)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                        .addComponent(txtOpretUdlejningsvareNavn, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnOpretUdlejningsvare, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        pCreateRentableItemLayout.setVerticalGroup(
            pCreateRentableItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pCreateRentableItemLayout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addGroup(pCreateRentableItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblpCreateRentableItemName)
                    .addComponent(txtOpretUdlejningsvareNavn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnOpretUdlejningsvare))
        );

        pDeliverRentableItem.setBorder(javax.swing.BorderFactory.createTitledBorder("Aflever udlejningsvare"));

        lblDeliverRentableItemID.setText("ID");

        txtDeliverRentableItemID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDeliverRentableItemIDActionPerformed(evt);
            }
        });

        btnDeliverRentableItem.setText("Aflever");
        btnDeliverRentableItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeliverRentableItemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pDeliverRentableItemLayout = new javax.swing.GroupLayout(pDeliverRentableItem);
        pDeliverRentableItem.setLayout(pDeliverRentableItemLayout);
        pDeliverRentableItemLayout.setHorizontalGroup(
            pDeliverRentableItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pDeliverRentableItemLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pDeliverRentableItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pDeliverRentableItemLayout.createSequentialGroup()
                        .addComponent(lblDeliverRentableItemID)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                        .addComponent(txtDeliverRentableItemID, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnDeliverRentableItem, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        pDeliverRentableItemLayout.setVerticalGroup(
            pDeliverRentableItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pDeliverRentableItemLayout.createSequentialGroup()
                .addGroup(pDeliverRentableItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDeliverRentableItemID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDeliverRentableItemID))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDeliverRentableItem))
        );

        pRentRentableItem.setBorder(javax.swing.BorderFactory.createTitledBorder("Udlån udlejningsvare"));

        lblRentRentableItemID.setText("ID");

        txtRentRentableItemID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRentRentableItemIDActionPerformed(evt);
            }
        });

        btnRentRentableItem.setText("Udlån");
        btnRentRentableItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRentRentableItemActionPerformed(evt);
            }
        });

        lblRentRentableItemCustomerID.setText("Kunde-ID");

        txtRentRentableItemCustomerID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRentRentableItemCustomerIDActionPerformed(evt);
            }
        });

        lblRentRentableItemDate.setText("Afl. dato");

        txtRentRentableItemDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRentRentableItemDateActionPerformed(evt);
            }
        });

        lblRentRentableItemStatus.setText("Status");

        txtRentRentableItemStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRentRentableItemStatusActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pRentRentableItemLayout = new javax.swing.GroupLayout(pRentRentableItem);
        pRentRentableItem.setLayout(pRentRentableItemLayout);
        pRentRentableItemLayout.setHorizontalGroup(
            pRentRentableItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pRentRentableItemLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pRentRentableItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnRentRentableItem, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pRentRentableItemLayout.createSequentialGroup()
                        .addGroup(pRentRentableItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblRentRentableItemStatus)
                            .addComponent(lblRentRentableItemDate)
                            .addComponent(lblRentRentableItemID)
                            .addComponent(lblRentRentableItemCustomerID))
                        .addGap(18, 18, 18)
                        .addGroup(pRentRentableItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtRentRentableItemCustomerID, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
                            .addComponent(txtRentRentableItemID, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
                            .addComponent(txtRentRentableItemDate, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
                            .addComponent(txtRentRentableItemStatus, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE))))
                .addContainerGap())
        );
        pRentRentableItemLayout.setVerticalGroup(
            pRentRentableItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pRentRentableItemLayout.createSequentialGroup()
                .addGroup(pRentRentableItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRentRentableItemCustomerID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblRentRentableItemCustomerID))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pRentRentableItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRentRentableItemDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblRentRentableItemDate))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pRentRentableItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRentRentableItemStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblRentRentableItemStatus))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pRentRentableItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRentRentableItemID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblRentRentableItemID))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRentRentableItem))
        );

        pRemoveRentableItem.setBorder(javax.swing.BorderFactory.createTitledBorder("Slet udlejningsvare"));

        lblRemoveRentableItemID.setText("ID");

        txtRemoveRentableItemID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRemoveRentableItemIDActionPerformed(evt);
            }
        });

        btnRemoveRentableItem.setText("Slet");
        btnRemoveRentableItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveRentableItemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pRemoveRentableItemLayout = new javax.swing.GroupLayout(pRemoveRentableItem);
        pRemoveRentableItem.setLayout(pRemoveRentableItemLayout);
        pRemoveRentableItemLayout.setHorizontalGroup(
            pRemoveRentableItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pRemoveRentableItemLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pRemoveRentableItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pRemoveRentableItemLayout.createSequentialGroup()
                        .addComponent(lblRemoveRentableItemID)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                        .addComponent(txtRemoveRentableItemID, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnRemoveRentableItem, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        pRemoveRentableItemLayout.setVerticalGroup(
            pRemoveRentableItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pRemoveRentableItemLayout.createSequentialGroup()
                .addGroup(pRemoveRentableItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRemoveRentableItemID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblRemoveRentableItemID))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnRemoveRentableItem))
        );

        pRentList.setBorder(javax.swing.BorderFactory.createTitledBorder("Udlejninger"));

        tblRentList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Lån-ID", "Dato", "Status", "Kunde-ID", "Udlejningsvare-ID"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblRentList);

        btnRentSearch.setText("Søg");
        btnRentSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRentSearchActionPerformed(evt);
            }
        });

        txtRentSearch.setText("Indtast udlejningsvare-ID");
        txtRentSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRentSearchActionPerformed(evt);
            }
        });
        txtRentSearch.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtRentSearchFocusGained(evt);
            }
        });

        javax.swing.GroupLayout pRentListLayout = new javax.swing.GroupLayout(pRentList);
        pRentList.setLayout(pRentListLayout);
        pRentListLayout.setHorizontalGroup(
            pRentListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 522, Short.MAX_VALUE)
            .addGroup(pRentListLayout.createSequentialGroup()
                .addComponent(btnRentSearch)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtRentSearch, javax.swing.GroupLayout.DEFAULT_SIZE, 465, Short.MAX_VALUE))
        );
        pRentListLayout.setVerticalGroup(
            pRentListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pRentListLayout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addGroup(pRentListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRentSearch)
                    .addComponent(txtRentSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pRentList, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pRentableItemList, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pCreateRentableItem, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pRemoveRentableItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pRentRentableItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pDeliverRentableItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pRentableItemList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pCreateRentableItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(pRemoveRentableItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pRentRentableItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addComponent(pDeliverRentableItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(pRentList, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnOpretUdlejningsvareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOpretUdlejningsvareActionPerformed
        // TODO add your handling code here:
        String rentableItemName = txtOpretUdlejningsvareNavn.getText();
        rentableItemCtr.createItem(rentableItemName);
        updateRentableItemList();
    }//GEN-LAST:event_btnOpretUdlejningsvareActionPerformed

    private void txtOpretUdlejningsvareNavnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOpretUdlejningsvareNavnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtOpretUdlejningsvareNavnActionPerformed

    private void txtRentableItemSearchFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtRentableItemSearchFocusGained
        // TODO add your handling code here:
        txtRentableItemSearch.setText("");
    }//GEN-LAST:event_txtRentableItemSearchFocusGained

    private void txtRentableItemSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRentableItemSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRentableItemSearchActionPerformed

    private void txtDeliverRentableItemIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDeliverRentableItemIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDeliverRentableItemIDActionPerformed

    private void btnDeliverRentableItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeliverRentableItemActionPerformed
        // TODO add your handling code here:
        try {
            int rentableItemID = Integer.parseInt(txtDeliverRentableItemID.getText());
            if (rentableItemCtr.getItem(rentableItemID) != null) {
                rentCtr.deliverItem(rentableItemID);
                updateRentableItemList();
                updateRentList();
            } else {
                JOptionPane.showMessageDialog(this, "Udlejningsvare-ID'et " + rentableItemID + " eksisterer ikke");
            }
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(this, "Skal være et heltal");
        }
    }//GEN-LAST:event_btnDeliverRentableItemActionPerformed

    private void txtRentRentableItemIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRentRentableItemIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRentRentableItemIDActionPerformed

    private void btnRentRentableItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRentRentableItemActionPerformed
        // TODO add your handling code here:
        try {
            int customerID = Integer.parseInt(txtRentRentableItemCustomerID.getText());
            int rentableItemID = Integer.parseInt(txtRentRentableItemID.getText());
            String date = txtRentRentableItemDate.getText();
            String status = txtRentRentableItemStatus.getText();
            if (customerCtr.getCustomer(customerID) == null) {
                JOptionPane.showMessageDialog(this, "Kunde-ID'et " + customerID + " eksisterer ikke");
            } else {
                if (rentableItemCtr.getItem(rentableItemID) == null) {
                    JOptionPane.showMessageDialog(this, "Udlejningsvare-ID'et " + rentableItemID + " eksisterer ikke");
                } else {
                    if (rentableItemCtr.getItem(rentableItemID).getIsRented() == true) {
                        JOptionPane.showMessageDialog(this, "Udlejningsvaren med ID'et " + rentableItemID
                                + " er allerede udlånt til en kunde med ID'et " + customerID);
                    } else {
                        rentCtr.rentItem(rentableItemID, date, status, customerID);
                        updateRentableItemList();
                        updateRentList();
                    }
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Fejl: " + e.getMessage());
        }

    }//GEN-LAST:event_btnRentRentableItemActionPerformed

    private void txtRentRentableItemCustomerIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRentRentableItemCustomerIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRentRentableItemCustomerIDActionPerformed

    private void txtRentRentableItemDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRentRentableItemDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRentRentableItemDateActionPerformed

    private void txtRentRentableItemStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRentRentableItemStatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRentRentableItemStatusActionPerformed

    private void txtRemoveRentableItemIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRemoveRentableItemIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRemoveRentableItemIDActionPerformed

    private void btnRemoveRentableItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveRentableItemActionPerformed
        // TODO add your handling code here:
        try {
            int rentableItemID = Integer.parseInt(txtRemoveRentableItemID.getText());
            RentableItem ri = rentableItemCtr.getItem(rentableItemID);
            if (ri == null) {
                JOptionPane.showMessageDialog(this, "Udlejningsvare-ID'et " + rentableItemID + " eksisterer ikke");
            } else {
                if (ri.getIsRented() == true) {
                    JOptionPane.showMessageDialog(this, "Udlejningsvaren med ID'et " + rentableItemID + " kan ikke slettes, da denne er udlånt");
                } else {
                    rentableItemCtr.deleteRentableItem(rentableItemID);
                    updateRentableItemList();
                    updateRentList();
                    JOptionPane.showMessageDialog(this, "Udlejningsvaren med ID'et " + rentableItemID + " blev slettet");
                }
            }
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(this, "Skal være et heltal");
        }

    }//GEN-LAST:event_btnRemoveRentableItemActionPerformed

    private void btnRentableItemSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRentableItemSearchActionPerformed
        // TODO add your handling code here:
        try {
            int rentableItemID = Integer.parseInt(txtRentableItemSearch.getText());
            if (rentableItemCtr.getItem(rentableItemID) != null) {
                txtRentableItemSearch.setText("");
                int rows = tblRentableItemList.getModel().getRowCount();
                int col = 0;
                for (int i = 0; i < rows; i++) {
                    int value = (Integer) tblRentableItemList.getModel().getValueAt(i, col);
                    if (value == rentableItemID) {
                        tblRentableItemList.setRowSelectionInterval(i, i);
                        tblRentableItemList.addRowSelectionInterval(i, i);
                        tblRentableItemList.scrollRectToVisible(tblRentableItemList.getCellRect(i, i, true));
                    }
                }
            } else {
                JOptionPane.showMessageDialog(this, "ID'et " + rentableItemID + " blev ikke fundet");
            }
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(this, "Skal være et heltal");
            txtRentableItemSearch.setText("");
        }
    }//GEN-LAST:event_btnRentableItemSearchActionPerformed

    private void btnRentSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRentSearchActionPerformed
        // TODO add your handling code here:
        try {
            int rentID = Integer.parseInt(txtRentSearch.getText());
            if (rentCtr.getRent(rentID) != null) {
                txtRentSearch.setText("");
                int rows = tblRentList.getModel().getRowCount();
                int col = 0;
                for (int i = 0; i < rows; i++) {
                    int value = (Integer) tblRentList.getModel().getValueAt(i, col);
                    if (value == rentID) {
                        tblRentList.setRowSelectionInterval(i, i);
                        tblRentList.addRowSelectionInterval(i, i);
                        tblRentList.scrollRectToVisible(tblRentList.getCellRect(i, i, true));
                    }
                }
            } else {
                JOptionPane.showMessageDialog(this, "ID'et " + rentID + " blev ikke fundet");
            }
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(this, "Skal være et heltal");
            txtRentSearch.setText("");
        }
    }//GEN-LAST:event_btnRentSearchActionPerformed

    private void txtRentSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRentSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRentSearchActionPerformed

    private void txtRentSearchFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtRentSearchFocusGained
        // TODO add your handling code here:
        txtRentSearch.setText("");
    }//GEN-LAST:event_txtRentSearchFocusGained
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDeliverRentableItem;
    private javax.swing.JButton btnOpretUdlejningsvare;
    private javax.swing.JButton btnRemoveRentableItem;
    private javax.swing.JButton btnRentRentableItem;
    private javax.swing.JButton btnRentSearch;
    private javax.swing.JButton btnRentableItemSearch;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblDeliverRentableItemID;
    private javax.swing.JLabel lblRemoveRentableItemID;
    private javax.swing.JLabel lblRentRentableItemCustomerID;
    private javax.swing.JLabel lblRentRentableItemDate;
    private javax.swing.JLabel lblRentRentableItemID;
    private javax.swing.JLabel lblRentRentableItemStatus;
    private javax.swing.JLabel lblpCreateRentableItemName;
    private javax.swing.JPanel pCreateRentableItem;
    private javax.swing.JPanel pDeliverRentableItem;
    private javax.swing.JPanel pRemoveRentableItem;
    private javax.swing.JPanel pRentList;
    private javax.swing.JPanel pRentRentableItem;
    private javax.swing.JPanel pRentableItemList;
    private javax.swing.JTable tblRentList;
    private javax.swing.JTable tblRentableItemList;
    private javax.swing.JTextField txtDeliverRentableItemID;
    private javax.swing.JTextField txtOpretUdlejningsvareNavn;
    private javax.swing.JTextField txtRemoveRentableItemID;
    private javax.swing.JTextField txtRentRentableItemCustomerID;
    private javax.swing.JTextField txtRentRentableItemDate;
    private javax.swing.JTextField txtRentRentableItemID;
    private javax.swing.JTextField txtRentRentableItemStatus;
    private javax.swing.JTextField txtRentSearch;
    private javax.swing.JTextField txtRentableItemSearch;
    // End of variables declaration//GEN-END:variables
}

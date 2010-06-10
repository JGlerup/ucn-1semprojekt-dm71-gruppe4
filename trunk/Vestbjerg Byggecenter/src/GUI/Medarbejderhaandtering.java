/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Medarbejderhaandtering.java
 *
 * Created on 10-06-2010, 10:13:25
 */

package GUI;

import Ctr.EmployeeCtr;
import Model.Employee;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Erik
 */
public class Medarbejderhaandtering extends javax.swing.JPanel {
    private EmployeeCtr employeeCtr;
    private TableEmployee tblEmployee;
    private int employeeIDUpdate;


    /** Creates new form Medarbejderhaandtering */
    public Medarbejderhaandtering() {
        initComponents();
        tblEmployee = new TableEmployee();
        employeeCtr = new EmployeeCtr();
        employeeIDUpdate = 0;
    }

        public void updateEmployeeList() {
        ArrayList<Employee> employeeList = employeeCtr.getEmployeeList();
        tblEmployee.setData(employeeList);
        tblEmployeeList.setModel(tblEmployee);
        this.setVisible(true);
    }

    public void resetFields(JTextField[] textFields) {
        for (JTextField txtField : textFields) {
            txtField.setText("");
        }
    }

    public void enableFields(JTextField[] textFields) {
        for (JTextField txtField : textFields) {
            txtField.setEnabled(true);
        }
    }

    public void disableFields(JTextField[] textFields) {
        for (JTextField txtField : textFields) {
            txtField.setEnabled(false);
        }
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        pSearchEmployee = new javax.swing.JPanel();
        btnEmployeeSeach = new javax.swing.JButton();
        txtEmployeeSearch = new javax.swing.JTextField();
        pEmployeeList = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEmployeeList = new javax.swing.JTable();
        pCreateEmployee = new javax.swing.JPanel();
        lblEmployeeName = new java.awt.Label();
        txtCreateEmployeeName = new javax.swing.JTextField();
        lblEmployeeAddress = new java.awt.Label();
        txtCreateEmployeeAddress = new javax.swing.JTextField();
        lblCreateEmployeePhone = new java.awt.Label();
        txtCreateEmployeePhone = new javax.swing.JTextField();
        btnEmployeeCreateEmployee = new javax.swing.JButton();
        pDeleteEmployee = new javax.swing.JPanel();
        txtDeleteEmployee = new javax.swing.JTextField();
        btnDeleteEmployee = new javax.swing.JButton();
        pUpdateEmployee = new javax.swing.JPanel();
        lblUpdateEmployeeName = new java.awt.Label();
        txtUpdateEmployeeName = new javax.swing.JTextField();
        lblUpdateEmployeeAddress = new java.awt.Label();
        txtUpdateEmployeeAddress = new javax.swing.JTextField();
        lblUpdateEmployeePhone = new java.awt.Label();
        txtUpdateEmployeePhone = new javax.swing.JTextField();
        btnUpdateEmployee = new javax.swing.JButton();
        btnUpdateEmployeeGetEmployee = new javax.swing.JButton();
        txtUpdateEmployeeGetEmployee = new javax.swing.JTextField();

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Medarbejderhåndtering"));
        jPanel1.setPreferredSize(new java.awt.Dimension(1024, 768));
        jPanel1.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jPanel1ComponentShown(evt);
            }
        });

        pSearchEmployee.setBorder(javax.swing.BorderFactory.createTitledBorder("Søg medarbejder"));

        btnEmployeeSeach.setText("Søg");
        btnEmployeeSeach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmployeeSeachActionPerformed(evt);
            }
        });

        txtEmployeeSearch.setText("Indtast medarbejder-ID");
        txtEmployeeSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmployeeSearchActionPerformed(evt);
            }
        });
        txtEmployeeSearch.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtEmployeeSearchFocusGained(evt);
            }
        });

        javax.swing.GroupLayout pSearchEmployeeLayout = new javax.swing.GroupLayout(pSearchEmployee);
        pSearchEmployee.setLayout(pSearchEmployeeLayout);
        pSearchEmployeeLayout.setHorizontalGroup(
            pSearchEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pSearchEmployeeLayout.createSequentialGroup()
                .addComponent(btnEmployeeSeach)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtEmployeeSearch, javax.swing.GroupLayout.DEFAULT_SIZE, 573, Short.MAX_VALUE)
                .addContainerGap())
        );
        pSearchEmployeeLayout.setVerticalGroup(
            pSearchEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pSearchEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(btnEmployeeSeach)
                .addComponent(txtEmployeeSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pEmployeeList.setBorder(javax.swing.BorderFactory.createTitledBorder("Medarbejderliste"));

        tblEmployeeList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Medarbejder-ID", "Navn", "Adresse", "Tlfnr.", "Omsætning"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblEmployeeList);

        javax.swing.GroupLayout pEmployeeListLayout = new javax.swing.GroupLayout(pEmployeeList);
        pEmployeeList.setLayout(pEmployeeListLayout);
        pEmployeeListLayout.setHorizontalGroup(
            pEmployeeListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pEmployeeListLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 624, Short.MAX_VALUE)
                .addContainerGap())
        );
        pEmployeeListLayout.setVerticalGroup(
            pEmployeeListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pEmployeeListLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(228, Short.MAX_VALUE))
        );

        pCreateEmployee.setBorder(javax.swing.BorderFactory.createTitledBorder("Opret medarbejder"));

        lblEmployeeName.setText("Navn");

        lblEmployeeAddress.setText("Adresse");

        lblCreateEmployeePhone.setText("Tlfnr.");

        btnEmployeeCreateEmployee.setText("Opret");
        btnEmployeeCreateEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmployeeCreateEmployeeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pCreateEmployeeLayout = new javax.swing.GroupLayout(pCreateEmployee);
        pCreateEmployee.setLayout(pCreateEmployeeLayout);
        pCreateEmployeeLayout.setHorizontalGroup(
            pCreateEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pCreateEmployeeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pCreateEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pCreateEmployeeLayout.createSequentialGroup()
                        .addGroup(pCreateEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCreateEmployeePhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblEmployeeAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblEmployeeName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addGroup(pCreateEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCreateEmployeeName, javax.swing.GroupLayout.DEFAULT_SIZE, 237, Short.MAX_VALUE)
                            .addComponent(txtCreateEmployeeAddress, javax.swing.GroupLayout.DEFAULT_SIZE, 237, Short.MAX_VALUE)
                            .addComponent(txtCreateEmployeePhone, javax.swing.GroupLayout.DEFAULT_SIZE, 237, Short.MAX_VALUE)))
                    .addComponent(btnEmployeeCreateEmployee, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        pCreateEmployeeLayout.setVerticalGroup(
            pCreateEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pCreateEmployeeLayout.createSequentialGroup()
                .addGroup(pCreateEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblEmployeeName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCreateEmployeeName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pCreateEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblEmployeeAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCreateEmployeeAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pCreateEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtCreateEmployeePhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCreateEmployeePhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnEmployeeCreateEmployee)
                .addContainerGap())
        );

        pDeleteEmployee.setBorder(javax.swing.BorderFactory.createTitledBorder("Slet medarbejder"));

        btnDeleteEmployee.setText("Slet");
        btnDeleteEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteEmployeeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pDeleteEmployeeLayout = new javax.swing.GroupLayout(pDeleteEmployee);
        pDeleteEmployee.setLayout(pDeleteEmployeeLayout);
        pDeleteEmployeeLayout.setHorizontalGroup(
            pDeleteEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pDeleteEmployeeLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(btnDeleteEmployee)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtDeleteEmployee, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                .addContainerGap())
        );
        pDeleteEmployeeLayout.setVerticalGroup(
            pDeleteEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pDeleteEmployeeLayout.createSequentialGroup()
                .addGroup(pDeleteEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDeleteEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDeleteEmployee))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pUpdateEmployee.setBorder(javax.swing.BorderFactory.createTitledBorder("Opdater medarbejder"));

        lblUpdateEmployeeName.setText("Navn");

        txtUpdateEmployeeName.setEnabled(false);

        lblUpdateEmployeeAddress.setText("Adresse");

        txtUpdateEmployeeAddress.setEnabled(false);

        lblUpdateEmployeePhone.setText("Tlfnr.");

        txtUpdateEmployeePhone.setEnabled(false);

        btnUpdateEmployee.setText("Opdater");
        btnUpdateEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateEmployeeActionPerformed(evt);
            }
        });

        btnUpdateEmployeeGetEmployee.setText("Hent");
        btnUpdateEmployeeGetEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateEmployeeGetEmployeeActionPerformed(evt);
            }
        });

        txtUpdateEmployeeGetEmployee.setText("Indtast medarbejder-ID");
        txtUpdateEmployeeGetEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUpdateEmployeeGetEmployeeActionPerformed(evt);
            }
        });
        txtUpdateEmployeeGetEmployee.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtUpdateEmployeeGetEmployeeFocusGained(evt);
            }
        });

        javax.swing.GroupLayout pUpdateEmployeeLayout = new javax.swing.GroupLayout(pUpdateEmployee);
        pUpdateEmployee.setLayout(pUpdateEmployeeLayout);
        pUpdateEmployeeLayout.setHorizontalGroup(
            pUpdateEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pUpdateEmployeeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pUpdateEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pUpdateEmployeeLayout.createSequentialGroup()
                        .addGroup(pUpdateEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblUpdateEmployeePhone, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
                            .addComponent(lblUpdateEmployeeName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblUpdateEmployeeAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnUpdateEmployeeGetEmployee))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pUpdateEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtUpdateEmployeeGetEmployee, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)
                            .addComponent(txtUpdateEmployeeAddress, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)
                            .addComponent(txtUpdateEmployeePhone, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)
                            .addComponent(txtUpdateEmployeeName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)))
                    .addComponent(btnUpdateEmployee, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        pUpdateEmployeeLayout.setVerticalGroup(
            pUpdateEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pUpdateEmployeeLayout.createSequentialGroup()
                .addGroup(pUpdateEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUpdateEmployeeGetEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUpdateEmployeeGetEmployee))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pUpdateEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblUpdateEmployeeName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUpdateEmployeeName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pUpdateEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblUpdateEmployeeAddress, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUpdateEmployeeAddress, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pUpdateEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtUpdateEmployeePhone, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUpdateEmployeePhone, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnUpdateEmployee)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pEmployeeList, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pSearchEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pUpdateEmployee, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pCreateEmployee, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pDeleteEmployee, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(pSearchEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pEmployeeList, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(pCreateEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(pDeleteEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(pUpdateEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 734, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnEmployeeSeachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmployeeSeachActionPerformed
        // TODO add your handling code here:
        try {
            int employeeID = Integer.parseInt(txtEmployeeSearch.getText());
            if (employeeCtr.getEmployee(employeeID) != null) {
                employeeCtr.getEmployee(employeeID);
                txtEmployeeSearch.setText("");
                int rows = tblEmployeeList.getModel().getRowCount();
                int col = 0;
                for (int i = 0; i < rows; i++) {
                    int value = (Integer) tblEmployeeList.getModel().getValueAt(i, col);
                    if (value == employeeID) {
                        tblEmployeeList.setRowSelectionInterval(i, i);
                        tblEmployeeList.addRowSelectionInterval(i, i);
                        tblEmployeeList.scrollRectToVisible(tblEmployeeList.getCellRect(i, i, true));
                    }
                }
            } else {
                JOptionPane.showMessageDialog(this, "ID'et " + employeeID + " blev ikke fundet");
            }
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(this, "Skal være et heltal");
            txtEmployeeSearch.setText("");
        }
}//GEN-LAST:event_btnEmployeeSeachActionPerformed

    private void txtEmployeeSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmployeeSearchActionPerformed
        // TODO add your handling code here:
        txtEmployeeSearch.setText("");
}//GEN-LAST:event_txtEmployeeSearchActionPerformed

    private void txtEmployeeSearchFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEmployeeSearchFocusGained
        // TODO add your handling code here:
        txtEmployeeSearch.setText("");
}//GEN-LAST:event_txtEmployeeSearchFocusGained

    private void btnEmployeeCreateEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmployeeCreateEmployeeActionPerformed
        // TODO add your handling code here:
        try {
            String employeeName = txtCreateEmployeeName.getText();
            String employeeAddress = txtCreateEmployeeAddress.getText();
            String employeePhone = txtCreateEmployeePhone.getText();
            JTextField[] txtFields = {txtCreateEmployeeName,
            txtCreateEmployeeAddress, txtCreateEmployeePhone};
                        if (employeeName.trim().isEmpty() || employeeAddress.trim().isEmpty() || employeePhone.trim().isEmpty()){
                            JOptionPane.showMessageDialog(this, "Udfyld venligst alle felterne");
                        } else {
                            int employeeID = employeeCtr.createEmployee(employeeName, employeeAddress, employeePhone);
                            updateEmployeeList();
                            resetFields(txtFields);
                            JOptionPane.showMessageDialog(this, "En medarbejder med ID'et " + employeeID);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Fejl: " + e.getMessage());
        }
    }//GEN-LAST:event_btnEmployeeCreateEmployeeActionPerformed

    private void btnDeleteEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteEmployeeActionPerformed
        // TODO add your handling code here:
        int employeeID = 0;
        try {
            employeeID = Integer.parseInt(txtDeleteEmployee.getText());
            if (employeeCtr.getEmployee(employeeID) != null) {
                employeeCtr.deleteEmployee(employeeID);
                updateEmployeeList();
                txtDeleteEmployee.setText("");
                //Efterfølgende er for at nulstille opdater vare vinduet.
                //Dette forhindrer brugeren at opdaterer en vare,
                //som ikke eksisterer.
                JTextField[] txtFields = {txtUpdateEmployeeName, txtUpdateEmployeeAddress,
                txtUpdateEmployeePhone};
                resetFields(txtFields);
                disableFields(txtFields);
                txtUpdateEmployeeGetEmployee.setText("");
                JOptionPane.showMessageDialog(this, "Varen med ID'et " + employeeID + " blev slettet");

            } else {

                JOptionPane.showMessageDialog(this, "ID'et " + employeeID + " blev ikke fundet");
                txtDeleteEmployee.setText("");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Skal være et heltal");
            txtDeleteEmployee.setText("");
        }
    }//GEN-LAST:event_btnDeleteEmployeeActionPerformed

    private void btnUpdateEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateEmployeeActionPerformed
        // TODO add your handling code here:
        try {
            //            int employeeID = Integer.parseInt(txtUpdateEmployeegetEmployee.getText());
            //            if (employeeID == 0) {
            //                throw new IllegalStateException();
            //            }
            String employeeName = txtUpdateEmployeeName.getText();
            String employeeAddress = txtUpdateEmployeeAddress.getText();
            String employeePhone = txtUpdateEmployeePhone.getText();
            employeeCtr.updateEmployee(employeeIDUpdate, employeeName, employeeAddress, employeePhone);
            JTextField[] txtFields = {txtUpdateEmployeeName, txtUpdateEmployeeAddress,
            txtUpdateEmployeePhone};
            updateEmployeeList();
            resetFields(txtFields);
            disableFields(txtFields);
            txtUpdateEmployeeGetEmployee.setText("");
            JOptionPane.showMessageDialog(this, "Medarbejderen med ID'et " + employeeIDUpdate + " er blevet opdateret");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Fejl: " + e.getMessage());
        }
}//GEN-LAST:event_btnUpdateEmployeeActionPerformed

    private void btnUpdateEmployeeGetEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateEmployeeGetEmployeeActionPerformed
        // TODO add your handling code here:
        try {
            int employeeID = Integer.parseInt(txtUpdateEmployeeGetEmployee.getText());
            if (employeeCtr.getEmployee(employeeID) != null) {
                employeeIDUpdate = employeeID;
                JTextField[] txtFields = {txtUpdateEmployeeName, txtUpdateEmployeeAddress,
                txtUpdateEmployeePhone};
                enableFields(txtFields);
                txtUpdateEmployeeName.setText(employeeCtr.getEmployee(employeeID).getName());
                txtUpdateEmployeeAddress.setText(employeeCtr.getEmployee(employeeID).getAddress());
                txtUpdateEmployeePhone.setText(employeeCtr.getEmployee(employeeID).getPhone());
            } else {
                JOptionPane.showMessageDialog(this, "ID'et blev ikke fundet");
            }
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(this, "Skal være et heltal");
        }
}//GEN-LAST:event_btnUpdateEmployeeGetEmployeeActionPerformed

    private void txtUpdateEmployeeGetEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUpdateEmployeeGetEmployeeActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_txtUpdateEmployeeGetEmployeeActionPerformed

    private void txtUpdateEmployeeGetEmployeeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUpdateEmployeeGetEmployeeFocusGained
        // TODO add your handling code here:
        txtUpdateEmployeeGetEmployee.setText("");
}//GEN-LAST:event_txtUpdateEmployeeGetEmployeeFocusGained

    private void jPanel1ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jPanel1ComponentShown
        // TODO add your handling code here:
}//GEN-LAST:event_jPanel1ComponentShown


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDeleteEmployee;
    private javax.swing.JButton btnEmployeeCreateEmployee;
    private javax.swing.JButton btnEmployeeSeach;
    private javax.swing.JButton btnUpdateEmployee;
    private javax.swing.JButton btnUpdateEmployeeGetEmployee;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private java.awt.Label lblCreateEmployeePhone;
    private java.awt.Label lblEmployeeAddress;
    private java.awt.Label lblEmployeeName;
    private java.awt.Label lblUpdateEmployeeAddress;
    private java.awt.Label lblUpdateEmployeeName;
    private java.awt.Label lblUpdateEmployeePhone;
    private javax.swing.JPanel pCreateEmployee;
    private javax.swing.JPanel pDeleteEmployee;
    private javax.swing.JPanel pEmployeeList;
    private javax.swing.JPanel pSearchEmployee;
    private javax.swing.JPanel pUpdateEmployee;
    private javax.swing.JTable tblEmployeeList;
    private javax.swing.JTextField txtCreateEmployeeAddress;
    private javax.swing.JTextField txtCreateEmployeeName;
    private javax.swing.JTextField txtCreateEmployeePhone;
    private javax.swing.JTextField txtDeleteEmployee;
    private javax.swing.JTextField txtEmployeeSearch;
    private javax.swing.JTextField txtUpdateEmployeeAddress;
    private javax.swing.JTextField txtUpdateEmployeeGetEmployee;
    private javax.swing.JTextField txtUpdateEmployeeName;
    private javax.swing.JTextField txtUpdateEmployeePhone;
    // End of variables declaration//GEN-END:variables

}

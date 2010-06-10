package GUI;

import Model.Customer;
import javax.swing.table.*;
import java.util.ArrayList;

public class TableCustomer extends DefaultTableModel {

    private ArrayList<Customer> data;

    public TableCustomer() {
        data = new ArrayList<Customer>();
    }

    @Override
    public boolean isCellEditable(int row, int column) {
        return false;
    }

    public void setData(ArrayList<Customer> data) {
        this.data = data;
        fireTableDataChanged();
    }

    public ArrayList<Customer> getData() {
        return data;
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public int getRowCount() {
        if (data == null) {
            return 0;
        } else {
            return data.size();
        }
    }

    @Override
    public String getColumnName(int column) {
        String columnName = "";
        switch (column) {
            case 0:
                columnName = "Kunde-ID";
                break;
            case 1:
                columnName = "Navn";
                break;
            case 2:
                columnName = "Adresse";
                break;
            case 3:
                columnName = "Tlfnr.";
                break;
        }
        return columnName;
    }

    @Override
    public Object getValueAt(int row, int column) {
        Object value = null;
        switch (column) {
            case 0:
                value = data.get(row).getCustomerID();
                break;
            case 1:
                value = data.get(row).getName();
                break;
            case 2:
                value = data.get(row).getAddress();
                break;
            case 3:
                value = data.get(row).getPhone();
                break;
        }

        return value;
    }
}

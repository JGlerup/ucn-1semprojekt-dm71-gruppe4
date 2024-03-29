package GUI;

import javax.swing.table.*;
import java.util.ArrayList;
import Model.*;

public class TableRent extends DefaultTableModel {

    private ArrayList<Rent> data;

    public TableRent() {
        data = new ArrayList<Rent>();
    }

    @Override
    public boolean isCellEditable(int row, int column) {
        return false;
    }

    public void setData(ArrayList<Rent> data) {
        this.data = data;
        fireTableDataChanged();
    }

    public ArrayList<Rent> getData() {
        return data;
    }

    @Override
    public int getColumnCount() {
        return 5;
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
                columnName = "Lån - ID";
                break;
            case 1:
                columnName = "Dato";
                break;
            case 2:
                columnName = "Status";
                break;
            case 3:
                columnName = "Kunde";
                break;
            case 4:
                columnName = "Udlejningsvare-ID";
                break;
        }
        return columnName;
    }

    @Override
    public Object getValueAt(int row, int column) {
        Object value = null;
        switch (column) {
            case 0:
                value = data.get(row).getID();
                break;
            case 1:
                value = data.get(row).getDate();
                break;
            case 2:
                value = data.get(row).getStatus();
                break;
            case 3:
                value = data.get(row).getCustomer().getCustomerID();
                break;
            case 4:
                value = data.get(row).getRentableItem().getID();
                break;
        }

        return value;
    }
}

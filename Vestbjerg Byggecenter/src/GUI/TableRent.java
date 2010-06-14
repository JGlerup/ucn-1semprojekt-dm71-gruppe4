package GUI;

import javax.swing.table.*;
import java.util.ArrayList;
import Model.*;

public class TableRent extends DefaultTableModel {

    private ArrayList<RentableItem> data;

    public TableRent() {
        data = new ArrayList<RentableItem>();
    }

    @Override
    public boolean isCellEditable(int row, int column) {
        return false;
    }

    public void setData(ArrayList<RentableItem> data) {
        this.data = data;
        fireTableDataChanged();
    }

    public ArrayList<RentableItem> getData() {
        return data;
    }

    @Override
    public int getColumnCount() {
        return 3;
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
                columnName = "Udlejnings vare-ID";
                break;
            case 1:
                columnName = "Navn";
                break;
            case 2:
                columnName = "Status";
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
                value = data.get(row).getName();
                break;
            case 2:
                value = data.get(row).getIsRented();
                break;
        }

        return value;
    }
}

package GUI;

import javax.swing.table.*;
import java.util.ArrayList;
import Model.*;

public class TableItem extends DefaultTableModel {

    private ArrayList<Item> data;

    public TableItem() {
        data = new ArrayList<Item>();
    }

    @Override
    public boolean isCellEditable(int row, int column) {
        return false;
    }

    public void setData(ArrayList<Item> data) {
        this.data = data;
        fireTableDataChanged();
    }

    public ArrayList<Item> getData() {
        return data;
    }

    @Override
    public int getColumnCount() {
        return 9;
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
                columnName = "Vare-ID";
                break;
            case 1:
                columnName = "Varenavn";
                break;
            case 2:
                columnName = "Pris";
                break;
            case 3:
                columnName = "Beskrivelse";
                break;
            case 4:
                columnName = "Antal";
                break;
            case 5:
                columnName = "Min.";
                break;
            case 6:
                columnName = "Maks.";
                break;
            case 7:
                columnName = "Brand";
                break;
            case 8:
                columnName = "Lokation";
                break;

        }
        return columnName;
    }

    @Override
    public Object getValueAt(int row, int column) {
        Object value = null;
        switch (column) {
            case 0:
                value = data.get(row).getItemID();
                break;
            case 1:
                value = data.get(row).getItemName();
                break;
            case 2:
                value = data.get(row).getItemPrice();
                break;
            case 3:
                value = data.get(row).getDescription();
                break;
            case 4:
                value = data.get(row).getItemsInStock();
                break;
            case 5:
                value = data.get(row).getMinInStock();
                break;
            case 6:
                value = data.get(row).getMaxInStock();
                break;
            case 7:
                value = data.get(row).getBrand();
                break;
            case 8:
                value = data.get(row).getPlace();
                break;
        }

        return value;
    }
}

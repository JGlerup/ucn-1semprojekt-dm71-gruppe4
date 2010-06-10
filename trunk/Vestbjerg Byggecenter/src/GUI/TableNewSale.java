package GUI;

import javax.swing.table.*;
import java.util.ArrayList;
import Model.SalesLineItem;

public class TableNewSale extends DefaultTableModel {

    private ArrayList<SalesLineItem> data;

    public TableNewSale() {
        data = new ArrayList<SalesLineItem>();
    }

    @Override
    public boolean isCellEditable(int row, int column) {
        return false;
    }

    public void setData(ArrayList<SalesLineItem> data) {
        this.data = data;
        fireTableDataChanged();
    }

    public ArrayList<SalesLineItem> getData() {
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
                columnName = "Salgs vare-ID";
                break;
            case 1:
                columnName = "Antal";
                break;
            case 2:
                columnName = "Total pris";
                break;
            case 3:
                columnName = "Vare ID";
                break;
        }
        return columnName;
    }

    @Override
    public Object getValueAt(int row, int column) {
        Object value = null;
        switch (column) {
            case 0:
                value = data.get(row).getSLIID();
                break;
            case 1:
                value = data.get(row).getQuantity();
                break;
            case 2:
                value = data.get(row).getTotalPrice();
                break;
            case 3:
                value = data.get(row).getItem().getItemID();
                break;
        }

        return value;
    }
}

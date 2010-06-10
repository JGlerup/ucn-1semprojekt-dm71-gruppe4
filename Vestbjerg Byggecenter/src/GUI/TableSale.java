package GUI;

import javax.swing.table.*;
import java.util.ArrayList;
import Model.Sale;

public class TableSale extends DefaultTableModel {

    private ArrayList<Sale> data;

    public TableSale() {
        data = new ArrayList<Sale>();
    }

    @Override
    public boolean isCellEditable(int row, int column) {
        return false;
    }

    public void setData(ArrayList<Sale> data) {
        this.data = data;
        fireTableDataChanged();
    }

    public ArrayList<Sale> getData() {
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
                columnName = "Salgs-ID";
                break;
//            case 1:
//                columnName = "Varenavn";
//                break;
            case 1:
                columnName = "Date";
                break;
            case 2:
                columnName = "Pris";
                break;
        }
        return columnName;
    }

    @Override
    public Object getValueAt(int row, int column) {
        Object value = null;
        switch (column) {
            case 0:
                value = data.get(row).getSaleID();
                break;
//            case 1:
//                value = data.get(row).;
//                break;
            case 1:
                value = data.get(row).getDate();
                break;
            case 2:
                value = data.get(row).getPrice();
                break;
        }

        return value;
    }
}

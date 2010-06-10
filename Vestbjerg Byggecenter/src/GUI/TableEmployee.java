package GUI;

import Model.Employee;
import javax.swing.table.*;
import java.util.ArrayList;

public class TableEmployee extends DefaultTableModel {

    private ArrayList<Employee> data;

    public TableEmployee() {
        data = new ArrayList<Employee>();
    }

    @Override
    public boolean isCellEditable(int row, int column) {
        return false;
    }

    public void setData(ArrayList<Employee> data) {
        this.data = data;
        fireTableDataChanged();
    }

    public ArrayList<Employee> getData() {
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
                columnName = "Medarbejder-ID";
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
            case 4:
                columnName = "Omsætning";
                break;
        }
        return columnName;
    }

    @Override
    public Object getValueAt(int row, int column) {
        Object value = null;
        switch (column) {
            case 0:
                value = data.get(row).getEmployeeID();
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
            case 4:
                value = data.get(row).getTrade();
                break;
        }

        return value;
    }
}

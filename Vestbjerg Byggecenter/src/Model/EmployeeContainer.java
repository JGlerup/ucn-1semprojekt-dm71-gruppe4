/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Model;

import java.util.ArrayList;

/**
 *
 * @author Daniel
 */
public class EmployeeContainer {

    private ArrayList<Employee> employeeList;
    private static EmployeeContainer instance;

    public static EmployeeContainer getInstance()
    {
        if (instance == null)
        {
            instance = new EmployeeContainer();
        }
        return instance;
    }


    public EmployeeContainer()
    {
        employeeList = new ArrayList<Employee>();
    }

    private int generateID()
    {
        int index = 0;
        int newID = 0;
        if(employeeList.size() != 0)
        {
            index = employeeList.size() -1;
            Employee e = employeeList.get(index);
            newID = e.getEmployeeId() + 1;
        }
        else
        {
            newID = 0;
        }
        return newID;
    }


    public void addEmployee(Employee e)
    {
        employeeList.add(e);
    }

    public boolean deleteEmployee(int employeeID)
    {
        int index = 0;
        int storeIndex = 0;
        boolean found = false;
        while(!found && index < employeeList.size())
        {
            if(employeeList.get(index).getEmployeeID() == employeeID)
            {
                storeIndex = index;
                found = true;
            }
            index++;
        }
    }

    private Employee findEmployee(int id)
    {
        Employee e = null;
        for(Employee employee : employeeList)
        {
            if(id == employee.getEmployeeID())
            {
                e = employee;
            }
        }
        return e;
    }


    public boolean updateEmployee(int employeeID, String password)
    {
        Employee e = findEmployee(id);
        if(e != null)
        {
            e.setEmployeeID(employeeID);
            e.setPassword(password);
            return true;
        }
        else
        {
            return false;
        }
    }
}

  

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Model;

import java.util.ArrayList;

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

    public int generateID()
    {
        int index = 0;
        int newID = 0;
        if(employeeList.size() != 0)
        {
            index = employeeList.size() -1;
            Employee e = employeeList.get(index);
            newID = e.getEmployeeID() + 1;
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

    public void deleteEmployee(int employeeID)
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
        employeeList.remove(storeIndex);
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


    public boolean updateEmployee(int id,int employeeID, String password, String name, String address, int phone)
    {
        Employee e = findEmployee(id);
        if(e != null)
        {
            e.setEmployeeID(employeeID);
            e.setPassword(password);
            e.setName(name);
            e.setAddress(address);
            e.setPhone(phone);
            return true;
        }
        else
        {
            return false;
        }
    }

    public String listAllEmployees()
    {
        String outputString = " ";
        for(Employee e : employeeList)
        {
            outputString = outputString + e.getEmployeeID() + " - " + e.getName() + " - " + e.getAddress() + "\n";
        }
        return outputString;
    }

}

  

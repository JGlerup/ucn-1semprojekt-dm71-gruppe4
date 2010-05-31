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

    public int generateID(Employee employee)
    {
        int newID = 1;
        if (employee.getEmployeeID() == 0)
        { 
            if(employeeList.size() != 0)
            {
                int lastIndex = employeeList.size() -1;            
                Employee lastEmployee = employeeList.get(lastIndex);
                newID = lastEmployee.getEmployeeID();
                newID += 1;
            }
            employee.setEmployeeID(newID);
        }
       
        return newID;
    }


    public int addEmployee(Employee employee)
    {
        int employeeID = generateID(employee);
        employeeList.add(employee);
        return employeeID;
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

    public Employee findEmployee(int employeeID)
    {
        Employee e = null;
        for(Employee employee : employeeList)
        {
            if(employeeID == employee.getEmployeeID())
            {
                e = employee;
            }
        }
        return e;
    }

    public Employee getEmployee(int employeeID)
    {
        int index = 0;
        Employee e = null;
        boolean found = false;
        while(!found && index < employeeList.size())
        {
            if(employeeList.get(index).getEmployeeID() == (employeeID))
            {
                e = employeeList.get(index);
                found = true;
            }
            index++;
        }
        return e;
    }


    public boolean updateEmployee(int employeeID, String password, String name, String address, String phone)
    {
        Employee e = findEmployee(employeeID);
        if(e != null)
        {
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

    public ArrayList<Employee> listEmployee()
    {
        return employeeList;
    }

}

  

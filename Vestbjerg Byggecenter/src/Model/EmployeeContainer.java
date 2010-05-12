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

    private ArrayList<Employee> employees;
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
        employees = new ArrayList<Employee>();
    }


    public int addEmployee(Employee employee)
    {
        int newID = 1;
        if (employee.getEmployeeId() == 0)
        {
            if(employees.size() > 0)
            {
                int lastIndex = employees.size()-1;
                Employee lastEmployee = employees.get(lastIndex);
                newID = lastEmployee.getEmployeeId();
                newID += 1;
            }
            employee.setEmployeeId(newID);
        }
        return newID;
    }

    }

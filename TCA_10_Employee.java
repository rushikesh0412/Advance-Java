import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

import javax.lang.model.util.ElementScanner14;

class IDComparator implements Comparator
{
    public int compare(Object ob1, Object ob2)
    {
        Employee e1 = (Employee) ob1;
        Employee e2 = (Employee) ob2;

        if(e1.emp_ID == e2.emp_ID)
        {
            return 0;
        }
        else if(e1.emp_ID > e2.emp_ID)
        {
            return 1;                       //for descending  writre return -1; 
        }
        else
        {
            return -1;                      ////for descending  writre return 1; 
        }


    }
}
class FirstNameComparator implements Comparator
{
    public int compare(Object ob1, Object ob2)
    {
        Employee e1 = (Employee) ob1;
        Employee e2 = (Employee) ob2;

        String name1 = e1.first_Name;
        String name2 = e2.first_Name;

        return name1.compareTo(name2);
        //return name2.compareTo(name1);

    }
}
class LastNameComparator implements Comparator
{
    public int compare(Object ob1, Object ob2)
    {
        Employee e1 = (Employee) ob1;
        Employee e2 = (Employee) ob2;

        String name1 = e1.last_Name;
        String name2 = e2.last_Name;

        return name1.compareTo(name2);
        //return name2.compareTo(name1);

    }
}
class WorkingHourComparator implements Comparator
{
    public int compare(Object ob1, Object ob2)
    {
        Employee e1 = (Employee) ob1;
        Employee e2 = (Employee) ob2;

        if(e1.working_hr == e2.working_hr)
        {
            return 0;
        }
        else if(e1.working_hr > e2.working_hr)
        {
            return 1;                       //for descending  writre return -1; 
        }
        else
        {
            return -1;                      ////for descending  writre return 1; 
        }


    }
}
class SalaryComparator implements Comparator
{
    public int compare(Object ob1, Object ob2)
    {
        Employee e1 = (Employee) ob1;
        Employee e2 = (Employee) ob2;

        if(e1.salary == e2.salary)
        {
            return 0;
        }
        else if(e1.salary > e2.salary)
        {
            return 1;                       //for descending  writre return -1; 
        }
        else
        {
            return -1;                      ////for descending  writre return 1; 
        }


    }
}
class Employee{
    int emp_ID;
    String first_Name;
    String last_Name;
    float working_hr;
    double salary;

    Employee(int emp_ID, String first_Name, String last_Name, float working_hr, double salary)
    {
        this.emp_ID     = emp_ID;
        this.first_Name = first_Name;
        this.last_Name  = last_Name;
        this.working_hr = working_hr;
        this.salary     = salary;
    }
    void display()
    {
        System.out.println(emp_ID + "\t"+first_Name+"\t"+last_Name+"\t"+working_hr+"\t"+salary);
    }

}
public class TCA_10_Employee {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Employee> al = new ArrayList<Employee>();

        System.out.print("How many employee: ");
        int n = Integer.parseInt(br.readLine());

        Employee emp[] = new Employee[n];
        for(int i=0; i<n; i++)
        {
            System.out.println("\n\nEnter Info. Employee "+(i+1)+": ");
            System.out.print("Enter your first name: ");
            String first_Name = br.readLine();

            System.out.print("Enter your last name: ");
            String last_Name  = br.readLine();

            System.out.print("Enter your working hours: ");
            float working_hr  = Float.parseFloat(br.readLine());

            System.out.print("Enter your salary: ");
            double salary     = Double.parseDouble(br.readLine());

            emp[i] = new Employee((101+i), first_Name, last_Name, working_hr, salary);

            al.add(emp[i]);
            
        }

        
        Iterator ir = al.iterator();
        System.out.println("Data: ");

        while(ir.hasNext())
        {
            Employee e = (Employee) ir.next();

            e.display();
        }

        System.out.println("\n\nSorted Data by ID: ");
        
        Collections.sort(al, new IDComparator());
        ir = al.iterator();
        while(ir.hasNext())
        {
            Employee e = (Employee) ir.next();

            e.display();
        }

        System.out.println("\n\nSorted Data by First Name: ");
        Collections.sort(al, new FirstNameComparator());
        ir = al.iterator();
        while(ir.hasNext())
        {
            Employee e = (Employee) ir.next();

            e.display();
        }

        System.out.println("\n\nSorted Data by Last Name: ");
        Collections.sort(al, new LastNameComparator());
        ir = al.iterator();
        while(ir.hasNext())
        {
            Employee e = (Employee) ir.next();

            e.display();
        }

        System.out.println("\n\nSorted Data by Working Hours: ");
        Collections.sort(al, new WorkingHourComparator());
        ir = al.iterator();
        while(ir.hasNext())
        {
            Employee e = (Employee) ir.next();

            e.display();
        }

        System.out.println("\n\nSorted Data by Salary: ");
        Collections.sort(al, new SalaryComparator());

        ir = al.iterator();
        while(ir.hasNext())
        {
            Employee e = (Employee) ir.next();

            e.display();
        }

    }
}

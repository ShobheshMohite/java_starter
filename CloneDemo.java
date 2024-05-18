class Employee implements Cloneable
{
    public int Eid;
    public String Ename;
    public int Salary;
    public Employee(int No,String str,int value)
    {
        this.Eid = No;
        this.Ename = str;
        this.Salary = value;
    }

    public Object clone() throws CloneNotSupportedException 
    {
        return super.clone();
    }
}

public class CloneDemo
{
    public static void main(String Arg[])
    {
        try
        {
            Employee eobj1 = new Employee(1,"Shobhesh",11000);
            Employee eobj2 = (Employee)eobj1.clone();
            
            System.out.println("Name Of First Employee : "+eobj1.Ename);
            System.out.println("Name Of Second Employee : "+eobj2.Ename);

            System.out.println("Salary Of First Employee : "+eobj1.Salary);
            System.out.println("Salary Of Second Employee : "+eobj2.Salary);
            
            System.out.println("ID Of First Employee : "+eobj1.Eid);
            System.out.println("ID Of Second Employee : "+eobj2.Eid);

        } catch(CloneNotSupportedException e)
        {
            
        }
    }
}
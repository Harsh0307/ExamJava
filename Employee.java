class Employee
{
    String FirstName; 
    String lastName;
    int id; 
    float salary; 
    public Employee(String firstName, String lastName, int id, float salary)
    {  
        this.FirstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.salary = salary;
        }

}
class Manager extends Employee
{       
    int department; 
    public Manager(String firstName, String lastName, int id, float salary, int department)
    {       
        super(firstName, lastName, id, salary);
        this.department = department;
        }
        }
 class Program
{   
            public static void main(String[] args)
            {
                Employee e1 = new Employee("John", "Doe", 1, 10000);
                Manager e2 = new Manager("Jane", "Doe", 2, 20000, 5);
                System.out.println(e1.FirstName);
                System.out.println(e1.lastName);
                System.out.println(e1.id);
                System.out.println(e1.salary);
                System.out.println(e2.FirstName);
                System.out.println(e2.lastName);
                System.out.println(e2.id);
                System.out.println(e2.salary);
                System.out.println(e2.department);
                }
                }

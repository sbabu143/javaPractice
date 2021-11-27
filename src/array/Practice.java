package array;

public class Practice {
    int empId;
    String empName;
    int empsalary;
    String empDepart;

     Practice(int Id, String Name, int salary, String Depart)
    {

         empId=Id;
         empName=Name;
         empsalary=salary;
         empDepart=Depart;
    }
    void display()
    {
        System.out.println(empId);
        System.out.println(empName);
        System.out.println(empsalary);
        System.out.println(empDepart);
    }

    public static void main(String[] args)
    {
        Practice em1=new Practice(1234,"Raju",5000,"Account");
        em1.display();

        Practice em2=new Practice(5678,"Vinod",10000,"Marketing");
        em2.display();

    }
}

import java.util.Scanner;

class class_object{
    String name;
    int eid;
    float salary;
    String address;
   void setdata(String n,int id,float s)
    {
        name=n;
        eid=id;
        salary=s;
    }
    void input()
    {
        System.out.println("Enter the employee name id Salary and his address one by one");
        Scanner sc=new Scanner(System.in);
        String n=sc.nextLine();
        int id=sc.nextInt();
        float s=sc.nextFloat();
        setdata(n,id,s);
    }
    void show()
    {
        System.out.println("name:"+name);
        System.out.println("employee id: "+eid);
        System.out.println("salary : "+salary);
    }

    public static void main(String[]args)
    {
        class_object emp1,emp2,emp3;
        emp1=new class_object();
        emp1.input();
        emp1.show();
        emp2=new class_object();
        emp2.input();
        emp2.show();
        emp3=new class_object();
        emp3.input();
        emp3.show();

    }
}
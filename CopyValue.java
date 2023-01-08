/*//Copying values without constructor

class CopyValue{
    
    String name;
    int RollNO;

    CopyValue()
    {

    }

    CopyValue(String n,int R)
    {
        this.name=n;
        this.RollNO=R;
    }

    // showing the value both student

    void display()
    {
        System.out.println(name+"   "+RollNO);       
    }

     
    
    public static void main(String args[])
    {
           CopyValue student1=new CopyValue("Vishal",78);
           CopyValue student2=new CopyValue();
           student2.name=student1.name;
           student2.RollNO=student1.RollNO;
           student1.display();
           System.out.println("Second student ");
           student2.display();
    }
}*/








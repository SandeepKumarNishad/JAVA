//Java program to initialize the values from one object to another object. 
class Copy{
    String name;
    int id;
    
    // Default constructor

    Copy()
    {
        name="ShriRam";
        id=0;
    }

    // Parameterized constructor

    // I use "this " keyword

    Copy(String name,int id )
    {
         this.name=name;
         this.id=id;
    }
    Copy(Copy e)
    {
        name=e.name;
        id=e.id;
    }
    //display the values being copy
    void display()
    {
        System.out.println("name is:"+name+"id no "+id);
    }

          

    public static void main(String args[])
    {
          Copy c=new Copy("sandeep",143);
          Copy d=new Copy(c);
          c.display();
          d.display();;
    }
}


//Analysis of this program


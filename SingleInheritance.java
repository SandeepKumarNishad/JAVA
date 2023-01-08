// Single inheritance in java 

class Animal{
    void bark()
    {
        System.out.println(" Barking ");
    }

}
class Dog extends Animal{

    void eat()
    {
        System.out.println("eating");

    }
}
class SingleInheritance{

public static void main(String args[])
{
    Dog A=new Dog();
    A.bark();
    A.eat();
}

}
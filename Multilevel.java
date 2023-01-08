// Multilevel  inheritance in java 

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
class Babydog extends Dog{
    void weep()
    {
        System.out.println("Weeping");
    }
}
class Multilevel{
    public static void main(String agrs[]){
                     Babydog b=new Babydog();
                     b.bark();
                     b.eat();
                     b.weep();   
}
}
class Animal{

    void eat()
    {
        System.out.println("Eating");
    }
}
class Dog extends Animal{
    void bark()
    {
        System.out.println("Barking");

    }
}
class Babydog extends Animal{
    void weep()
    {
        System.out.println("Weeping");
    }
}
class cat extends Animal{

    void meau()
    {
        System.out.println("meau,meau");
    }
}
public class Hierarchical{
    public static void main(String agrs[]){
             cat c = new cat();
             c.meau();
             c.eat();

             c.bar();// you will get compile time error
}
}
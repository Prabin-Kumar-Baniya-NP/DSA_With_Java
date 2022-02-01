abstract class LivingCreatures{
    abstract void eat();
    public void walk(){
        System.out.println("I can walk");
    }
}
interface Human{
    abstract void eat();
    public void smell();
}
interface Robot{
    abstract void talk();
    abstract void walk();
}
class Man implements Human, Robot{
    String name;
    int age;
    Man(String name, int age){
        this.name = name;
        this.age = age;
    }
    public void eat(){
        System.out.println("I can eat");
    }
    public void smell(){
        System.out.println("I can smell");
    }
    public void talk(){
        System.out.println("I can talk");
    }
    public void walk(){
        System.out.println("I can walk");
    }
}
class OOPS{
    public static void main(String[] args) {
        Man m = new Man("Prabin", 21);
        System.out.println(m.name);
        System.out.println(m.age);
    }
}
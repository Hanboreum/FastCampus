package fc.java.model;

public class Cat extends Animal{
    public void night(){
        System.out.println("Zzz");
    }
    public void eat(){ //override
        System.out.println("cat: eat");
    }
}

package SelfPractice.Interface;

interface Interface1 {
    default void display() {
        System.out.println( "Interface1::display");
    }
}

interface Interface2 {
    default void display() {
        System.out.println( "Interface2::display");
    }
}

class Ambiguity implements Interface1, Interface2 {

    @Override
    public void display() {
        Interface1.super.display();
        Interface2.super.display();
    }
}

public class AmbiguityProblem {
    public static void main(String[] args) {
        Interface1 inf1 = new Ambiguity();
        inf1.display();

        String s = "Chirayu";
        System.out.println(s.split(""));
    }
}

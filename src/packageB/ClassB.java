package packageB;

import packageA.ClassA;

public class ClassB extends ClassA{
    public static void main(String[] args) {
        ClassA classA = new ClassA();
        System.out.println(classA.a);
    }
}

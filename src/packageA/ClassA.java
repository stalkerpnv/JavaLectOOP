package packageA;

public class ClassA {
    public int a;    // доступен для всех
    int b;           // доступен только в рамках package
    protected int c; // доступен только в рамках package + во всех классах которые наследуются
    private int d;   // доступен только внутри класса
}

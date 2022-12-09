//Object
public class Student implements Cloneable {
    private String name;
    private String lastname;
    private int age;

    public void voice() {
        System.out.println("voice");
    }

    public Student(String name, String lastname, int age) {
        this.name = name;
        this.lastname = lastname;
        this.age = age;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return name + " " +
                lastname + " " +
                age;
    }
    public void setAge(int newAge){
        if(newAge>0) {
            this.age = newAge;
        }
    }
    public int getAge(){
        return age;
    }
}

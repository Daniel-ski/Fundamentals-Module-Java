package x06_OrderByAge;

public class Person {
    private String name;
    private String ID;
    private int age;

    public Person(String name,String ID,int age){
        this.name = name;
        this.ID = ID;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getID() {
        return ID;
    }

    public int getAge() {
        return this.age;
    }

    @Override
    public String toString() {
        return String.format("%s with ID: %s is %d years old.",getName(),getID(),getAge());
    }
}

package edu.pasadena.cs.cs03b;

public abstract class Person {
    private String position;
    private String name;
    private String location;
    private int age;

    public abstract void list();
    
    //Get
    public String getPosition() {
        return position;
    }
    public String getName() {
        return name;
    }
    public String getLocation() {
        return location;
    }
    public int getAge() {
        return age;
    }

    //Set
    public void setPosition(String position) {
        this.position = position;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setLocation(String location) {
        this.location = location;
    }
    public void setAge(int age) {
        this.age = age;
    }
}


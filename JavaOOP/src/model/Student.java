package model;

public class Student {
    private int age;
    private String name;
    private char sex;
    private String id;

    public Student(int age, String name, char sex, String id) {
        this.age = age;
        this.name = name;
        this.sex = sex;
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}

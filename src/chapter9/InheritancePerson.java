package chapter9;

public class InheritancePerson {

    public InheritancePerson(){
        System.out.println("Hello from Person");
    }

    public InheritancePerson(int age){
        System.out.println("Hello from 2nd constructor Person");
    }

    public int decirEdad(){
        int valor = 10;
        return valor * 2;
    }

    public void cambiarEdad(){
        System.out.println("edad 1");
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    private int age;
    private String gender;



}

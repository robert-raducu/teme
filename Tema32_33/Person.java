package Tema32_33;

public class Person {
    private int age;
    private String city;

    Person(int age,String city){
        setAge(age);
        setCity(city);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}

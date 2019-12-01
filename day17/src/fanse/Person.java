package fanse;

public class Person {
    private String nmae;
    private int age;
    public String pub;

    public Person(String nmae, int age, String pub) {
        this.nmae = nmae;
        this.age = age;
        this.pub = pub;
    }

    public String getPub() {
        return pub;
    }

    public void setPub(String pub) {
        this.pub = pub;
    }

    @Override
    public String toString() {
        return "Person{" +
                "nmae='" + nmae + '\'' +
                ", age=" + age +
                '}';
    }


    public Person() {
    }

    public String getNmae() {
        return nmae;
    }

    public void setNmae(String nmae) {
        this.nmae = nmae;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void eat(){
        System.out.println("---eat");
    }
    public void string(String foo){
        System.out.println("---eat"+foo);
    }
}

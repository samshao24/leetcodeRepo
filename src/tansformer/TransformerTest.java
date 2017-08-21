package tansformer;

public class TransformerTest {
    public static void main(String[] args) {
        Parent child = new Child();
        child.setName("Sdfsdf");
        Transformer transformer = new Transformer();
        transformer.check(child);
    }

    void check(Parent parent) {
        check(parent);
    }

    void check(Friend friend) {
        System.out.println("Hitting friend");
    }

    void check(Child child) {
        System.out.println("Hitting child");
    }



}

class Parent {
    private String name;
    private int age;

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
}

class Child extends Parent {
    private String gender;
    private String fun;

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getFun() {
        return fun;
    }

    public void setFun(String fun) {
        this.fun = fun;
    }
}

class Friend extends Parent {
    private String adress;
    private String phone;

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}

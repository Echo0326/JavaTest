package TestUtils;

public class TestPerson {
    public static void main(String[] args) {
        String string=new String("atguigu.com");
        System.out.println("string = " + string);
        Person person1=new Person("Echo");
        String name=person1.getName();
        System.out.println("name = " + name);
    }
}

class Person{
    //属性
    private String name;
    private int age;

    //构造器
    public Person(String name){
        this.name=name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.setAge(26);
        person.setName("Nicolas Vargas");
        person.setPhone(1234567);

        System.out.println("My name is " + person.getName() + ", I have " + person.getAge() + " years old " + "and my phone number is " + person.getPhone());
    }
}
class Person {
    private int age;
    private String name;
    private int phone;

    public void setAge (int age){
        this.age = age;
    }
    public int getAge(){
        return this.age;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void setPhone(int phone){
        this.phone = phone;
    }
    public int getPhone(){
        return this.phone;
    }
}
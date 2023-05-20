public class Person {
    private int age;

    public void setAge(int age) {
        this.age = age;
        System.out.println("Age has been reset!");
    }

    public int getAge() {
        return age;
    }

    public Person(int age) {
        this.setAge(age);
    }
}

public class Main {
    public static void main(String[] args) {
        int a = 0;
        for (int i = 0; i < 10; i ++) a += i;       
        System.out.println("a = " + a);
        System.out.println("Hello world!");
        Person p = new Person(24);
        System.out.println("p.age = " + p.getAge());
    }
}

package exercise1;

public class NoGenericMethodsApp {

    public static void main(String[] args) {
        NoGenericMethods obj1 = new NoGenericMethods("A", "B", "C");
        NoGenericMethods obj2 = new NoGenericMethods("C", "A", "B");
        NoGenericMethods obj3 = new NoGenericMethods("B", "C", "A");

        System.out.println(obj1);
        System.out.println(obj2);
        System.out.println(obj3);
    }
}

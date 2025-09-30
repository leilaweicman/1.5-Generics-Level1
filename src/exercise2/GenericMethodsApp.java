package exercise2;

public class GenericMethodsApp {

    public static void main(String[] args) {
        GenericMethods genericMethod = new GenericMethods();

        Person person = new Person("Alice", "Smith", 30);

        genericMethod.printArguments(person, "Hello", 42);
        genericMethod.printArguments("Hello", person, 42);
        genericMethod.printArguments(42, person, "Hello");
    }
}

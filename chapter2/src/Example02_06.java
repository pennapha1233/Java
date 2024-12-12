public class Example02_06 {
    long id = 6606021610206L;
    String name = "Pennapha";
    String surname = "Kamapate";
    int age = 20;

    public Example02_06() { // constrator method
    }
        

    public static void main(String[] args) {
        String info;
        Example02_06 person = new Example02_06(); // create object
        info = person.name + " " + person.surname;
        info += ", " + person.age + " year old.";
        System.out.println("ID : "+ person.id);
        System.out.println("Data person : " + info);
        System.out.println("======================================");
        person.name = "John";
        person.surname = "Smith";
        person.age = 25;
        info = person.name + " " + person.surname;
        info += ", " + person.age + " year old.";
        System.out.println("ID : " + person.id);
        System.out.println("New data person : " + info);
    }
}
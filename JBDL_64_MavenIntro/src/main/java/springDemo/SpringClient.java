package springDemo;

public class SpringClient {
    public static void main(String[] args) {
//        Student object i want to create with all data name, id, address
        Student student = new Student();
        student.setName("john");
        student.setId(1);
        Address address = new Address();
        address.setCity("hisar");
        address.setPincode("125001");
//        student.setAddress(new Address("hisar", "125001"));
        student.setAddress(address); // who is injecting the dependency -> user
//        // spring wil start doing the same thing, spring will be injecting the dependency
        // spring will inject the dependency -> IOC(control has been inverted )

    }
}

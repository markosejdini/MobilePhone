public class Main {
    public static void main(String[] args) {
        MobilePhone phone = new MobilePhone("68555233");
        Contact cont1 = new Contact("Marko ", "0688555666");
        phone.addNewContact(cont1);
        phone.printContacts();

    }
}

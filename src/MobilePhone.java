import java.util.ArrayList;

public class MobilePhone {

    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone (String phoneNumber) {
        this.myNumber= phoneNumber;
        this.myContacts = new ArrayList<>();
    }
    public boolean addNewContact (Contact contact) {
        if(findContact(contact)>=0){
            System.out.println("Contact exists");
            return false;
        }
        myContacts.add(contact);
        return true;

    }
    public boolean updateContact (Contact contold, Contact contnew) {
        int position = findContact(contold);
        if(position<0) {
            System.out.println(contold.getName()+ " was not found");
            return false;
        }
        myContacts.set(position,contnew);
        System.out.println(contnew.getName()+" was set at index: "+position);
        return true;
    }

    public boolean removeContact (Contact contact) {
        int index = findContact(contact);
        if(index<0) {
            System.out.println(contact.getName()+" Was not found");
            return false;
        }
        myContacts.remove(contact);
        System.out.println(contact.getName()+" Was successfully removed");
        return true;

    }
    public int findContact (Contact contact) {
        return myContacts.indexOf(contact);

    }
    private int findContact(String name) {
        for (int i = 0; i < myContacts.size(); i++) {
            Contact contact = myContacts.get(i);
            if (contact.getName().equals(name)) {
                return i;
            }
        }
        return -1;
    }
    public Contact queryContact (String name) {
        int position = findContact(name);
        if (position >= 0) {
            return myContacts.get(position);
        }
        return null;

    }
    public void printContacts () {
        System.out.println("Contact List:");
        for (int i = 0; i < myContacts.size(); i++) {
            System.out.println((i + 1) + ". " + myContacts.get(i).getName() +
                    " -> " + myContacts.get(i).getPhoneNumber());
        }
    }

    }


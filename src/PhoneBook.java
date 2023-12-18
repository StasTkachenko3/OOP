public class PhoneBook {

    private final Contact[] contacts;

    private int size;

    public PhoneBook() {
        this.contacts = new Contact[10];

    }

    public void addContact(String nick, String number) {
        if (size >= contacts.length) {
            System.out.println("Массив прееполнен ");
        }
        Contact newContact = new Contact(nick, number);
        contacts[size++] = newContact;


    }

    public void removeContact(String nick) {
        for (int i = 0; i < contacts.length; i++) {
            if (contacts[i].getNick().equals(nick)) {
                System.out.println(contacts[i].getNick() + "Удален!!!");
                System.arraycopy(contacts, i + 1, contacts, i, size - i - 1);
                contacts[size - 1] = null;
                size--;
                return;
            }

        }
    }
    public void printAllContacts(){
        for (int i = 0; i < size; i++) {
            Contact contact = contacts[i];
            System.out.println("contact nick" + contact.getNick() + "contatct phone " + contact.getPhoneNumber());

        }
    }
    public int getCurrentSize(){
        return size;
    }
}

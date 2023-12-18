public class Contact {
    private final  String  nick;

    private String phoneNumber;

    public String getNick() {
        return nick;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Contact(String nick, String phoneNumber) {
        this.nick = nick;
        this.phoneNumber = phoneNumber;
    }
}

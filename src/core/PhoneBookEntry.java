package core;

public class PhoneBookEntry {
    String lastName;
    String address;
    String phoneNumber;
    String provider;

    public PhoneBookEntry(String lastName, String address, String phoneNumber, String provider) {
        this.lastName = lastName;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.provider = provider;
    }

    @Override
    public String toString() {
        return "PhoneBookEntry{" +
                "lastName='" + lastName + '\'' +
                ", address='" + address + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", provider='" + provider + '\'' +
                '}';
    }
}

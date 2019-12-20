import core.PhoneBook;
import java.io.FileNotFoundException;


public class Main {

    public static void main(String[] args) {
        String filePath = "phonebook.txt";

        try {
            PhoneBook phoneBook = new PhoneBook(filePath);
            System.out.println(phoneBook.searchByLastName("Shevchenko"));
            System.out.println(phoneBook.searchByAddress("Miroshnichenko 10 st."));
            System.out.println(phoneBook.searchByProvider("A1"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}


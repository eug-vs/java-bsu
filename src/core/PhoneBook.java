package core;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Scanner;


public class PhoneBook {
    private ArrayList<PhoneBookEntry> entries;

    // Hash tables
    private Hashtable<String, ArrayList<Integer>> lastNameHashTable;
    private Hashtable<String, ArrayList<Integer>> addressHashTable;
    private Hashtable<String, ArrayList<Integer>> providerHashTable;


    public PhoneBook(String filePath) throws FileNotFoundException {
        File file = new File(filePath);
        Scanner fileScanner = new Scanner(file);

        ArrayList<PhoneBookEntry> entries = new ArrayList<>();

        while (fileScanner.hasNextLine()) {
            String line = fileScanner.nextLine();

            String[] stringEntry = line.split("\\|");
            PhoneBookEntry entry = new PhoneBookEntry(
                    stringEntry[0],
                    stringEntry[1],
                    stringEntry[2],
                    stringEntry[3]
            );

            entries.add(entry);
        }

        // Init hash tables
        this.lastNameHashTable = new Hashtable<>();
        this.addressHashTable = new Hashtable<>();
        this.providerHashTable = new Hashtable<>();

        for (int i = 0; i < entries.size(); i++) {
            PhoneBookEntry entry = entries.get(i);

            appendHashtable(lastNameHashTable, entry.lastName, i);
            appendHashtable(addressHashTable, entry.address, i);
            appendHashtable(providerHashTable, entry.provider, i);
        }

        this.entries = entries;
    }

    private void appendHashtable(Hashtable<String, ArrayList<Integer>> table, String key, Integer element) {
        ArrayList<Integer> currentHashtableValues = table.get(key);
        if (currentHashtableValues != null) {
            currentHashtableValues.add(element);
            table.put(key, currentHashtableValues);
        } else {
            ArrayList<Integer> singleElementList = new ArrayList<>();
            singleElementList.add(element);

            table.put(key, singleElementList);
        }
    }

    public ArrayList<PhoneBookEntry> searchByLastName(String name) {
        return searchIn(lastNameHashTable, name);
    }

    public ArrayList<PhoneBookEntry> searchByAddress(String address) {
        return searchIn(addressHashTable, address);
    }

    public ArrayList<PhoneBookEntry> searchByProvider(String provider) {
        return searchIn(providerHashTable, provider);
    }

    private ArrayList<PhoneBookEntry> searchIn(Hashtable<String, ArrayList<Integer>> hashtable, String query) {
        ArrayList<Integer> foundIndices = hashtable.getOrDefault(query, new ArrayList<>());

        ArrayList<PhoneBookEntry> foundEntries = new ArrayList<>();
        for (Integer index : foundIndices) {
            foundEntries.add(entries.get(index));
        }

        return foundEntries;
    }

}

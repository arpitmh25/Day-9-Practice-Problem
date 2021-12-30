package com.bridgelabz.day9;

import java.util.ArrayList;

public class AddressBook {

    // Create an arraylist of arraylist to store contact details of all the persons
    private static final ArrayList<ArrayList<String>> address_book = new ArrayList<>();

    // Use Case 1: Create contacts in address book
    public void createContacts(ArrayList<String> contact) {

        // Add contact details of person to address book
        AddressBook.address_book.add(contact);

        // Print contact details of persons in address book
        for (ArrayList<String> i : AddressBook.address_book) {
            for (String j : i) {
                System.out.println(j);
            }
        }
    }
package com.monocept.test;

import com.monocept.model.CustomLinkedList;

public class CustomLinkedListTest {

	public static void main(String[] args) {

		// creating a custom linked list using class CustomLinkedList
		CustomLinkedList list = new CustomLinkedList();

		// Inserting element to the list;
		list.insert(90);
		list.insert(134);
		list.insert(33);
		list.insert(87);
		list.insert(865);

		// Displaying linked list using iterate method
		list.iterate();

		// deleting element using delete method
		list.delete(90);

		// showing linked list after deletion of element 90

		System.out.println("Linked list after deleting element 90 : ");
		list.show();

	}

}

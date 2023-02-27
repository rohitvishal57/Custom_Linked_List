package com.monocept.model;


public class CustomLinkedList {

	private Node head;

	public void insert(int val) {
		Node node = new Node(val);
		node.next = null;
		if (head == null) {
			head = node;
		} else {
			Node temp = head;
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = node;
		}
	}

	public void delete(int val) {
		Node temp = head, prev = null;

		if (temp != null && temp.val == val) {
			head = temp.next;
			return;
		}

		while (temp != null && temp.val != val) {
			prev = temp;
			temp = temp.next;
		}
		if (temp == null)
			return;

		prev.next = temp.next;
	}

	public void show() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.val + " ");
			temp = temp.next;
		}
		System.out.println();
	}

	public void iterate() {

		Node curr = head;
		System.out.println("LinkedList: ");
		while (curr != null) {
			System.out.println(curr.val + " ");
			curr = curr.next;
		}
	}

}

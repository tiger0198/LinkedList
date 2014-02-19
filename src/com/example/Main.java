package com.example;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Node nodeA = new Node("A");
		Node nodeB = new Node("B");
		Node nodeC = new Node("C");
		Node nodeD = new Node("D");
		
		nodeA.setNext(nodeB);
		nodeB.setNext(nodeC);
		nodeC.setNext(nodeD);
		Node head = nodeA;
		System.out.println("####");
		ReverseLinkedList.printList(head);
		head = ReverseLinkedList.reverseFromStartToEnd(head);
		System.out.println("####");
		ReverseLinkedList.printList(head);
		
		
		head = ReverseLinkedList.reverseRecFromStartToEnd(head);
		System.out.println("####");
		ReverseLinkedList.printList(head);
		
		head = ReverseLinkedList.reverseFromEndToStart(head);
		System.out.println("####");
		ReverseLinkedList.printList(head);

	}

	
	
}

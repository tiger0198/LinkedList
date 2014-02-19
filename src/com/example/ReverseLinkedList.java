package com.example;

public class ReverseLinkedList {
	public static Node reverseFromEndToStart(Node head){
		if (head == null || head.getNext() == null){
			return head;
		}
		Node next  = head.getNext();
		head.setNext(null);
		Node newHead = reverseFromEndToStart(next);
		next.setNext(head);
		//return always the last node that become the new head.
		return newHead;
	}
	
	public static Node reverseFromStartToEnd(Node head)
	{
		if (head == null || head.getNext() == null)
			return head;
		Node tail = head.getNext();
		head.setNext(null);
		while(tail!=null){
			Node tmp = tail.getNext();
			tail.setNext(head);
			
			head = tail;
			tail = tmp;
		}
		return head;
	}
	public static Node reverseRecFromStartToEnd(Node head)
	{
		if (head == null || head.getNext() == null)
			return head;
		Node tail = head.getNext();
		head.setNext(null);
		return reverseRecFromStartToEndHelper(head,tail);
	}
	public static Node reverseRecFromStartToEndHelper(Node head,Node tail)
	{
		if (tail == null)
			return head;
		Node tmp = tail.getNext();
		tail.setNext(head);
		head = tail;
		tail = tmp;
		return reverseRecFromStartToEndHelper(head,tail);
				
	}
	public static void printList(Node head){
		
		if (head == null)
			return;
		System.out.println(head.getData());
		printList(head.getNext());
	}
}

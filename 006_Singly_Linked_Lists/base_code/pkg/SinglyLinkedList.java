package pkg;
import java.util.Scanner;
import java.util.Random;


public class SinglyLinkedList {
	Node head;

	/* 
		Postcondition: The head will be null 
	*/
	public SinglyLinkedList() {
		head = null;
	}

	/* 
		Receives an integer position, searches through the SinglyLinkedList for the position and returns the data at that positon
	   	If the position doesn't exist, it returns -1
	*/ 
	public int get(int pos){
		if (pos == 0){
			return head.getData();
		}
		Node next = head;
		for (int i = 0; i < pos; i++){
			if (next == null){
				return -1;
			}
			next = next.getNext();
		}
		return next.getData();
	}

	/*
		Insert a new Node at the given position with the data given
	*/
	public void insert(int pos, int data){
		if (head == null)
		{
			head = new Node(data);
		}
		else if (pos == 0){
			Node headset = new Node(data);
			headset.setNext(head);
			head = headset;
		}
		else{
			Node first = head;

			for (int i = 0; i < pos-1; i++){
				first = first.getNext();
			}
			
			Node between = new Node(data);
			Node after = first.getNext();
			first.setNext(between);
			between.setNext(after);
		}
	}

	/*
		Remove the node at the given position
		If no position exists, don't change the list
	*/
	public void remove(int pos){
		if (pos == 0){
			
		}
	}

	/*
		Swap two Nodes with the two positions given
	*/
	public void swap(int pos1, int pos2){

	}

	/*
		Print all data values in the LinkedList 
	*/
	public void printList(){

	}
}

import pkg.*;
import java.util.*;
import java.time.*;
import java.lang.*;

class main {
	public static void main(String args[]) {
		SinglyLinkedList list = new SinglyLinkedList();
		list.insert(0, 100);
		for (int i = 0; i < 20; i++){
			list.insert(i, i);
		}
		list.insert(1, 8210);
		list.insert(5, 900);
		list.insert(23, 3485);
		for (int i = 0; i < 24; i++){
			System.out.println("Pos: "+ i+" | Data: "+list.get(i));
		}
		System.out.println(list.get(200));

	}
}

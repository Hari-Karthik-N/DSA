package mylist;

import java.util.Scanner;

public class MyLinkedList {
    Scanner input = new Scanner(System.in);
    class Node {
        Node next = null;
        int data;
        Node(int data) {
            this.data = data;
        }
    }
    Node head = null;
    Node tail = null;
    int size = 0;
    void printNode(Node node) {
        System.out.print(node.data);
        if(node.next != null) {
            System.out.print(" --> ");
        }
    }
    void printList() {
        if(size == 0) {
            System.out.println("list is empty");
            return;
        }
        Node temp = head;
        while(temp != null) {
            printNode(temp);
            temp = temp.next;
        }
        System.out.println();
    }
    void insertAtBeginning() {
        System.out.println("Enter the data for the node: ");
        int userData = input.nextInt();
        if(head == null) {
            head = new Node(userData);
            tail = head;
        } else {
            Node temp;
            temp = new Node(userData);
            temp.next = head;
            head = temp;
        }
        size++;
        System.out.println("data entered");
    }
    void deleteAtBeginning() {
        if(size == 0) {
            System.out.println("list is empty");
        } else {
            Node temp;
            temp = head;
            head = temp.next;
            System.out.println("data deleted: " + temp.data);
            temp = null;
            size--;
        }
    }
    void getSize() {
        System.out.println("size of the list: " + size);
    }
    public static void main(String args[]) {
        Scanner input1 = new Scanner(System.in);
        MyLinkedList linkedListObject = new MyLinkedList();
        while(true) {
            System.out.println("1. insert at beginning, 2. delete at beginning, 3. print list, 4. get size");
            int choice = input1.nextInt();
            switch(choice) {
                case 1:
                    linkedListObject.insertAtBeginning();
                    break;
                case 2:
                    linkedListObject.deleteAtBeginning();
                    break;
                case 3:
                    linkedListObject.printList();
                    break;
                case 4:
                    linkedListObject.getSize();
                    break;
                default: return;
            }
        }
    }
}
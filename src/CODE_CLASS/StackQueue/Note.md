# Data Structures and Algorithms - Exam Practice Notes

This document contains Java implementations for various Data Structures and Algorithms, optimized for exam preparation.

## Table of Contents
1. [1D Array in Java](#1-1d-array-in-java)
2. [2D Array in Java](#2-2d-array-in-java)
3. [Stack Implementation using Array](#3-stack-implementation-using-array)
4. [Queue Implementation using Array](#4-queue-implementation-using-array)
5. [Singly Linked List (Insertion at Beginning & End)](#5-singly-linked-list-insertion-at-beginning--end)
6. [Deletion from Beginning & End in Singly Linked List](#6-deletion-from-beginning--end-in-singly-linked-list)
7. [Stack using Linked List](#7-stack-using-linked-list)
8. [Queue using Linked List](#8-queue-using-linked-list)
9. [Doubly Linked List (Insertion & Deletion)](#9-doubly-linked-list-insertion--deletion)
10. [Circular Linked List](#10-circular-linked-list)

---

## 1. 1D Array in Java

```java
public class OneDArray {
    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40, 50};

        System.out.println("Elements of Array:");
        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
```

### Output
```text
Elements of Array:
10
20
30
40
50
```

---

## 2. 2D Array in Java

```java
public class TwoDArray {
    public static void main(String[] args) {
        int arr[][] = {
            {1, 2, 3},
            {4, 5, 6}
        };

        System.out.println("2D Array Elements:");
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
```

### Output
```text
2D Array Elements:
1 2 3
4 5 6
```

---

## 3. Stack Implementation using Array

```java
class StackArray {
    int stack[] = new int[5];
    int top = -1;

    void push(int data) {
        if(top == 4) {
            System.out.println("Stack Overflow");
        } else {
            top++;
            stack[top] = data;
        }
    }

    void pop() {
        if(top == -1) {
            System.out.println("Stack Underflow");
        } else {
            System.out.println("Deleted Element: " + stack[top]);
            top--;
        }
    }

    void display() {
        for(int i = top; i >= 0; i--) {
            System.out.println(stack[i]);
        }
    }

    public static void main(String[] args) {
        StackArray s = new StackArray();
        s.push(10);
        s.push(20);
        s.push(30);

        s.display();
        s.pop();
    }
}
```

### Output
```text
30
20
10
Deleted Element: 30
```

---

## 4. Queue Implementation using Array

```java
class QueueArray {
    int queue[] = new int[5];
    int front = 0, rear = -1;

    void enqueue(int data) {
        if(rear == 4) {
            System.out.println("Queue Full");
        } else {
            rear++;
            queue[rear] = data;
        }
    }

    void dequeue() {
        if(front > rear) {
            System.out.println("Queue Empty");
        } else {
            System.out.println("Deleted: " + queue[front]);
            front++;
        }
    }

    void display() {
        for(int i = front; i <= rear; i++) {
            System.out.println(queue[i]);
        }
    }

    public static void main(String[] args) {
        QueueArray q = new QueueArray();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        q.display();
        q.dequeue();
    }
}
```

### Output
```text
10
20
30
Deleted: 10
```

---

## 5. Singly Linked List (Insertion at Beginning & End)

```java
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        next = null;
    }
}

public class SinglyLinkedList {
    Node head = null;

    void insertBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    void insertEnd(int data) {
        Node newNode = new Node(data);

        if(head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while(temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    void display() {
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        list.insertBeginning(10);
        list.insertEnd(20);
        list.insertEnd(30);

        list.display();
    }
}
```

### Output
```text
10 -> 20 -> 30 -> null
```

---

## 6. Deletion from Beginning & End in Singly Linked List

```java
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

public class DeleteLinkedList {
    Node head = null;

    void insert(int data) {
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while(temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    void deleteBeginning() {
        if(head != null) {
            head = head.next;
        }
    }

    void deleteEnd() {
        if(head == null || head.next == null) {
            head = null;
            return;
        }
        Node temp = head;
        while(temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
    }

    void display() {
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        DeleteLinkedList d = new DeleteLinkedList();
        d.insert(10);
        d.insert(20);
        d.insert(30);

        d.deleteBeginning();
        d.deleteEnd();

        d.display();
    }
}
```

### Output
```text
20
```

---

## 7. Stack using Linked List

```java
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

public class StackLinkedList {
    Node top = null;

    void push(int data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
    }

    void pop() {
        if(top == null) {
            System.out.println("Stack Empty");
        } else {
            System.out.println("Deleted: " + top.data);
            top = top.next;
        }
    }

    void display() {
        Node temp = top;
        while(temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        StackLinkedList s = new StackLinkedList();
        s.push(10);
        s.push(20);
        s.push(30);

        s.display();
        s.pop();
    }
}
```

### Output
```text
30
20
10
Deleted: 30
```

---

## 8. Queue using Linked List

```java
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

public class QueueLinkedList {
    Node front = null;
    Node rear = null;

    void enqueue(int data) {
        Node newNode = new Node(data);
        if(rear == null) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
    }

    void dequeue() {
        if(front == null) {
            System.out.println("Queue Empty");
        } else {
            System.out.println("Deleted: " + front.data);
            front = front.next;
            if(front == null) rear = null;
        }
    }

    void display() {
        Node temp = front;
        while(temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        QueueLinkedList q = new QueueLinkedList();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        q.display();
        q.dequeue();
    }
}
```

### Output
```text
10
20
30
Deleted: 10
```

---

## 9. Doubly Linked List (Insertion & Deletion)

```java
class Node {
    int data;
    Node prev, next;

    Node(int data) {
        this.data = data;
    }
}

public class DoublyLinkedList {
    Node head = null;

    void insert(int data) {
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while(temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.prev = temp;
        }
    }

    void delete() {
        if(head == null || head.next == null) {
            head = null;
            return;
        }
        Node temp = head;
        while(temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
    }

    void display() {
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        DoublyLinkedList d = new DoublyLinkedList();
        d.insert(10);
        d.insert(20);
        d.insert(30);

        d.delete();
        d.display();
    }
}
```

### Output
```text
10 20
```

---

## 10. Circular Linked List

```java
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

public class CircularLinkedList {
    Node head = null;

    void insert(int data) {
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
            newNode.next = head;
        } else {
            Node temp = head;
            while(temp.next != head) {
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.next = head;
        }
    }

    void display() {
        if(head == null) return;
        Node temp = head;
        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while(temp != head);
        System.out.println();
    }

    public static void main(String[] args) {
        CircularLinkedList c = new CircularLinkedList();
        c.insert(10);
        c.insert(20);
        c.insert(30);

        c.display();
    }
}
```

### Output
```text
10 20 30
```

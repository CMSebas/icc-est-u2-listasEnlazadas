package models;

public class LinkedList <T> {
    private Node<T> head;
    private int size = 0;
    
    public void appendToTail(T value) {
        if (head == null) {
            head = new Node<>(value);
            size++;
            return;
        }
        Node<T> current = head;
        while (current.getNext() != null) {
            current = current.getNext();
        }
        current.setNext(new Node<>(value));
        size++;
    }


public T findByValue(T value) {
        Node<T> current = head;
        while (current != null) {
            if (current.getValue().equals(value)) return current.getValue();
            current = current.getNext();
        }
        return null;
    }




public void deleteByValue(T value) {
    if (head == null)
        return;

    if (head.getValue().equals(value)) {
        head = head.getNext();
        size--;
        return;
    }

    Node<T> current = head;
    while (current.getNext() != null) {
        if (current.getNext().getValue().equals(value)) {
            current.setNext(current.getNext().getNext());
            size--;
            return;
        }
        current = current.getNext();
    }
}

public void print() {
    if (head == null) {
        return;
    }
    Node<T> current = head;
    while (current.getNext() != null) {
    
        current = current.getNext();
    }
    System.out.println(current.getValue());
}

public int getSize() {
    return size;
}


public Node<T> getHead() {
    return head;
}


public void setHead(Node<T> head) {
    this.head = head;
}


public void setSize(int size) {
    this.size = size;
}





    
}

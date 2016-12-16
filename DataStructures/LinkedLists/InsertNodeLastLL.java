/*
   Insert Node at the end of a linked list
   head pointer input could be NULL as well for empty list
   Node is defined as
   class Node {
   int data;
   Node next;
   }
   */
Node Insert(Node head,int data) {
  if ( head == null ) {
    // ugly but only the default constructor exist
    Node newNode = new Node();
    newNode.data = data;
    newNode.next = null;
    head = newNode;
  }
  else {
    Node last = get(head);
    Node newNode = new Node();
    newNode.data = data;
    newNode.next = null;
    last.next = newNode;
  }
  return head;
}

Node get(Node iter) {
  if ( iter.next == null) return iter;
  return get(iter.next);
}

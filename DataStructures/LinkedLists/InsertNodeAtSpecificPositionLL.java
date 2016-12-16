/*
  Insert Node at a given position in a linked list 
  head can be NULL 
  First element in the linked list is at position 0
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
    
Node InsertNth(Node head, int data, int position) {
   if ( position == 0) {
       Node temp = head;
       head = new Node();
       head.data = data;
       head.next = temp;
   }
   else {
     // fetch item before the specified position and add node after that one
     // set newNode.next to prev.next doesn't matter if it's null or not 
     Node prev = get(head, position-1, 0);
     Node next = prev.next;
     Node newNode = new Node();
     newNode.data = data;
     prev.next = newNode;
     newNode.next = next;
    }
    return head;
}


Node get(Node iter, int searchIndex, int curIndex) {
    if ( searchIndex == curIndex) return iter;
    return get(iter.next, searchIndex, curIndex+1);
}

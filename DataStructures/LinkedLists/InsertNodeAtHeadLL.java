Node Insert(Node head,int x) {
  if ( head == null) {
    head = new Node();
    head.data = x;
    head.next = null;
  }
  else {
    Node oldhead = head;
    head = new Node();
    head.data = x;
    head.next = oldhead;
  }
  return head;
}

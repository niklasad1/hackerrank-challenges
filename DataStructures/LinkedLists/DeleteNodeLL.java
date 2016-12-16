Node Delete(Node head, int position) {
  if ( head == null ) return null;

  if (position == 0) head = head.next;
  else {
    Node prev = get(head, position-1, 0);
    prev.next = prev.next.next;
  }
  return head;
}

Node get(Node iter, int searchIndex, int curIndex) {
  if ( searchIndex == curIndex) return iter;
  return get(iter.next, searchIndex, curIndex+1);
}

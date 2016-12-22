/*

   class Node
   int data;
   Node left;
   Node right;
   */
void LevelOrder(Node root)
{
  LinkedList<Node> queue = new LinkedList<Node>();
  queue.add(root);
  while ( queue.size() > 0 ) {
    Node n = queue.removeFirst();
    System.out.print(n.data + " ");
    if ( n.left != null) queue.add(n.left);
    if ( n.right != null) queue.add(n.right);
  }

}

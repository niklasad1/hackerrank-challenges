/*
 *    class Node
 *    int data;
 *    Node left;
 *    Node right;
 */

void top_view(Node root)
{
  if ( root == null) return;
  leftSubtree(root.left);
  System.out.print(root.data + " ");
  rightSubtree(root.right);
}

void leftSubtree(Node n) {
  if ( n == null) return;
  leftSubtree(n.left);
  System.out.print(n.data + " ");
}

void rightSubtree(Node n) {
  if ( n == null) return;
  System.out.print(n.data + " ");
  rightSubtree(n.right);
}

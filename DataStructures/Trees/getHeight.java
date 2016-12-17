/*
   class Node
   int data;
   Node left;
   Node right;
   */
static int getHeight(Node root) {
  return traverseHelper(root);
}

// must check if both children are 0 -> traversal finished
static int traverseHelper(Node n) {
  if ( n == null || (n.left == null && n.right == null)) return 0;
  return 1+Math.max(traverseHelper(n.left), traverseHelper(n.right));
}

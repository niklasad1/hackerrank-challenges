/* Node is defined as :
   class Node
   int data;
   Node left;
   Node right;

*/

static Node Insert(Node root,int value)
{
  root = insertHelper(root, value);
  return root;
}

static Node insertHelper(Node node, int value) {
  /* base case add a new node */
  if ( node == null)
  {
    Node newNode = new Node();
    newNode.data = value;
    newNode.right = null;
    newNode.left = null;
    return newNode;
  }

  /* go right */
  if ( value > node.data)
  {
    node.right = insertHelper(node.right, value);
  }
  /* go left */
  else if( value < node.data)
  {
    node.left = insertHelper(node.left, value);
  }
  /* already in the tree  */
  return node;
}

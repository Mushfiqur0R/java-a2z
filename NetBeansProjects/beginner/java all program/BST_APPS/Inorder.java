
package BST_APPS;


public class Inorder {
    int item;
  Inorder left, right;

  public Inorder(int key) {
  item = key;
  left = right = null;
  }
}
//class Node {
//  int item;
//  Node left, right;
//
//  public Node(int key) {
//  item = key;
//  left = right = null;
//  }
//}
class Tree {
  // root of Tree
  Inorder root;

  Tree() {
  root = null;
  }
  void inOrder(Inorder node) {
    if (node == null)
      return;

    // traverse the left child
    inOrder(node.left);

    // traverse the root node
    System.out.print(node.item + "->");

    // traverse the right child
    inOrder(node.right);
  }
    public static void main(String[] args) {
         // create an object of Tree
    Tree tree = new Tree();

    // create nodes of tree
    tree.root = new Inorder(1);
    tree.root.left = new Inorder(12);
    tree.root.right = new Inorder(9);

    // create child nodes of left child
    tree.root.left.left = new Inorder(5);
    tree.root.left.right = new Inorder(6);

    System.out.println("In Order traversal");
    tree.inOrder(tree.root);
    }
}


  

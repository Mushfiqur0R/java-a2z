package BST_APPS;

class Node {

    int data;
    Node left;
    Node right;

}

class BST {

    public Node createNewNode(int k) {
        Node a = new Node();
        a.data = k;
        a.left = null;
        a.right = null;
        return a;
    }

    public Node Insert(Node node, int val) {
        if (node == null) {
            return createNewNode(val);
        }
        if (val < node.data) {
            node.left = Insert(node.left, val);
        } else if (val > node.data) {
            node.right = Insert(node.right, val);
        }
        return node;
        //Deletion a node element.....
    }    
    public Node delete(Node node, int val) {
        if (node == null) {
            return null;
        }
        if (val < node.data) {
            node.left = delete(node.left, val);
        } else if (val > node.data) {
            node.right = delete(node.right, val);
        } else {
            if (node.left == null || node.right == null) {
                Node temp = null;
                temp = node.left == null ? node.right : node.left;

                if (temp == null) {
                    return null;
                } else {
                    return node;
                }
            }else{
                Node successor=getSuccessor(node);
                node.data=successor.data;
                
                 //Delete node element.........
                
                node.right=delete(node.right,3);
                return node;
            }
        }
        return node;
    }
    public Node getSuccessor(Node node){
        if (node==null){
            return null;
        }
        Node temp=node.right;
        while (temp!=null){
            temp=temp.left;
        }
        return temp;
    }

}





public class Bst_1 {

    public static void main(String[] args) {
        BST a = new BST();
        Node root = null;
        root = a.Insert(root, 9);
        root = a.Insert(root, 4);
        root = a.Insert(root, 3);
        root = a.Insert(root, 5);
        root = a.Insert(root, 10);
        
        // Delete node........
        root=a.delete(root, 3);

//        a.Insert(root, 8);
//        a.Insert(root, 5);
    }

}



class BinarySearchTree {
	class Node {
		int key;
		Node left, right;

		public Node(int item)
		{
			key = item;
			left = right = null;
		}
	}
	Node root;
	BinarySearchTree() { root = null; }

	BinarySearchTree(int value) { root = new Node(value); }
	void insert(int key) { root = insertRec(root, key); }
	Node insertRec(Node root, int key)
	{
		if (root == null) {
			root = new Node(key);
			return root;
		}
		if (key < root.key)
			root.left = insertRec(root.left, key);
		else if (key > root.key)
			root.right = insertRec(root.right, key);
		return root;
	}
	void inorder() { inorderRec(root); }
	void inorderRec(Node root)
	{
		if (root != null) {
			inorderRec(root.left);
			System.out.println(root.key);
			inorderRec(root.right);
		}
	}
	public static void main(String[] args)
	{
		BinarySearchTree tree = new BinarySearchTree();
		tree.insert(50);
		tree.insert(30);
		tree.insert(20);
		tree.insert(40);
		tree.insert(70);
		tree.insert(60);
		tree.insert(80);

		tree.inorder();
	}
}


////////////////////////////////////////////////////////////////////////////

  
import java.lang.*;   
import java.util.*;   
import java.io.*;   
     
class MinimumSpanningTreeExample {   
    private static final int countOfVertices = 9;   
    int findMinKeyVertex(int keys[], Boolean setOfMST[])   
    {    
        int minimum_index = -1;   
        int minimum_value = Integer.MAX_VALUE;  
        for (int vertex = 0; vertex < countOfVertices; vertex++)   
            if (setOfMST[vertex] == false && keys[vertex] < minimum_value) {   
                minimum_value = keys[vertex];   
                minimum_index = vertex;   
            }   
    
        return minimum_index;   
    }    
    void showMinimumSpanningTree(int mstArray[], int graphArray[][])   
    {   
        System.out.println("Edge \t\t Weight");   
        for (int j = 1; j < countOfVertices; j++)   
            System.out.println(mstArray[j] + " <-> " + j + "\t \t" + graphArray[j][mstArray[j]]);   
    }   
    void designMST(int graphArray[][])   
    {   
        int mstArray[] = new int[countOfVertices];   
        int keys[] = new int[countOfVertices];     
        Boolean setOfMST[] = new Boolean[countOfVertices];    
        for (int j = 0; j < countOfVertices; j++) {   
            keys[j] = Integer.MAX_VALUE;   
            setOfMST[j] = false;   
        }   
        keys[0] = 0; 
        mstArray[0] = -1; 
        for (int i = 0; i < countOfVertices - 1; i++) { 
            int edge = findMinKeyVertex(keys, setOfMST);     
            setOfMST[edge] = true;    
            for (int vertex = 0; vertex < countOfVertices; vertex++)   
                if (graphArray[edge][vertex] != 0 && setOfMST[vertex] == false && graphArray[edge][vertex] < keys[vertex]) {   
                    mstArray[vertex] = edge;   
                    keys[vertex] = graphArray[edge][vertex];   
                }   
        }      
        showMinimumSpanningTree(mstArray, graphArray);   
    }   
    public static void main(String[] args)   
    {   
          
        MinimumSpanningTreeExample mst = new MinimumSpanningTreeExample();   
        int graphArray[][] = new int[][]{{ 0, 4, 0, 0, 0, 0, 0, 8, 0 },   
                    { 4, 0, 8, 0, 0, 0, 0, 11, 0 },   
                    { 0, 8, 0, 7, 0, 4, 0, 0, 2 },   
                    { 0, 0, 7, 0, 9, 14, 0, 0, 0 },   
                    { 0, 0, 0, 9, 0, 10, 0, 0, 0 },  
                    { 0, 0, 4, 14, 10, 0, 2, 0, 0 },  
                    { 0, 0, 0, 0, 0, 2, 0, 1, 6 },  
                    { 8, 11, 0, 0, 0, 0, 1, 0, 7 },  
                    { 0, 0, 2, 0, 0, 0, 6, 7, 0 }};    
        mst.designMST(graphArray);   
    }   
}  


////////////////////////////////////////////////////////////////////////////////


// Kruskal's algorithm in Java

import java.util.*;

class Graph {
  class Edge implements Comparable<Edge> {
    int src, dest, weight;

    public int compareTo(Edge compareEdge) {
      return this.weight - compareEdge.weight;
    }
  };

  // Union
  class subset {
    int parent, rank;
  };

  int vertices, edges;
  Edge edge[];

  // Graph creation
  Graph(int v, int e) {
    vertices = v;
    edges = e;
    edge = new Edge[edges];
    for (int i = 0; i < e; ++i)
      edge[i] = new Edge();
  }

  int find(subset subsets[], int i) {
    if (subsets[i].parent != i)
      subsets[i].parent = find(subsets, subsets[i].parent);
    return subsets[i].parent;
  }

  void Union(subset subsets[], int x, int y) {
    int xroot = find(subsets, x);
    int yroot = find(subsets, y);

    if (subsets[xroot].rank < subsets[yroot].rank)
      subsets[xroot].parent = yroot;
    else if (subsets[xroot].rank > subsets[yroot].rank)
      subsets[yroot].parent = xroot;
    else {
      subsets[yroot].parent = xroot;
      subsets[xroot].rank++;
    }
  }

  // Applying Krushkal Algorithm
  void KruskalAlgo() {
    Edge result[] = new Edge[vertices];
    int e = 0;
    int i = 0;
    for (i = 0; i < vertices; ++i)
      result[i] = new Edge();

    // Sorting the edges
    Arrays.sort(edge);
    subset subsets[] = new subset[vertices];
    for (i = 0; i < vertices; ++i)
      subsets[i] = new subset();

    for (int v = 0; v < vertices; ++v) {
      subsets[v].parent = v;
      subsets[v].rank = 0;
    }
    i = 0;
    while (e < vertices - 1) {
      Edge next_edge = new Edge();
      next_edge = edge[i++];
      int x = find(subsets, next_edge.src);
      int y = find(subsets, next_edge.dest);
      if (x != y) {
        result[e++] = next_edge;
        Union(subsets, x, y);
      }
    }
    for (i = 0; i < e; ++i)
      System.out.println(result[i].src + " - " + result[i].dest + ": " + result[i].weight);
  }

  public static void main(String[] args) {
    int vertices = 6; // Number of vertices
    int edges = 8; // Number of edges
    Graph G = new Graph(vertices, edges);

    G.edge[0].src = 0;
    G.edge[0].dest = 1;
    G.edge[0].weight = 4;

    G.edge[1].src = 0;
    G.edge[1].dest = 2;
    G.edge[1].weight = 4;

    G.edge[2].src = 1;
    G.edge[2].dest = 2;
    G.edge[2].weight = 2;

    G.edge[3].src = 2;
    G.edge[3].dest = 3;
    G.edge[3].weight = 3;

    G.edge[4].src = 2;
    G.edge[4].dest = 5;
    G.edge[4].weight = 2;

    G.edge[5].src = 2;
    G.edge[5].dest = 4;
    G.edge[5].weight = 4;

    G.edge[6].src = 3;
    G.edge[6].dest = 4;
    G.edge[6].weight = 3;

    G.edge[7].src = 5;
    G.edge[7].dest = 4;
    G.edge[7].weight = 3;
    G.KruskalAlgo();
  }
}
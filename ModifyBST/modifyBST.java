class Node { 

	int value; 
    Node leftChild;
    Node rightChild; 

	Node(int values) 
	{ 
		value = values; 
        leftChild = null;
        rightChild = null; 
	} 
} 

class BSTModify { 

	Node root; 

	BSTModify() 
	{ 
		root = null; 
	} 

    public class Sum 
    { 
		int sum = 0; 
	} 

	void modifyBSTUtil(Node node, Sum sumGreater) 
	{ 
		if (node == null) return; 
            
		this.modifyBSTUtil(node.rightChild, sumGreater); 
		
		sumGreater.sum = sumGreater.sum + node.value; 
		node.value = sumGreater.sum; 
		
		this.modifyBSTUtil(node.leftChild, sumGreater); 
	} 

	void modifyBST(Node node) 
	{ 
		Sum sumGreater = new Sum(); 
		this.modifyBSTUtil(node, sumGreater); 
	} 

	public static void main(String[] args) 
	{ 
        System.out.println("Hello modified BST in JAVA!");
        System.out.println(" ");

        Node tree = new Node(5);
        tree.rightChild = new Node(7);
        tree.rightChild.leftChild = new Node(6);
        tree.rightChild.rightChild = new Node(8);
        tree.leftChild = new Node(3);
        tree.leftChild.rightChild = new Node(4);
        tree.leftChild.leftChild = new Node(2);

        System.out.println("Initial Binary Search Tree example:");
        System.out.println("          " + tree.value);
        System.out.println("         /  \\");
        System.out.println("        "+tree.leftChild.value+"     "+tree.rightChild.value);
        System.out.println("       / \\   / \\");
        System.out.println("      "+tree.leftChild.leftChild.value+"   "+tree.leftChild.rightChild.value+"  "+tree.rightChild.leftChild.value+"   "+tree.rightChild.rightChild.value);

        System.out.println("\n");
        System.out.println("After modify on binary search tree:");

        BSTModify bstModify = new BSTModify();
        bstModify.modifyBST(tree);

        System.out.println("          " + tree.value);
        System.out.println("         /  \\");
        System.out.println("        "+tree.leftChild.value+"     "+tree.rightChild.value);
        System.out.println("       / \\     / \\");
        System.out.println("      "+tree.leftChild.leftChild.value+"  "+tree.leftChild.rightChild.value+"  "+tree.rightChild.leftChild.value+"  "+tree.rightChild.rightChild.value);
	} 
} 

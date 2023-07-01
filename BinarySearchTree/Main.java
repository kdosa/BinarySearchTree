package tree;

public class Main {
	public static void main(String [] arg)
	{
	
	BinarySearchTree tree = new BinarySearchTree();
	
	System.out.println(tree.about());
	
	tree.add(50);
	tree.add(89);
	tree.add(63);
	tree.add(100);
	tree.add(79);
	tree.add(55);
	tree.add(34);
	
	
	tree.print();
	
	//ee.find(4);

	System.out.println(tree.find(50));
	System.out.println(tree.find(89));
	System.out.println(tree.find(63));
	System.out.println(tree.find(10));
	

	}
}

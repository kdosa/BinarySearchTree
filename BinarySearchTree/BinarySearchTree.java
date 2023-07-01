package tree;

public class BinarySearchTree {
	
	private Node root;

BinarySearchTree()
{
	root = null;
}
	
String about()
{
	String info;
	info = "Binary Search Tree";
	return info;
}
	
void add(double value)
{
	if(root == null)
		root = new Node(value);
	else
		root.add(value);
}

void print()
{
	root.print(0);
}

boolean find(double num)
{

	while(root!= null)
	{

		if(num == root.value)
			return true;
		else if(num < root.value)
		{

			root = root.left;
		}
		else
		{
		
			root = root.right;
		}
	}
	return false;
	
	
}

}


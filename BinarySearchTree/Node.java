package tree;

public class Node {

	double value;
	Node left;
	Node right;
	
	Node(double val)
	{
		value = val;
		left = null;
		right = null;
	}
	
void add(double num)
{
	if(value > num)
	{
		if(left != null)
			left.add(num);
		else
		{
			left = new Node(num);
		}
	}
	
	if(value < num)
	{
		if(right != null)
			right.add(num);
		else
		{
			right = new Node(num);
		}
	}

}

void print(int indent)
{
	
	for(int i = 0; i < indent * 2; i++)
	{
		System.out.print(" ");
	}
	
	System.out.println("+-- " + value + "\n");
	
	if(left != null)
		left.print(indent + 1);
	if(right != null)
		right.print(indent + 1);
	
}
	

}

public class BinNode
{
	public char value;
	public BinNode left;
	public BinNode right;

	public static int treeHeight (BinNode current)
	{
	// Consider the base condition of there being no more child nodes
	if (current == null)
	{
		return 0;
	}
	// We must find the maximum height of the tree, follow the child with the greater height
	return 1 + Math.max(treeHeight(current.left), treeHeight(current.right));
	}
}

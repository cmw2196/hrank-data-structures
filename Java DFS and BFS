// DFS to see if there is a path between node A and node root

public class Node{
	int data;
	boolean visited;
	node[] children;

	public node(data, node[] kids){
		this.data = data;
		this.visited = false;
		for (node:kids){
			children.append(node);
		}
	}
}
		

// recursive DFS

public static boolean DFS(Node root, int val){
	if (root == null){
		return false;
	} else if (root.data == val){
		return true;
	} else {
		node.visited == true;
		for (node : root.children){
			if (node.visited == true){
				DFS(node, val)
			}
		}
	}
	return false;
}

	
//iterative DFS 

public static boolean DFS(Node root, int val){
	if (root == null){
		return false;
	} else if (root == val){
		return true;
	} else {
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(root);
		root.visited = true;
		while (!stack.isEmpty()){
			curr = stack.pop()
			for (node : curr.children){
				if (node.data == val){
					return true;
				}
				if (!node.visited){
					node.visited = true;
					stack.push(node);
				}
				
			}
		}
	}
	return false;
}



//BFS

public static boolean BFS(Node root, int val){
	if (root == null){
		return false;
	} else if (root == val){
		return true;
	}
	
	Queue<Node> bfsQueue = new LinkedList<Node>();
	root.visited = true;
	bfsQueue.addLast(root);
	while (bfsQueue.size() > 0){
		Node curr = bfsQueue.removeFirst();
		if (curr.data == val){ return true;}
		for (node in curr.children){
			if (!node.visited){
				node.visited = true;
				bfsQueue.addLast(node);
			}
		}
	}
	return false;
}

	

class BSTNode:
	def __init__(self, data, left=None, right=None):
		self.data = data
		self.left = left
		self.right = right
			
	def set_right_child(data):
		self.right = BSTNode(data)
	
	def set_left_child(data):
		self.left = BSTNode(data)
		
class Node:
	def __init__(self, data, children):
		self.data = data
		self.children = children
		self.visited = False
		
		
def find_route_between_nodes(graph, node1, node2):
	"""Find a route between two nodes in a graph represented by a dict mapping {node: [neighbors]}."""
	return (node1 in graph.get(node2) or node2 in graph.get(node1))
	

def create_bst(element_list):
	"""Create a binary search tree with minimal height from a sorted, increasing list of unique ints."""
	if not len(element_list):
		raise AssertionError('Please supply a list of ints to create a BST from')
		
	root = TreeNode(element_list.pop())
	node_queue = [root] 
	node = node_queue.pop()
	while len(element_list):
		if node.left == None:
			node.set_left_child(element_list.pop())
			node_queue.append(node.left)
		elif node.right == None:
			node.set_right_child(element_list.pop())
			node_queue.append(node.right)
		else:
			node = node_queue.pop()
			
	return root
	
	
	
def bfs(root_node):
	"""Breadth first search for a root node of class Node."""
	if not root_node.data:
		return None
	
	node_queue = root_node.children
	while len(node_queue):
		node = node_queue.pop()
		for child in node.children:
			child.visited = True
			print child.data
			node_queue.extend([c for c in child.children if c.visited is False])
	return


def _get_children(node):
	"""Return children of a node."""
	return [c for c in node.children if c.visited is False]


def dfs(root_node):
	"""Depth-first search for a root node of class Node."""
	print root_node.data
	root_node.visited = True
	if not _get_children(root_node):
		return
	for child in root_node.children:
		dfs(child)
		
		
		
	

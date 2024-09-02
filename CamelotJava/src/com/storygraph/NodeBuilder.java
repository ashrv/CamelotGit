package com.storygraph;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
/**
 * Use this class to implement the nodes of your storygraph
 * @author Alireza Shirvani
 *
 */
public abstract class NodeBuilder implements Builder {
	List<Node> nodes;
	public NodeBuilder(List<Node> nodes) {
		this.nodes = nodes;
	}
	
	public void build() throws InvocationTargetException, IllegalAccessException, IllegalArgumentException {
		for (Method method : getClass().getMethods()) {
			  if(method.isAnnotationPresent(BuilderMethod.class)){
				  method.invoke(this);
			  }
		}
	}
	/**
	 * Use this method to get a reference to any of the nodes in your storygraph
	 * @param name The label of the node you need a reference to
	 * @return An reference of type node to the specified node in the storygraph
	 */
	protected Node get(String name) {
		var result = nodes.stream().filter(z->z.toString().equals(name)).findAny();
		return result.isPresent()?result.get():null;
	}

	
	
}

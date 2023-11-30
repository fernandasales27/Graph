package graph;

public class Main {

	public static void main(String[] args) {
		
		try {
			Graph graph = new Graph(20);
	
			graph.addEdge(1, 2);
			graph.addEdge(2, 1);
			graph.addEdge(2, 5);
			graph.addEdge(3, 7);
			graph.addEdge(3, 9);
			
			//graph.print();
			//graph.removeEdge(0, 1);
			graph.print();
		
		//graph.print();
		/*
		graph.addEdge(1, 3);
		graph.addEdge(2, 4);
		graph.print();
		System.out.println(graph.isEdgeValid(2, 4));
		
		graph.listVertices();
		graph.removeEdge(5, 4);
		System.out.println(graph.isEdgeValid(2, 4));
		graph.print();
		System.out.println(graph.numVertices);*/
		graph.listAdjacentsVertices(3);

	}catch (Exception E) {
		System.out.println(E.getMessage());
	}
	}
}
